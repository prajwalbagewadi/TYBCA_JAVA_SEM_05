/*
3. Define an abstract class Staff with members name and address. Define two sub-classes of
this class – FullTimeStaff (members - department, salary, hra - 8% of salary, da – 5% of
salary) and PartTimeStaff (members - number-of-hours, rate-per-hour). Define appropriate
constructors. Write abstract method as calculateSalary() in Staff class. Implement this
method in subclasses. Create n objects which could be of either FullTimeStaff or
PartTimeStaff class by asking the user‘s choice. Display details of all FullTimeStaff objects
and all PartTimeStaff objects along with their salary.
*/

/*
hra : House Rent Allowance
da : DA or dearness allowance is a component of an employee's salary 
that helps them cope with the rising cost of living. 

8% means a number is divided by 100 so here it is given 8 %. 
So, 8%=8/100=0.08. And let the number be x . 
So,the final answer would be 0.08*x

8% percent of salary=Salary * 8/100
*/

/*
abstract class:

example:
abstract class Bike{  
  abstract void run();  
}  
class Honda4 extends Bike{  
    void run(){System.out.println("running safely");
}  
public static void main(String args[]){  
        Bike obj = new Honda4();  
        obj.run();  
}    
*/

package chap2_setB_q3;
import java.lang.*;
import java.util.*;
import java.io.*;

abstract class Staff{
    //members
    public String name;
    public String addr;
    public Scanner sc=new Scanner(System.in);
    public Staff(){
        //constructor
        System.out.println("Enter Staff Name:");
        this.name=sc.next();
        System.out.println("Enter Staff address:");
        this.addr=sc.next();
    }
    //member method
    public void staffDisp(){
        System.out.println("Staff Details:");
        System.out.println("Staff name:"+this.name);
        System.out.println("Staff addr:"+this.addr);
    }
    //abstract method
    public abstract void calculateSalary();
}

class FullTimeStaff extends Staff{
    private String dept;
    private double salary;
    private double hra=8;
    private double da=5;
    public FullTimeStaff(){
      //constructor
        super();
        System.out.println("Enter Staff dept:");
        this.dept=sc.next();
        System.out.println("Enter Staff salary:");
        this.salary=sc.nextDouble();  
    }
    public void calculateSalary(){
        System.out.println("Salary_FullTimeStaff:");
        System.out.println("Base salary="+this.salary);
        double hra=this.hra/100;
        double da=this.da/100;
        System.out.println("HRA="+hra+"%");
        System.out.println("DA="+da+"%");
        double calhra=this.salary*hra;
        System.out.println("HRA="+calhra);
        double calda=this.salary*da;
        System.out.println("DA="+calda);
        System.out.println("Total salary="+(this.salary+calhra+calda));
    }
    public void fullTimeEmpDisp(){
        System.out.println("FullTimeStaff:");
        super.staffDisp();
        System.out.println("FullTimeStaff dept:"+this.dept);
        this.calculateSalary();
    }
}
class PartTimeStaff extends Staff{
    private double noOfHrs;
    private double ratePerhr;
    public PartTimeStaff(){
       //constructor
        super();
        System.out.println("Enter Staff no of Hrs:");
        this.noOfHrs=sc.nextDouble();
        System.out.println("Enter Staff rate per hr:");
        this.ratePerhr=sc.nextDouble(); 
    }
    public void calculateSalary(){
        System.out.println("Salary_PartTimeStaff:");
        System.out.println("No of hrs="+this.noOfHrs);
        System.out.println("Rate per hr="+this.ratePerhr);
        System.out.println("Total salary="+(this.noOfHrs*this.ratePerhr));
    }
    public void partTimeEmpDisp(){
        System.out.println("PartTimeStaff:");
        super.staffDisp();
        this.calculateSalary();
    }
}
public class Q3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter No of Staff:");
//        int n=sc.nextInt();
        FullTimeStaff[] femp=new FullTimeStaff[100];
        PartTimeStaff[] pemp=new PartTimeStaff[100];
        int op;
        int fcnt=0;
        int pcnt=0;
        do{
            System.out.println("1. FullTimeStaff.");
            System.out.println("2. PartTimeStaff.");
            System.out.println("3. Exit.");
            System.out.println("Select Option:");
            op=sc.nextInt();
            switch(op){
                case 1:{
                    
                  //for(int i=0;i<femp.length;i++){
                    femp[fcnt]=new FullTimeStaff();
                    fcnt++;
                  //}  
                } 
                break;
                case 2:{
                  //for(int i=0;i<pemp.length;i++){
                    pemp[pcnt]=new PartTimeStaff();
                    pcnt++;
                  //}  
                } 
                break;
                case 3:{
                    System.out.println("input Exit.");
                }
            }
        }while(op!=3);
        for(int i=0;i<fcnt;i++){
            femp[i].fullTimeEmpDisp();
        }
        for(int i=0;i<pcnt;i++){
            pemp[i].partTimeEmpDisp();
        }
    }
}
