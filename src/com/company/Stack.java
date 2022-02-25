package com.company;

import java.util.*;

class StackException extends Exception {
    StackException(String str) {
        super(str);
    }
}

// We can also use this type of class for exception handling
/*
class StackException extends Exception {
    private final String detail;

    StackException(String a) {
        detail = a;
    }

    public String toString() {
        return "Stack " + detail;
    }
}
*/

class Stack {
    private final int[] stk;
    private int tos;

    Stack(int size) {
        stk = new int[size];
        tos = -1;
    }

    void push(int item) throws StackException {
        if(tos== stk.length-1)
            throw new StackException("Stack Overflow!");
        else
            stk[++tos] = item;
    }

    int pop() throws StackException {
        if(tos < 0)
            throw new StackException("Stack Underflow!");
        else
            return stk[tos--];
    }

    void display() {
        if(tos > -1) {
            System.out.print("Stack elements are: ");
            for(int i = tos; i > -1; i--)
                System.out.print(stk[i] + " ");
        } else
            System.out.println("Stack Underflow!\n");
    }

    void peek() {
        if (tos == -1)
            System.out.println("Stack Underflow!\n");
        else
            System.out.println("Peek element : " + stk[tos]);
    }
 }

 public class DemoStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the stack size: ");
        int size = sc.nextInt();
        Stack stkObj = new Stack(size);
        int ch;

        do {
            System.out.println("\nEnter~\n1. To push\n2. To pop\n3. To get peek element\n4. To display\n0. To Exit");
            System.out.print("Enter your Choice: ");
            ch = sc.nextInt();

            switch(ch) {
                case 1: try {
                        System.out.print("Enter the element: ");
                        stkObj.push(sc.nextInt());
                    } catch (StackException e) {
                        System.err.println("Exception Caught: " + e);
                    }
                    break;

                case 2: try {
                        System.out.println("Popped element: " + stkObj.pop());
                    } catch (StackException e) {
                        System.err.println("Exception Caught: " + e);
                    }
                    break;

                case 3: stkObj.peek(); break;
                case 4: stkObj.display(); break;
                case 0: break;
                default: System.out.println("Invalid Choice!");
            }
        } while(ch != 0);
    }
}
