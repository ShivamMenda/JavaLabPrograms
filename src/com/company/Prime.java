package com.company;
import java.util.*;

public class Prime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int  a,b, i, j, flag = 0;
        System.out.println("Enter the lower bound");
        a = scanner.nextInt();
        System.out.println("Enter the higher bound");
        b = scanner.nextInt();
        System.out.println("The prime numbers between " + " and " + b + " is ");
        for (i = a; i <= b; i++) {
            flag = 1;
            for (j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }

            }
            if (flag == 1) {
                System.out.println(i);
            }

        }
    }
}