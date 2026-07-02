// A 2D Array stores data in rows and columns.
// It is also called a Matrix.
//  Stores same type of data.
//  Uses rows and columns.
//  Uses two indexes.
//  Access using row and column.
// dataType[][] arrayName = new dataType[rows][columns];
// int[][] arr = new int[3][3];

import java.util.Scanner;
public class Arrays2D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();

            }
        }

        System.out.println("Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();

        }
        sc.close();
    }
}
