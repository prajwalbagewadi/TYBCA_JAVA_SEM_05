/*
2. Write a Java program to create a super class Employee (members – name, salary). Derive
a sub-class as Developer (member – projectname). Derive a sub-class Programmer
(member – proglanguage) from Developer. Create object of Developer and display the
details of it. Implement this multilevel inheritance with appropriate constructor and
methods.s
*/
package chap2_setB_q2;
import java.lang.*;
import java.util.*;
import java.io.*;

class Employee{
    private String name;
    private double salary;
    public Scanner sc=new Scanner(System.in);
    public Employee(){
        System.out.println("Enter Employee name:");
        this.name=this.sc.next();
        System.out.println("Enter Employee salary:");
        this.salary=this.sc.nextDouble();
    }
    public void empDisp(){
        System.out.println("Employee Class:");
        System.out.println("Emp name="+this.name);
        System.out.println("Emp salary="+this.salary);
    }
}
class Developer extends Employee{
    private String projectname;
    public Developer(){
        super();
        System.out.println("Developer ProjectName:");
        this.projectname=this.sc.next();
    }
    public void devDisp(){
        super.empDisp();
        System.out.println("Developer Class:");
        System.out.println("Dev projectname="+this.projectname);
    }
}
class Programmer extends Developer{
    private String progLanguage;
    public Programmer(){
        super();
        System.out.println("Programmer progLanguage:");
        this.progLanguage=this.sc.next();
    }
    public void progDisp(){
       super.devDisp();
       System.out.println("Programmer Class:");
       System.out.println("Prog proglanguage="+this.progLanguage);  
    }
}
public class Q2{
    public static void main(String[] args){
        Programmer obj=new Programmer();
        obj.progDisp();
    }
}
