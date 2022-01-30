package com.company;

import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[][] a;
        a=new int[5][6];
        int x=0,y=0,m=0,n=0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the temp of "+(i+1)+" th city");
            for (int j = 0; j < 6; j++) {
                System.out.print("on "+(j+1)+" th day");
                a[i][j]= scanner.nextInt();
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("The temp of "+(i+1)+" th city");
            for (int j = 0; j < 6; j++) {
                System.out.print("on "+(j+1)+" th day:  ");
                System.out.print(""+a[i][j]);

            }
            System.out.println(" ");
        }

        int low=100,high=0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                if (high<a[i][j]){
                    high=a[i][j];
                    m=i;
                    n=j;
                }
                if (low>a[i][j]){
                    low=a[i][j];
                    x=i;
                    y=j;
                }
            }

        }
        System.out.println("The highest temperature is recorded by "+(m+1)+" th city on "+(n+1)+" th day");
        System.out.println("The lowest temperature is recorded by "+(x+1)+" th city on "+(y+1)+" th day");

    }
}
