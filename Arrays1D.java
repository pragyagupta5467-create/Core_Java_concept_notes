// A 1D Array is a collection of elements of the same data type.
// It stores data in a single row and uses one index.
//  Stores same type of data.
//  Index starts from 0.
//  Fixed size after creation.
//  Fast access using index.
// Syntax:
// dataType[] arrayName = new dataType[size];
// int[] arr = new int[5];

import java.util.Scanner;
public class Arrays1D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Elements:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
