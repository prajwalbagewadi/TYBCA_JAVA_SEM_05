/*
1. Write a Java program to accept a number from command prompt and generate
multiplication table of a number. Accept number using BufferedReader class.
*/

import java.lang.*;
import java.util.*;
import java.io.*;
// package to import exception package
import java.lang.Exception.*;
class ConsoleInput{
    public void process() throws IOException{
        /*  
            throws IO Exception :
                By declaring throws IOException, you simplify the code in the process() method, 
                avoiding the need for explicit handling of IOException within the method body. 
                Instead, any IOException that occurs will be propagated to the JVM, 
                which will handle it by printing a stack trace.

                This file system reading can fail at any time for many reasons. 
                It may occur due to the file deleted or viruses in the file. 
                Sometimes BufferedReader takes data from a network stream where the reading system can fail at any time.
                So this type of error can occur in input operation when a BufferedReader is used. 
                This is why a buffered reader throws IOException.
        */ 
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        
        /*
            data flow: keyboard -> Device buffer(RAM) -> system.in -> InputStreamReader_(r) -> BufferedReader_(br)
        */
        System.out.println("Enter ConsoleInput=");
        /* int var = br.read(); // returns ascii val for the char */
        String var = br.readLine();
        /* 
            int BufferedReader.obj.read():	It is used for reading a single character. 
                                            returns int ascii val for char

            String  BufferedReader.obj.readLine(): It is used for reading a line of text.                                
        */
        /*int num = var-'0';   // to convert ascii to int we take ascii int by -'0'or -48 */
        int num = Integer.parseInt(var);
        /*We can convert String to an int in java using Integer.parseInt() method. 
          To convert String into Integer, 
          we can use Integer.valueOf() method which returns instance of Integer class. 
        */
        System.out.println("num=" + num);
        for(int i=1;i<=20;i++){
            System.out.println(num+"X"+i+"="+(num*i));
        }
    }
    public static void main(String[] args){
        ConsoleInput obj=new ConsoleInput();
        try {
            obj.process();// process methods contains the Exception of Type IOException
        }catch (Exception e) {
            e.printStackTrace();
        }
    }  
}
