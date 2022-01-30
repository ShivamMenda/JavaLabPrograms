package com.company;

import java.util.*;

import static java.lang.System.exit;

class stck{

    int[] stack =new int[10];
    int top;

    stck()
    {
        top=-1;
    }

    void push(int item)
    {
        if (top==9){
            System.out.println("Overflow");
        }
        else
        {
            stack[++top]=item;
        }
    }

    void pop()
    {
        if (top==-1){
            System.out.println("Underflow");

        }
        else
        {
            System.out.println("The popped element is "+stack[top--]);
        }
    }

    void peek()
    {
        if (top==-1)
        {
            System.out.println("Stack empty");

        }
        else
        {
            System.out.println("Top: "+stack[top]);
        }
    }

    void display()
    {
        if (top==-1)
        {
            System.out.println("Stack empty");
        }
        else {
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }
}
public class Stack {
    public static void main(String[] args) {
       stck ob=new stck();
        Scanner scanner=new Scanner(System.in);
       int ch;
        while (true)
        {
            System.out.println("-------STACK(MAX SIZE 10)--------");
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Peek");
            System.out.println("4.Display");
            System.out.println("5.Exit");
            System.out.print("Enter choice:");
            ch=scanner.nextInt();
            switch (ch) {
                case 1 -> {
                    int item;
                    System.out.print("Enter item:");
                    item = scanner.nextInt();
                    ob.push(item);
                }
                case 2 -> ob.pop();
                case 3 -> ob.peek();
                case 4 -> ob.display();
                default -> exit(1);
            }
        }
    }
}
