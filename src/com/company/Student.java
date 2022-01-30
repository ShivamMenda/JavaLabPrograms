package com.company;
import java.util.*;

class stu
{
    int roll_no;
    String name;
    int m1;
    int m2;
    int m3;
    double total;
    double average;

    stu()
    {
        roll_no=0;
        name="";
        m1=0;
        m2=0;
        m3=0;
        total=0;
        average=0;
    }

    void input_details()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Details-:");
        System.out.print("Enter Roll no:");
        roll_no=scanner.nextInt();
        System.out.print("Enter name:");
        name=scanner.next();
        System.out.print("Enter 1st subject marks:");
        m1=scanner.nextInt();
        System.out.print("Enter 2nd subject marks:");
        m2=scanner.nextInt();
        System.out.print("Enter 3rd subject marks:");
        m3=scanner.nextInt();
    }
    double tot(){
        total=m1+m2+m3;
        return total;
    }
    double avg(){
        total= m1+m2+m3;
        average=total/3;
        return average;
    }
    void disp(){
        System.out.println("Name:"+name);
        System.out.println("Roll no:"+roll_no);
        System.out.println("M1:"+m1);
        System.out.println("M2:"+m2);
        System.out.println("M3:"+m3);
        System.out.println("Total:"+tot());
        System.out.println("Average:"+avg());

    }
}

public class Student {
    public static void main(String[] args){
        stu obj=new stu();
        obj.input_details();
        obj.disp();
    }
}
