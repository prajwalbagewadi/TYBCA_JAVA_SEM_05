/*
Data types in java
*/

/*
Primitive Data Type:
    Non-Numeric Type:
        Boolean, char

    Numeric Type:
        integer:
            byte, short, int, long

        floating point:    
            float, double

    Boolean, byte, char, short, int, long, float, double

Non-Primitive Data Type:
    String, Array
*/

package Data_Types;
import java.lang.*;
import java.util.*;
import java.io.*;

public class DT{
    public static void main(String[] args){
        //Primitive Data types
        
        /*
        Byte Data Type:
        The byte data type is an 8-bit signed two’s complement integer. 
        The byte data type is useful 
        for saving memory in large arrays.
        Size: 1 byte (8 bits)
        range: -128 to 127
        */
        byte bytevar=127;
        System.out.println("byte="+bytevar);
        
        /*
        Short Data Type:
        The short data type is a 16-bit signed two’s complement integer.
        Similar to byte, use a short to save memory 
        in large arrays, in situations where the 
        memory savings actually matters.
        Size: 2 bytes (16 bits)
        range: -32,768 to 32,767
        */
        short shortvar=32767;
        System.out.println("short="+shortvar);
      
        /*
        Interger Data Type:
        It is a 32-bit signed two’s complement integer.
        Size: 4 bytes ( 32 bits ) (0 to 2^32 -1)
        range: -2,147,483,648 to 2,147,483,647
        */
        int intvar=2147483647;
        System.out.println("int="+intvar);
        
        /*
        Long Data Type:
        The range of a long is quite large. 
        The long data type is a 64-bit two’s complement integer 
        and is useful for those occasions 
        where an int type is not large enough to hold the desired value. 
        The size of the Long Datatype is 8 bytes (64 bits).
        size: 8 bytes (64 bits). (0 to 2^64 -1)
        range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        */
        long longvar=922337203;
        System.out.println("long="+longvar);
         
        /*
        Float Data Type:
        The float data type is a single-precision 32-bit IEEE 754
        floating-point. Use a float (instead of double) 
        if you need to save memory in large arrays of floating-point numbers. 
        The size of the float data type is 4 bytes (32 bits).
        size:4 bytes (32 bits).upto 7 decimal digits
        range: 1.23e100f , -1.23e-100f , .3f ,3.14F
        */
        float floatvar=1.23100f;
        System.out.println("float="+floatvar);
        
        /*
        The double data type is a double-precision 64-bit IEEE 754 floating-point. 
        For decimal values, this data type is generally the default choice. 
        The size of the double data type is 8 bytes or 64 bits.
        size:8 bytes or 64 bits.upto 16 decimal digits
        range:1.23456e300d , -123456e-300d , 1e1d
        */
        double doublevar=123456300d;
        System.out.println("double="+doublevar);
        
        /*
        Boolean Data Type
        Boolean data type represents only one bit of information either true or false which is intended to represent the two truth values of logic and Boolean algebra, 
        but the size of the boolean data type is virtual machine-dependent. 
        Values of type boolean are not converted implicitly or explicitly (with casts) to any other type. 
        But the programmer can easily write conversion code.
        size:8 bits
        range:true, false
        */
        boolean booleanvar=true;
        System.out.println("boolean="+booleanvar);        
        
        /*
        Char Data Type:
        The char data type is a single 16-bit Unicode character 
        with the size of 2 bytes (16 bits).
        size: 2 bytes (16 bits).
        range:characters representation of ASCII values 0 to 255
        */
        char charvar=77; //77=M
        System.out.println("char="+charvar);      
        
        //Non-Primitive Data types
        /*
        Array Data Type:
        Array is a group of like-typed variables referred to by a common name.
        Arrays In Java, all arrays are dynamically allocated.   
        Arrays may be stored in contiguous memory [consecutive memory locations].
        Since arrays are objects in Java, we can find their length using the object property length. 
        This is different from C/C++, where we find length using size of.
        A Java array variable can also be declared like other variables with [] after the data type.
        The variables in the array are ordered, and each has an index beginning with 0.
        Java array can also be used as a static field, a local variable, or a method parameter.
        An array can contain primitives (int, char, etc.)contiguous memory locations  
        and object (or non-primitive) references of a class stored in a heap segment. , 
        
        Syntax:
        -- type var-name[];
        -- type[] var-name;
        
        Declaring array literal: 
        int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
        
        Multidimensional Array Declaration:
        int[][] intArray = new int[10][20]; //a 2D array or matrix
        int[][][] intArray = new int[10][20][10]; //a 3D array
        */
        Scanner sc=new Scanner(System.in);
        //1D array
        int[] list1=new int[2];
        for(int i=0;i<list1.length;i++){
            System.out.println("Enter Element 1d array:");
            list1[i]=sc.nextInt();
        }
        for(int i=0;i<list1.length;i++){
            System.out.print(list1[i]);
        }
        System.out.println();
        //2D array
        int[][] list2=new int[2][2];
        for(int i=0;i<list2.length;i++){
            for(int j=0;j<list2.length;j++){
                System.out.println("Enter Element 2d array:");
                list2[i][j]=sc.nextInt();  
            }
        }
        for(int i=0;i<list2.length;i++){
            for(int j=0;j<list2.length;j++){
                System.out.print(list2[i][j]);
                  
            }
            System.out.println();
        }
        /*
        String Data Type:
        Strings are the type of objects that can store the character of values and in Java, 
        every character is stored in 16 bits i,e using UTF 16-bit encoding.i
        A string acts the same as an array of characters in Java.
        */
        /*
        String:
        String is an immutable class which means a constant and cannot be changed 
        once created and if wish to change , we need to create an new object and 
        even the functionality it provides like toupper, tolower, etc all these return a new object, 
        its not modify the original object. It is automatically thread safe.
        To make Java more memory efficient 
        (because no new objects are created if it exists already in the string constant pool). 
        */
        String Strvar1="object1";
        System.out.println("Single Char from String="+Strvar1.charAt(2));
        System.out.println("String="+Strvar1);
        
        /*
        using newkeyword 
        String s = new String(“Welcome”);
        In such a case, JVM will create a new string object in normal (non-pool) heap memory 
        and the literal “Welcome” will be placed in the string constant pool. 
        The variable s will refer to the object in the heap (non-pool)
        */
        String Strvar2=new String("object2");
        System.out.println("String="+Strvar2);
        
        /*
        StringBuffer:
        StringBuffer is a peer class of String, it is mutable in nature and it is thread safe class , 
        we can use it when we have multi threaded environment and shared object of string buffer i.e, 
        used by mutiple thread. As it is thread safe so there is extra overhead, so it is mainly used for multithreaded program.
        Syntax:
        StringBuffer demoString = new StringBuffer("GeeksforGeeks");
        */
        StringBuffer stringbufferobj=new StringBuffer();
        stringbufferobj.append("hello");
        stringbufferobj.append(" ");
        stringbufferobj.append("world");
        String res=stringbufferobj.toString();
        System.out.println("StringBuffer="+res);
        
        /*
        StringBuilder in Java represents an alternative to String and StringBuffer Class, 
        as it creates a mutable sequence of characters and it is not thread safe. 
        It is used only within the thread , so there is no extra overhead ,
        so it is mainly used for single threaded program.
        Syntax:
        StringBuilder demoString = new StringBuilder();
        demoString.append("GFG");
        */
        StringBuilder stringbuilderobj=new StringBuilder();
        stringbuilderobj.append("How");
        stringbuilderobj.append(" are");
        stringbuilderobj.append(" you");
        String res2=stringbuilderobj.toString();
        System.out.println("StringBuilder="+res2);
    }
}
