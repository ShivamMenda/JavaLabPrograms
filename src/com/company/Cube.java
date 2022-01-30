package com.company;
import java.util.*;

class data{
    int a;
    int b;
    int c;
    float v;
    float area;

    void read(){
       Scanner scanner=new Scanner(System.in);
       System.out.print("Enter side A:");
       a=scanner.nextInt();
       System.out.print("Enter side B:");
       b=scanner.nextInt();
       System.out.print("Enter side C:");
       c=scanner.nextInt();
    }
    void display()
    {
        System.out.println("side A:"+a);

        System.out.println("side B:"+b);

        System.out.println("side C:"+c);

    }
    void volume(){
        if (a==b && b==c){
            v=(float)a*b*c;
            System.out.println("The volume is: "+v);
        }
        else {
            System.out.println("Invalid values,enter equal values");
        }
    }
    void area(){
        if (a==b && b==c){
            area=(float)6*a*b;
            System.out.println("The surface area is: "+area);
        }
        else {
            System.out.println("Invalid values,enter equal values");
        }
    }


}





public class Cube {
    public static void main(String[] args){
        data ob1=new data();
        data ob2=new data();
        data ob3=new data();
        data[] cubes={ob1,ob2,ob3};

        for (int i=0;i<cubes.length;i++){
            System.out.println("For cube "+(i+1));
            cubes[i].read();
            cubes[i].display();
            System.out.println("The Volume is:");
            cubes[i].volume();
            System.out.println("The Area is:");
            cubes[i].area();

        }
    }
}
