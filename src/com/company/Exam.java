package com.company;
import java.util.*;


class student{
    int rn;
    int sub1;
    int sub2;
    int sub3;
    int tot;
}

public class Exam {

    public static void main(String[] args) {
       student[] s=new student[20];
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=scanner.nextInt();
       for (int i=0;i<n;i++){
           s[i]=new student();
           System.out.print("Enter roll no of "+(i+1)+":");
           s[i].rn=scanner.nextInt();
           System.out.print("Enter sub 1 marks of "+(i+1)+":");
           s[i].sub1=scanner.nextInt();
           System.out.print("Enter sub 2 marks of "+(i+1)+":");
           s[i].sub2=scanner.nextInt();
           System.out.print("Enter sub 3 marks of "+(i+1)+":");
           s[i].sub3=scanner.nextInt();
           s[i].tot=s[i].sub1+s[i].sub2+s[i].sub3;
       }
        System.out.println("RollNo "+"Total marks");
        for (int i = 0; i <n ; i++) {
            System.out.println(s[i].rn+ "\t" + "\t" +s[i].tot);
        }
        int sub1h=s[0].sub1;
        int sub2h=s[0].sub2;
        int sub3h=s[0].sub3;
        int sub1r=s[0].rn;
        int sub2r=s[0].rn;
        int sub3r=s[0].rn;



        for (int i = 0; i < n; i++) {
            if (sub1h<s[i].sub1)
            {
                sub1h=s[i].sub1;
                sub1r=s[i].rn;
            }
            if (sub2h<s[i].sub2)
            {
                sub2h=s[i].sub2;
                sub2r=s[i].rn;
            }
            if (sub3h<s[i].sub3)
            {
                sub3h=s[i].sub3;
                sub3r=s[i].rn;
            }
        }

        System.out.println("Sub1 high "+sub1h+" with roll no "+sub1r);
        System.out.println("Sub2 high "+sub2h+" with roll no "+sub2r);
        System.out.println("Sub3 high "+sub3h+" with roll no "+sub3r);

        






    }
}
