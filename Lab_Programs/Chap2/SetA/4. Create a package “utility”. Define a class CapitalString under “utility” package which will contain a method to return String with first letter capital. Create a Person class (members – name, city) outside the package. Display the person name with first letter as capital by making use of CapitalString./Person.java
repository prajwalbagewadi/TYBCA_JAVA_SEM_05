/*
4. Create a package “utility”. Define a class CapitalString under “utility” package which will
contain a method to return String with first letter capital. Create a Person class (members
– name, city) outside the package. Display the person name with first letter as capital by
making use of CapitalString.
*/

import Utility.CapitalString; //import CapitalString class
import java.lang.*;
import java.util.*;
import java.io.*;

public class Person{
    private String name;
    private String city;
    public Person(String n,String c){
        CapitalString obj1=new CapitalString(n);
        this.name=obj1.getResult();
        CapitalString obj2=new CapitalString(c);
        this.city=obj2.getResult();
    }
    public void PersonDisp(){
        System.out.println("Person Details:");
        System.out.println("Person_Name:"+this.name);
        System.out.println("Person_city:"+this.city);
    }
    public static void main(String[] args){
        String name,city;
        name="prajwal";
        System.out.println("Name:"+name);
        city="pune";
        System.out.println("city:"+city);
        Person obj=new Person(name,city);
        obj.PersonDisp();
    }
}