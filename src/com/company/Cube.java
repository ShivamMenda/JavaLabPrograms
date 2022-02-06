package com.company;
import java.util.*;

class data{
    int a;
    float v;
    float area;

    data(int a)
    {
        this.a=a;
    }
    void display()
    {
        System.out.println("side of the cube:"+a);
    }
    void volume()
    {
            v=(float)a*a*a;
            System.out.println("The volume is: "+v);
    }
    void area(){
            area=(float)6*a*a;
            System.out.println("The surface area is: "+area);
    }


}





public class Cube {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n,a;
        System.out.print("Enter number of cubes(max 3):");
        n= scanner.nextInt();
        data cubes[]=new data[n];
        for (int i = 0; i < cubes.length; i++) {
            System.out.print("Enter side for "+(i+1)+"st cube:");
            a=scanner.nextInt();
            cubes[i]=new data(a);
        }

        for (int i=0;i<cubes.length;i++){
            System.out.println("For cube "+(i+1));
            cubes[i].display();
            cubes[i].volume();
            cubes[i].area();

        }
    }
}
