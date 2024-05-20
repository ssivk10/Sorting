package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
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
        int t = 0;
        for (int i = 1; i < n; i++) {
            int x = a[i];
            int j = i - 1;
            while (j >= 0) {
                if (x < a[j]) {
                    a[j + 1] = a[j];
                    j--;
                } else break;
            }
            a[j+1]=x;
        }
        System.out.println("After sorting the array is: " + Arrays.toString(a));
    }
}
