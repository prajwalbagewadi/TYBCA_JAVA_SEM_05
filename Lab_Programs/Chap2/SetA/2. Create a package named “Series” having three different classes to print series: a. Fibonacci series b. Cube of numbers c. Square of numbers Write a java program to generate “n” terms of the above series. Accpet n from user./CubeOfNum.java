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
cube of numbers:
The cubes are nothing but the values when a number is multiplied by itself 
three times or thrice. 
For example, the cube of 3 is 3 x 3 x 3 = 27, 
and is denoted by 33 = 9. 
Any natural number raised to the power of three 
gives the cube the original number.
*/
public class CubeOfNum{
    public CubeOfNum(int n){
        int i=1;
        while(i<=n){
            System.out.println("cube="+i+"="+(i*i*i));
            i++;
        }
    }
//    public static void main(String[] args){
//        CubeOfNum obj=new CubeOfNum(50);
//    }
}