package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
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
        int temp=0;
        for(int i=0;i<n;i++){
            temp=a[i];
            int ind=i;
            for(int j=i+1;j<n;j++){
                if(a[j]<temp){
                    temp=a[j];
                    ind=j;
                }
            }
            int t = a[i];
            a[i]=a[ind];
            a[ind]=t;
        }
        System.out.println("After sorting the array is: " + Arrays.toString(a));
    }
}
