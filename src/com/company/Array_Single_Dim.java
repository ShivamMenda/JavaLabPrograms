package com.company;
import java.util.Scanner;
class Array_Single_Dim
    {
    public static void main (String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Array length: ");
        int len=scan.nextInt();
        int[] arr =new int[len];
        System.out.println("Enter the array elements");
        for(int i=0; i<len; i++)
        {
            arr[i]=scan.nextInt();
        }
        System.out.println("\narray elements are:");
        for(int i=0; i<len; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
