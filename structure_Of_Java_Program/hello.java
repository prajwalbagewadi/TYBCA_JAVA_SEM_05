// simple java example program / first program
import java.lang.*;
/*
Java.lang package in Java
Provides classes that are fundamental to the design of the Java programming language. 
The most important classes are Object, which is the root of the class hierarchy, and Class,
instances of which represent classes at run time.
*/
import java.util.*;
/*
java.util package contains the collections framework, 
legacy collection classes,
event model, date and time facilities, internationalization,
and miscellaneous utility classes 
(a string tokenizer, a random-number generator, and a bit array).
*/
import java.io.*;
/*
Java.io package provides classes for system input and output 
through data streams, serialization, and the file system.
*/

/*
class keyword used to declare class.
syntax class ClassName {}
note: no java program can be made without class because java is a class based programming langauage
*/

class Hello {

// main method
    /*
        public : access specifier;
        static : keyword used to declare static methods, static methods do not need object to be invoked ,
                 saving memory space , so main method is mostly kept static;
        void : return type;
        main : start point of program;
        String args[] : String[] args or String args[] is used for command line argument. We will discuss it in coming section
                        String array with name args
    */
    public static void main(String args[]){
        /*
            System.out.println(); : used to print statements;
            System : base class named as System class are standard input, standard output, 
                     and error output streams; access to externally defined properties and environment variables; 
                     a means of loading files and libraries; 
                     and a utility method for quickly copying a portion of an array. It extends class Object. 
            out: This is an instance of PrintStream type, 
                 which is a public and static member field of the System class.
            println:As all instances of the PrintStream class have a public method println(), 
                    we can invoke the same on out as well. This is an upgraded version of print().
                    It prints any argument passed to it and adds a new line to the output. 

        */
        System.out.println("Hello this my first java program");
    }

}
