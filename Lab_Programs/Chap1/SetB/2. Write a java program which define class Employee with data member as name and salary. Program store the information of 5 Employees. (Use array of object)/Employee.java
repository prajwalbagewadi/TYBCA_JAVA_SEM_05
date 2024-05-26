/*
2. Write a java program which define class Employee with data member as name and salary.
Program store the information of 5 Employees. (Use array of object) 
*/

import java.lang.String;
import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class Employee{
    private String name;double sal;
    public static int cnt=0; //static variable 
    public static void counter(){  //static method
        cnt++;
    }
    public static void showCount(){ //static method
        System.out.println("Count="+cnt);
    }
    public Employee(String n, double s){
        this.name=n;
        this.sal=s;
        counter();
    }
    public void disp(){
        System.out.println("Emp Detials:");
        System.out.println("Emp Name="+this.name);
        System.out.println("Emp Sal="+this.sal);
    }


    public static void main(String[] args){
        Employee[] arr=new Employee[5]; //array of objects
        int size=arr.length;
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<size;i++){
            System.out.println("Enter the emp name:");
            String n=sc.next();
            System.out.println("Enter the emp sal:");
            double s=sc.nextDouble();
            arr[i]=new Employee(n,s);
        }

        for(int i=0;i<size;i++){
            arr[i].disp();
        }
        Employee.showCount();
    }
}
