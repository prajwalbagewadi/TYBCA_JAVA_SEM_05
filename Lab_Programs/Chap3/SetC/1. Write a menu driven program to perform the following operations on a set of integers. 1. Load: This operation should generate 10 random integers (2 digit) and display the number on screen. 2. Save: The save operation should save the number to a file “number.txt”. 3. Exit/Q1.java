/*
1. Write a menu driven program to perform the following operations on a set of integers.
1. Load: This operation should generate 10 random integers (2 digit) and display the
number on screen.
2. Save: The save operation should save the number to a file “number.txt”.
3. Exit
*/

package Chap3SetC_Q1;
import java.lang.*;
import java.util.Random;
import java.util.Scanner;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Q1{
    private int[] nums=new int[10];
    void load(){
        Random random=new Random();
        for(int i=0;i<nums.length;i++){
            nums[i]=random.nextInt(10,99);
            System.out.println("Random Generated Number="+nums[i]);
        }
    }
    void arrDisp(){
        for(int i=0;i<nums.length;i++){
            System.out.print((i+1)+"="+nums[i]+" ");
        }
    }
    void save(){
        try{
            FileOutputStream fos=new FileOutputStream("C:\\Users\\bagew\\Documents\\NetBeansProjects\\Chap3SetC_Q1\\src\\Chap3SetC_Q1\\number.txt");
//            if(fos!=null){
//                throw new IOException("File not found");
//            }
            DataOutputStream dout=new DataOutputStream(fos);
            for(int i=0;i<nums.length;i++){
                dout.writeUTF("VAL="+nums[i]+" ");
            }
        }
        catch(IOException obj){
            System.out.println("Error Has Occured="+obj.getMessage());
        }
        System.out.println("Data Saved in file \"number.txt\"");
    }
    public static void main(String[] args){
        Q1 obj=new Q1();
        Scanner sc=new Scanner(System.in);
        int input;
        do{
            System.out.println("Menu:");
            System.out.println("1. Load: This operation should generate 10 random integers (2 digit) and display the number on screen.");
            System.out.println("2. Save: The save operation should save the number to a file “number.txt”.");
            System.out.println("3. Exit");
            System.out.println("Select input:");
            input=sc.nextInt();
            switch(input){
                case 1: {
                    obj.load();
                    obj.arrDisp();
                }
                break;
                case 2: {
                    obj.save();
                }
                break;
                case 3: {
                    System.out.println("Exit.");
                }
                break;
            }
        }while(input!=3); 
    }
}
