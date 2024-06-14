/*
3. Define a class Employee having members – id, name, salary. Define default constructor.
Create a subclass called Manager with private member bonus. Define methods accept and
display in both the classes. Create “n” objects of the Manager class and display the details
of the worker having the maximum total salary (salary + bonus).
*/

package SetA_Q3;
import java.lang.*;
import java.util.*;
import java.io.*;

class Employee{
    public int id;
    public String name;
    public double salary;
    public Employee(){
        // default constructor
    }
    public void empAccept(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employee Details:");
        System.out.println("Enter Id:");
        this.id=sc.nextInt();
        System.out.println("Enter Name:");
        this.name=sc.next();
        System.out.println("Enter Salary:");
        this.salary=sc.nextDouble();
    }
    public void empDisplay(){
        System.out.println();
        System.out.println("Employee Details:");
        System.out.println("Employee Id:"+this.id);
        System.out.println("Employee Name:"+this.name);
        System.out.println("Employee Salary:"+this.salary);
        System.out.println();
    }
}
class Manager extends Employee{
    private double bonus;
    public Manager(){
        //Default constructor
    }
    public void manAccept(){
       super.empAccept();
       Scanner sc=new Scanner(System.in);
       System.out.println("Manager Panel:");
       System.out.println("Enter bonus:");
       this.bonus=sc.nextDouble();
    }
    public void manDisplay(){
        super.empDisplay();
        System.out.println();
        System.out.println("Bonus:");
        System.out.println("Bonus="+this.bonus);
    }
    public double totSal(){
        return super.salary+this.bonus;
    }
}
class Q3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No of Employee's:");
        int n=sc.nextInt();
        int j=0;
        Manager[] emps= new Manager[n];
        for(int i=0;i<n;i++){
            emps[i]=new Manager();
            emps[i].manAccept();
        }
        Manager max=emps[j];
        for(int i=0;i<n;i++){
            emps[i].manDisplay();
            System.out.println("Total Salary:"+emps[i].totSal());
        }
        while(j<n){
            if(max.totSal()<emps[j].totSal()){
                max=emps[j];
            }
            j++;
        }
        System.out.println("Employee with max Total Salary:");
        max.manDisplay();
        System.out.println("Total Salary:"+max.totSal());
    }
}
