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
Finding the Square of a Number is a simple method. 
We need to multiply the given number by itself to find its square number. 
The square term is always represented by a number raised to the power of 2. 
For example, the square of 6 is 6 multiplied by 6, i.e., 6×6 = 62 = 36.
*/
public class SquareOfNum{
    public SquareOfNum(int n){
        int i=1;
        while(i<=n){
            System.out.println("Square="+i+"="+(i*i));
            i++;
        }
    }
//    public static void main(String[] args){
//        SquareOfNum obj=new SquareOfNum(10);
//    } 
}