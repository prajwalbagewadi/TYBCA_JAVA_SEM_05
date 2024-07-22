/*
4. Write a java program that displays the number of characters, lines and words of a file.
*/

package Chap3SetA_Q4;
import java.lang.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Q4{
    public static void main(String[] args) throws IOException{
        FileReader file=new FileReader("C:\\Users\\bagew\\Documents\\NetBeansProjects\\Chap3SetA_Q4\\src\\Chap3SetA_Q4\\Input.txt");
        BufferedReader br=new BufferedReader(file);
        int charcode,no_chars=1,no_words=1,no_lines=1;
        while((charcode=br.read())!=-1){
            char c=(char)charcode;
            System.out.print(c);
            no_chars++;
            if(c==' ' || c=='\n'){
                /*
                The ASCII value for the Enter key (also known as the carriage return) is 13. 
                In hexadecimal, it is represented as 0x0D.
                */
                /*The ASCII value for the spacebar is 32. In hexadecimal, it is represented as 0x20.*/
                System.out.print(c);
                no_words++;
            }
            if(c=='\n'){
                System.out.print(c);
                no_lines++;
            }
        }
        System.out.println();
        System.out.println("No_Chars="+no_chars); 
        System.out.println();
        System.out.println("no_words="+no_words);
        System.out.println();
        System.out.println("no_lines="+no_lines);
    }
}
