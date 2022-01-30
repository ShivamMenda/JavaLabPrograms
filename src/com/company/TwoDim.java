package com.company;

import java.util.Scanner;

public class TwoDim {

    public static void main(String[] args) {

        int row, col;
        int[][] arr;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total number of row : ");
        row = scanner.nextInt();
        System.out.print("Enter the total number of column : ");
        col = scanner.nextInt();
        arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter element for row = " + (i + 1) + " column = " + (j + 1) + " : ");
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Displaying array : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
