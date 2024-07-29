//Conditional Statements
/*
if,else
else if
switch
break
*/
package Package;
import java.lang.*;
import java.util.Scanner;
public  class ConditionalStatements{
    public static void main(String[] args){
       /*
        boolean datatype True,False
        Relation Operators.==,!=,>greater than,<lessthan,>=greater than equal to,<=less than equal to 
       */
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Age:");
       int age=sc.nextInt();
       System.out.println("if else code");
       if(age>18){
        // if condition is true Stmts executed.
          System.out.println("Adult");
       }
       else{
        // if condition is false Stmts executed.
        System.out.println("Not Adult");
       }
       
       System.out.println("odd even Enter num:");
       int num=sc.nextInt();
       if(num%2==0){
           System.out.println("even");
       }
       else{
           System.out.println("odd");
       }
       
       System.out.println("Equal Greater lesser Check: Enter A,B:");
       int a=sc.nextInt();
       int b=sc.nextInt();
       if(a==b){
           System.out.println("a is == to b");
       }
       else{
           if(a>b){
               System.out.println("a is > greater b");  
           }
           else{
               System.out.println("a is < lesser1 b");
           }
       }
       
       System.out.println("elesif code");
       if(a==b){
           System.out.println("a is == to b");
       }
       else if(a>b){ //if false exec
            System.out.println("a is > greater b");  
       }
       else{ // else if false exec
          System.out.println("a is < lesser1 b");  
       }
       
       System.out.println("switch code");
       System.out.println("Press Button 1,2,3:");
       int button=sc.nextInt();
       if(button==1){
           System.out.println("hello");
       }
       else if(button==2){
            System.out.println("Namaste");
       }
       else if(button==3) {
            System.out.println("Bonjour");
       }
       else{
            System.out.println("invaild button.");
       }
       
       // to sol multiple condition writing switch case is used. clean code
       switch(button){
           case 1://case 'a':
                System.out.println("hello");
                break;
           case 2://case 'b':
                System.out.println("Namaste");
                break;
           case 3://case 'c':
                System.out.println("Bonjour");
                break;
           default:
               System.out.println("invaild Button");
       }
       // Create Calculator.
    }
}
