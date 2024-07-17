/*
3. Write a java program to accept a number from the user, if number is zero then throw user
defined exception ―Number is 0, otherwise check whether no is prime or not.
*/

//A prime number is a number that can only be divided by itself and 1 without remainders.

package Chap3SetA_Q3;
import java.lang.*;
import java.lang.Exception;
import java.util.Scanner;

class CheckNum extends Exception{
    public int num;
    public CheckNum(int var){
        this.num=var;
    }
}

public class Q3{
    public static void isprime(int val){
        //corner case
        if(val==0 || val==1){
            //return false;
            System.out.println("val="+val+" is not a prime number");
        }
        
        else if(val==2){
            //return true;
            System.out.println("val="+val+" is a prime number");
        }
        //base case
        else{
            for(int i=2;i<val;i++){
                if(val%i==0){
                    //return false;
                    System.out.println("val="+val+" is not a prime number");
                    //break;
                    System.exit(0);
                }
                //else{
                    //continue;
                //}
            }
            //return true;
            System.out.println("val="+val+" is a prime number");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to Check weather Prime or Not:");
        int var=sc.nextInt();
        try{
            if(var==0){
                throw new CheckNum(0);
            }
            else{
                Q3.isprime(var);
            }
        }
        catch(CheckNum obj){
            System.out.println("!!!Exception!!!:");
            System.out.println("Enter num is="+obj.num+" It cannot be Zero");
        }
    }
}
