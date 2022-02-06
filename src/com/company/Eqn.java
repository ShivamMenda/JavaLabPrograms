package com.company;

import java.util.Scanner;

public class Eqn {
    public static void main(String[] args) {
        double a,b,c;
        double root1=0;
        double root2=0;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter value of a:");
        a=scanner.nextDouble();
        System.out.print("Enter value of b:");
        b=scanner.nextDouble();
        System.out.print("Enter value of c:");
        c=scanner.nextDouble();
        double disc=b*b-4*a*c;
        if (disc<0)
        {
            System.out.println("Roots are imaginary");
            System.exit(1);
        }
        if (disc==0)
        {
            System.out.println("Roots are equal");
            root1=-b/2*a;
            root2=-b/2*a;
        }
        if (disc>0)
        {
           root1=(-b + Math.sqrt(disc)) / (2 * a);
           root2=(-b - Math.sqrt(disc)) / (2 * a);
        }
        System.out.println("The roots are:");
        System.out.println("Root1:"+root1);
        System.out.println("Root2:"+root2);
    }
}
