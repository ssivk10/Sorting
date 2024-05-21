package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        sc.nextLine();
        int[] a = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("Before sorting the array is: " + Arrays.toString(a));
        mergeSort(a, 0, n - 1);
        System.out.println("After sorting the array is: " + Arrays.toString(a));
    }

    public static void mergeSort(int[] a, int low, int high) {
        if (low < high) {

            int mid = (low + high) / 2;
            mergeSort(a, low, mid);
            mergeSort(a, mid + 1, high);
            merge(a, low, mid, high);

        }
    }

    public static void merge(int[] a, int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;
        int[] a1 = new int[n1];
        int[] a2 = new int[n2];
        for (int i = 0; i < n1; i++)
            a1[i] = a[low + i];
        for (int i = 0; i < n2; i++)
            a2[i] = a[mid + i + 1];
        int i = 0, j = 0, k = low;
        while (i < n1 && j < n2) {
            if (a1[i] < a2[j]) {
                a[k++] = a1[i++];
            } else {
                a[k++] = a2[j++];
            }
        }
        while (i < n1)
            a[k++] = a1[i++];
        while (j < n2)
            a[k++] = a2[j++];
    }
}
