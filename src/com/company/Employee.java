package com.company;
import java.util.*;

class emp
{
    int empid;
    String name;
    char gender;
    double basic_pay;
    double hra;
    double da;
    double income_tax;
    double net_pay;
    double gross_pay;

    emp()
    {
        empid=0;
        name="";
        gender='0';
        hra=0.0;
        da=0.0;
        income_tax=0.0;
        net_pay=0.0;
        gross_pay=0.0;

    }

    void input_details()
    {
     Scanner scanner=new Scanner(System.in);
     System.out.print("Enter empid: ");
     empid=scanner.nextInt();
     System.out.print("Enter name: ");
     name=scanner.next();
     System.out.print("Enter gender: ");
     gender=scanner.next().charAt(0);
     System.out.print("Enter basic pay: ");
     basic_pay=scanner.nextInt();
    }
    double Net_pay()
    {
        hra=((0.18)*basic_pay);
        da= ((0.45)*basic_pay);
        gross_pay=basic_pay+hra+da;
        income_tax=(0.075)*gross_pay;
        net_pay=gross_pay-income_tax;
        return net_pay;
    }
    void disp(){
        System.out.println("------DETAILS------");
        System.out.println("Name:"+name);
        System.out.println("ID:"+empid);
        System.out.println("Gender:"+gender);
        System.out.println("Basic pay:"+basic_pay);
        System.out.println("The net pay is "+Net_pay());
    }

}


public class Employee {
    public static void main(String[] args){
        emp ob1=new emp();
        ob1.input_details();
        ob1.disp();
    }
}
