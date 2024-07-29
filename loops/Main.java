//loops
/*
for loop
while loop 
do while loop
we use loops when we want listen to our fav  song Repeatedly.
for doing a task repeatedly,we use loops
*/
package loops;
import java.lang.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("for loop:");
        //for loop
        //    step 1           step2                  step4.. continue  
        //for(initialization;(terminating)condition;updation){ step3 //do something}
        for(int cnt=0;cnt<100;cnt=cnt+1){
            // 0 - 99;
            System.out.println("hello world"+"count:"+cnt);  
        }
        //infinite loop eg: for(int cnt=0;;cnt=cnt+1)
        
        //print no 0 to 10
        // i++ post increament operator
        for(int i=0;i<=10;i++){
            System.out.println(i);
        }
        
        //while loop
        System.out.println("while loop:");
        int i=0; //initilize
        while(i<11){
            //do something.
            System.out.println(i);
            i++;
        }
        
        //do while
        System.out.println(" do while loop:");
        i=0;
        do{
            // work before check condition after.
            System.out.println(i);
            i++;
        }while(i<11);
        
        System.out.println("False condition:");
        //false condition
        i=12;
        do{
            System.out.println(i);
            i++;
        }while(i<11);
        
        //print sum of 1st n natural numbers;
        int sum=0;
        System.out.println("enter size of N:");
        int n=sc.nextInt();
        for(i=0;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("total sum="+sum);
        
        //print the table of a num input by user.
         System.out.println("enter num for table of:");
         int num=sc.nextInt();
         i=1;
         while(i<=20){
             System.out.println(num+"*"+i+"="+(num*i));
             i++;
         }
         // easer with for loop
         for(i=1;i<=20;i++){
             System.out.println(num+"*"+i+"="+(num*i));
         }
    }
}
