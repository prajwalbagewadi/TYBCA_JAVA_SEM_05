/*
2. Create a package named “Series” having three different classes to print series:
a. Fibonacci series
b. Cube of numbers
c. Square of numbers
Write a java program to generate “n” terms of the above series. Accpet n from user.
*/

package SetA_Q2_Series;

import java.lang.*;
import java.util.*;
import java.io.*;

/*
In mathematics, 
the Fibonacci sequence is a sequence in which each number is the sum 
of the two preceding ones. 
Numbers that are part of the Fibonacci sequence are known as Fibonacci numbers, 
commonly denoted Fn . 
The sequence commonly starts from 0 and 1, 
although some authors start the sequence from 1 and 1 or sometimes 
(as did Fibonacci) from 1 and 2. Starting from 0 and 1, the sequence begins[1]

0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, .
*/

public class Fibonacci_Series{
    public Fibonacci_Series(int n){
       int ans=1;
       int i=0;
        while(i<=n){
            //print val of i at start of the block to get proper Seq
           System.out.println("ans"+i);
           int prev;
           prev=ans;
           ans=i+ans;
           i=prev;
        } 
    }
//    public static void main(String[] args){
//        Fibonacci_Series obj=new Fibonacci_Series(377);
//    }
}
