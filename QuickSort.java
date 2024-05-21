package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
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
        quickSort(a, 0, a.length - 1);
        System.out.println("After sorting the array is: " + Arrays.toString(a));
    }

    static void quickSort(int[] a, int low, int high) {
        if (low >= high)
            return;
        int start = low;
        int end = high;
        int p = a[low];

        while (start < end) {
            while (a[start] < p) {
                start++;
            }
            while (a[end] > p) {
                end--;
            }
            if (start <= end) {
                int t = a[start];
                a[start] = a[end];
                a[end] = t;
            }
        }
        start++;
        end--;
        quickSort(a, low, end);
        quickSort(a, start, high);
    }

}
