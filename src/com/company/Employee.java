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
    double add;

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
        if (gross_pay<=200000){
            income_tax=0;
            net_pay=gross_pay-income_tax;
        }
        else if (gross_pay>=200000 && gross_pay<=300000)
        {
            income_tax=0.10*gross_pay;
            net_pay=gross_pay-income_tax;
        }
        else if (gross_pay>=300000 && gross_pay<=500000)
        {
            income_tax=0.15*gross_pay;
            net_pay=gross_pay-income_tax;
        }
        else
        {
            income_tax=0.30*gross_pay;
            add=0.20*income_tax;
            net_pay=gross_pay-income_tax-add;
        }

        return net_pay;
    }
    void disp(){
        System.out.println("Name:"+name);
        System.out.println("ID:"+empid);
        System.out.println("Gender:"+gender);
        System.out.println("Basic pay:"+basic_pay);
        System.out.println("The net pay is "+Net_pay());
    }

}


public class Employee {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of employees:");
        n= scanner.nextInt();
        emp[] emp =new emp[n];
        for (int i = 0; i < n; i++) {
            emp[i]=new emp();
            System.out.println("For Employee "+(i+1));
            emp[i].input_details();
            emp[i].Net_pay();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("------DETAILS OF EMPLOYEE "+(i+1)+" ------");
            emp[i].disp();
        }
    }
}
