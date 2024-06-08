/*
1. Define a class Person (id, name, dateofbirth). For dateofbirth create an object of MyDate
class which is created in SET A 4. Define default and parameterized constructor. Also
define accept and display function in Person and MyDate class. Call constructor and
function of MyDate class from Person class for dateofbirth. Generate id automatically
using static variable. Accept the details of n person and display the details.
Sample code:
public class Person
{
private int id;
private String name;
private MyDate dob;
private static int cnt=1;
-------
-------
}
*/

package SetC; // create a java project and package with name SetC
import java.lang.*;
import java.util.*;
//import java.io.*;
import SetC.MyDate;  // add the MyDate.java to the package 

class Perobj{ 
    // class to get Return object 
    public String Name; MyDate date;
    public Perobj(){
//        this.Name=n;
//        this.date=d;
    }
    public Perobj(String n,MyDate d){
        this.Name=n;
        this.date=d;
    }
}

public class Person { // create the Person.java in package
    private int id;String name;MyDate dob;
    private static int cnt=0; // static var
    public Perobj object;
    public static void counter(){
        cnt++;
    }
    public static void showCount(){
        System.out.println("Number of Person's:"+cnt);
    }
    public String generate(){
        Random rand=new Random();
        int var=rand.nextInt(1, 1000);
        String str=Integer.toString(var)+Integer.toString(cnt);
        return str;
    }
    public Person(){
        //default Constructor
        this.id=0;
        this.name="None";
        this.dob=new MyDate(0,0,0);
        this.counter();
    }
    public Person(int id,String name,int d,int m,int y){
        //Parametrized Constructor
        this.id=Integer.valueOf(generate());
        this.name=name;
        this.dob=new MyDate(d,m,y);
        this.counter();
    }
    public Person(Perobj obj){
        obj=Accept();
        this.id=Integer.valueOf(generate()); // to modify 
        this.dob=obj.date;
        this.name=obj.Name;
        this.counter();
    }
    public Perobj Accept(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Person Details");
        System.out.println("Person name:");
        String name=sc.next();
//        System.out.println("Person Dob:");
//        String input=sc.next();
//        String[] arr=input.split(" ");
//        int[] date=new int[3];
//        for(int i=0;i<arr.length;i++){
//            for(int j=i;j<date.length;j++){
//                date[j]=Integer.parseInt(arr[i]);
//                System.out.println("date[j]"+date[j]);
//            }
//        }
//        MyDate dob=new MyDate(date[0],date[1],date[2]);
        System.out.println("Person Dob:");
        System.out.println("Enter day:");
        int d=sc.nextInt();
        System.out.println("Enter month:");
        int m=sc.nextInt();
        System.out.println("Enter year:");
        int y=sc.nextInt();
        MyDate dob=new MyDate(d,m,y);
        Perobj obj=new Perobj(name,dob);
        return obj;
    }
    public void display(){
        System.out.println("Person Details:");
        System.out.println("Person id:"+this.id);
        System.out.println("Person name:"+this.name);
        System.out.println("Person Dob:"+this.dob.showDate());
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Person's:");
        int n=sc.nextInt();
        Person[] p=new Person[n];
        for(int i=0;i<n;i++){
            Perobj obj=new Perobj(); // empty obj created and passed to constructor
            p[i]= new Person(obj);
        }
        for(int i=0;i<n;i++){
          p[i].display();
        }
        Person.showCount();
    }
}
