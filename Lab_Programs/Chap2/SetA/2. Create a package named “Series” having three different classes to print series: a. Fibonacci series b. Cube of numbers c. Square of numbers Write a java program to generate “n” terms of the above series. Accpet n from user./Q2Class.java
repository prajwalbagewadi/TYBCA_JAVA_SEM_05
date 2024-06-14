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
// code to import created classes
import SetA_Q2_Series.*;

//executable class
public class Q2Class{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Series limit N:");
        int n=sc.nextInt();
        System.out.println("Fibonacci_Series:");
        Fibonacci_Series obj1=new Fibonacci_Series(n);
        System.out.println();
        System.out.println("Cube of a number_Series:");
        CubeOfNum obj2=new CubeOfNum(n);
        System.out.println();
        System.out.println("Square of a number_Series:");
        SquareOfNum obj3=new SquareOfNum(n);
        System.out.println();
    }
}
