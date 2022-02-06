package com.company;


import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        int n;
        int i,j;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of lines:");
        n= scanner.nextInt();
        for (i = 1; i <=n; i++) {
            for (j = 1;  j<=(n-i) ; j++) {
                System.out.print(" ");
            }
                for ( int k = 1; k <=(2*i-1); k++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }


        }
    }

