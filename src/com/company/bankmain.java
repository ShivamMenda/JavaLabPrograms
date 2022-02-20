package com.company;

import java.util.Scanner;

abstract class Bank{
    String type;
    Bank(String s){
        type=s;
    }
    abstract void getRoi();
    abstract void deposit();
    abstract void creditcard();
}

class sbi extends Bank{
    sbi(){
        super("National");
    }
    int y;
    int amt;
    double intrst;
    void deposit(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the numbers of years you want to deposit");
        y=s.nextInt();
        System.out.println("Enter the pricipal amount you want to deposit");
        amt=s.nextInt();
    }

    void getRoi(){
        System.out.println("Rate of interest : "+7+" percent");
        if(y>=3){
            intrst=(0.07)*amt;
            System.out.println("interest amount = "+intrst);
        }
        else{
            System.out.println("Minimum 3 years deposit required for interest benefit");
        }
    }

    void creditcard(){
        System.out.println("Bank is national can't offer platinum credit card");
    }
}


class icci extends Bank{
    icci(){
        super("international");
    }
    int y;
    int amt;
    double intrst;
    void deposit(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the numbers of years you want to deposit");
        y=s.nextInt();
        System.out.println("Enter the pricipal amount you want to deposit");
        amt=s.nextInt();
    }

    void getRoi(){
        System.out.println("Rate of interest : "+8+" percent");
        if(y>=3){
            intrst=(0.08)*(double)amt;
            System.out.println("interest amount = "+intrst);
        }

        else{
            System.out.println("Minimum 3 years deposit required for interest benefit");
        }
    }

    void creditcard(){
        System.out.println("Bank is international \nplatinum credit card is being offered");
    }
}

class bankmain{
    public static void main(String[] args){
        Bank ref;
        sbi s=new sbi();
        icci i=new icci();

        ref=s;
        System.out.println("Bank sbi \ntype : "+ref.type);
        ref.deposit();
        ref.getRoi();
        ref.creditcard();

        ref=i;
        System.out.println("Bank icci \ntype : "+ref.type);
        ref.deposit();
        ref.getRoi();
        ref.creditcard();

    }
}
