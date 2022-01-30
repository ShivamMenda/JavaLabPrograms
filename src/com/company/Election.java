package com.company;

import java.util.Scanner;

public class Election {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int s=0;
        System.out.print("Enter the number of ballots:");
        int n=scanner.nextInt();
        int[] count=new int[5];
        for (int i = 0; i < n; i++) {
            System.out.println("Choose your candidate:");
            int ch=scanner.nextInt();
            switch (ch) {
                case 1 -> count[0]++;
                case 2 -> count[1]++;
                case 3 -> count[2]++;
                case 4 -> count[3]++;
                case 5 -> count[4]++;
                default -> s++;
            }
            System.out.println("Vote casted Successfully");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Candidate"+(i+1)+":"+count[i]);
        }
        System.out.println("The spoilt ballots are "+s);
    }
}
