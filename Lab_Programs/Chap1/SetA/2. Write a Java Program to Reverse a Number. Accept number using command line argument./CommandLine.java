/*
2. Write a Java Program to Reverse a Number. Accept number using command line argument. 
*/
import java.lang.*;
import java.lang.String; //import class String
import java.lang.StringBuilder; //import class StringBuilder
/*
StringBuilder in Java represents a mutable sequence of characters. 
Since the String Class in Java creates an immutable sequence of characters, 
the StringBuilder class provides an alternative to String Class, 
as it creates a mutable sequence of characters. 
The function of StringBuilder is very much similar to the StringBuffer class, 
as both of them provide an alternative to String Class by making a mutable sequence of characters. 
*/
import java.io.*;

class CommandLine{
    public static void main(String[] args){ /*main(String[] args) is a array of Strings for taking Command line args.*/
        String var=args[0];
        StringBuilder sb=new StringBuilder(var);
        sb.reverse(); // returns obj;
        String Rev=sb.toString();
        System.out.println("The Reversed num="+Integer.parseInt(Rev));
        /* 
            To Convert String To Int we use Integer Class Method Integer.parseInt(String obj);
        */
    }
}
