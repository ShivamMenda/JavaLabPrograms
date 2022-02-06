package com.company;
import java.util.*;


class fibonacci {
    int n;
    int fib(int n){
        if (n==0){
            return 0;
        }
        else if (n==1){
            return 1;
        }
        else {
            return fib(n-1)+fib(n-2);
        }
    }

}

public class fib {
    public static void main(String[] args){
       fibonacci f=new fibonacci();
       Scanner S=new Scanner(System.in);
       System.out.print("Enter Number of terms:");
       f.n=S.nextInt();
       for (int i=0;i<f.n;i++){
           System.out.println(f.fib(i)+" ");
       }
    }
}
