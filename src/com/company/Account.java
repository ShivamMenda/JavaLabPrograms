package com.company;
import java.util.*;

import static java.lang.System.exit;

class info{
    String name;
    int num;
    String type;
    int bal;
    static int count=0;
    info(int num,int bal,String name,String type)
    {
        this.num=num;
        this.bal=bal;
        this.name=name;
        this.type=type;
        count=count+1;
    }
    static int acc()
    {
        int accnum;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter account index(0-4):");
        accnum= scanner.nextInt();
        return accnum;
    }

    int dep()
    {
        Scanner scanner=new Scanner(System.in);
        int amt;
        System.out.print("Enter amount to dep:");
        amt= scanner.nextInt();
        bal=bal+amt;
        System.out.println(amt+" Deposited");
        return bal;
    }
    int rem()
    {
        Scanner scanner=new Scanner(System.in);
        int amount;
        System.out.print("Enter amount to withdraw");
        amount=scanner.nextInt();
        if (bal<=0)
        {
            System.out.println("Account empty");
            return 0;
        }
        else
        {
            bal=bal-amount;
        }
        System.out.println(amount +" Withdrawn");
        return bal;
    }
   static void getCount()
    {
        System.out.println("The count is: "+count);

    }

    void display()
    {
        System.out.println("Name:"+name);
        System.out.println("Balance:"+ bal);

    }
}

public class Account {
    public static void main(String[] args) {
        int ch, bal, num,n;
        String name, type;
        Scanner scanner = new Scanner(System.in);
        info[] accounts = new info[5];
        System.out.print("Enter number of accounts (max 5):");
        n=scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("For account " + (i + 1));
            System.out.print("Enter name:");
            name = scanner.next();
            System.out.print("Enter num:");
            num = scanner.nextInt();
            System.out.print("Enter type:");
            type = scanner.next();
            System.out.print("Enter balance:");
            bal = scanner.nextInt();
            accounts[i] = new info(num, bal, name, type);
        }


        while (true) {
            System.out.println("-------ACCOUNT DETAILS--------");
            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Display");
            System.out.println("4.Exit bank");
            System.out.println("5.Get count of accounts");
            System.out.print("Enter choice:");
            ch = scanner.nextInt();

            switch (ch) {
                case 1:
                    accounts[info.acc()].dep();
                    break;
                case 2:
                    accounts[info.acc()].rem();
                    break;
                case 3:
                    accounts[info.acc()].display();
                    break;
                case 4:
                   exit(1);
                   break ;
                case 5:
                    info.getCount();
                    break;

            }
        }


    }
}



