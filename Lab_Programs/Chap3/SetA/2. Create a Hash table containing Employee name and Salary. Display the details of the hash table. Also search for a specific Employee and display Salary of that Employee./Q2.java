/*
2. Create a Hash table containing Employee name and Salary. Display the details of the hash
table. Also search for a specific Employee and display Salary of that Employee.
*/
package Chap3SetA_Q2;
import java.lang.*;
import java.util.Hashtable;
import java.util.Scanner;
import java.lang.String;
/*
The Hashtable class implements a hash table, which maps keys to values. 
Any non-null object can be used as a key or as a value. 
To successfully store and retrieve objects from a hashtable, 
the objects used as keys must implement the hashCode method and the equals method.  
*/
public class Q2{
    public static void main(String[] args){
        Hashtable<String,Integer> emp=new Hashtable<String,Integer>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of Employees:");
        int n=sc.nextInt();
        //accept Employee name and Address
        for(int i=0;i<n;i++){
            System.out.println("Enter Employee Name and Salary:");
            emp.put(sc.next(),sc.nextInt());
        }
       
        //display Employee list.
        System.out.println(emp);
       
        //search for a specific Employee and display Salary of that Employee
        System.out.println("Enter Employee Name to Search:");
        String skey=sc.next();
        //containsKey method
        System.out.println("Key="+emp.containsKey(skey));
        //get method
        System.out.println("Salary="+emp.get(skey)+" "+"of Employee="+skey);
    }
}
