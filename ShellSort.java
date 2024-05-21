package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class ShellSort {
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
        int h = n / 2;
        int t = 0;
        while (h > 0) {
            for (int i = h; i < n; i++) {
                /*if (a[i] > a[i + h]) {
                    t = a[i];
                    a[i] = a[i + h];
                    a[i + h] = t;
                }*/
                int j=0;
                int temp = a[i];
                for (j = i; j >= h && a[j - h] > temp; j -= h)
                    a[j] = a[j - h];
                a[j] = temp;
            }
            h /= 2;
        }
        System.out.println("After sorting the array is: " + Arrays.toString(a));
    }
}
