/* 
3. Write a Java program to print the sum of elements of the array. Also display array elements
in ascending order.
*/

/*
Java array is an object which contains elements of a similar data type. 
Additionally, The elements of an array are stored in a contiguous memory location.
It is a data structure where we store similar elements. We can store only a fixed set of elements in a Java array.
Array in Java is index-based, the first element of the array is stored at the 0th index, 2nd element is stored on 1st index and so on. 
*/

/* 
Syntax :
    Declare : 
        dataType[] arr; (or)  
        dataType []arr; (or)  
        dataType arr[]; 
    Instantiation of an Array in Java
        arrayRefVar=new datatype[size];  
*/
import java.lang.*;
import java.io.*;
import java.util.Scanner; // import Scanner Class for user input.
import java.util.Arrays; // import Arrays for sorting array.

public class Quest3{
    Scanner sc=new Scanner(System.in);
    /* 
        Scanner Class Common methods:
            nextBoolean()	Reads a boolean value from the user
            nextByte()	Reads a byte value from the user
            nextDouble()	Reads a double value from the user
            nextFloat()	Reads a float value from the user
            nextInt()	Reads a int value from the user
            nextLine()	Reads a String value from the user
            nextLong()	Reads a long value from the user
            nextShort()	Reads a short value from the user
    */
    // array declaration.
    int[] arr=new int[5];
    public void insertArr(int[] arr){
        //use array.length instead of sizeof().
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter Array Item:");
            arr[i]=sc.nextInt();
        }
    }
    public void displayArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("\n");
    }
    public void sumArr(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("Sum of Array="+sum);
    }
    public void sortASC_Arr(int[] arr){
        Arrays.sort(arr);
        /*  reverse sort: 
            // Sorts arr[] in descending order using
            // reverseOrder() method of Collections class
            // in Array.sort() as an argument to it
            Arrays.sort(arr, Collections.reverseOrder());
        */
        this.displayArr(arr);
    }
    public static void main(String[] args){
       
        
        Quest3 obj=new Quest3();
        System.out.println("Enter array elements");
        obj.insertArr(obj.arr);
        System.out.println("display org array");
        obj.displayArr(obj.arr);
        obj.sumArr(obj.arr);
        obj.sortASC_Arr(obj.arr);

    }
}
