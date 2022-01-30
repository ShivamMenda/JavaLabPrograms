package com.company;


import java.util.Scanner;

class info
{
    String name;
    int code;
    int price;
    int quantity;
    int tot;
}




public class Book {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n;
        info[] b=new info[10];
        System.out.print("Enter the number of books(max 10):");
        n=scanner.nextInt();
        for (int i = 0; i < n; i++) {
            b[i]=new info();
            System.out.println("For Book "+(i+1));
            System.out.print("Enter name:");
            b[i].name=scanner.next();
            System.out.print("Enter code:");
            b[i].code=scanner.nextInt();
            System.out.print("Enter price:");
            b[i].price=scanner.nextInt();
            System.out.print("Enter quantity:");
            b[i].quantity=scanner.nextInt();
            b[i].tot=b[i].quantity*b[i].price;

        }
        System.out.println("Name "+ "\t" +"Code "+ "\t" +"Price "+ "\t" +"Quantity "+ "\t" +"Total price");
        for (int i = 0; i <n ; i++) {
            System.out.println(b[i].name+ "\t" + "\t" +b[i].code+ "\t" + "\t" +b[i].price+ "\t" + "\t" +b[i].quantity+ "\t" + "\t" + "\t"+b[i].tot);
        }

    }
}
