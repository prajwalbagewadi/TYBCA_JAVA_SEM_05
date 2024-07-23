/*
1. Construct a linked List containing names of colours: red, blue, yellow and orange. Then
extend your program to do the following:
i. Display the contents of the List using an Iterator
ii. Display the contents of the List in reverse order using a ListIterator
iii. Create another list containing pink and green. Insert the elements of this list
between blue and yellow.
*/

package Chap3SetB_Q1;
import java.lang.*;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

/*
In the Java Collection Framework, an Iterator is an interface that provides methods to iterate over a collection. 
It is part of the java.util package. 
Using an iterator, you can traverse the elements of a collection one by one and perform operations on them.
Key Methods of Iterator Interface:
hasNext(): Returns true if there are more elements in the collection.
next(): Returns the next element in the collection.
remove(): Removes the last element returned by the iterator from the collection. 
          This method can be called only once per call to next().
*/

public class Q1{
    public static void main(String[] args){
        LinkedList<String> color_list=new LinkedList<String>();
        
        //add elements to list.
        color_list.add("red");
        color_list.add("blue");
        color_list.add("yellow");
        color_list.add("orange");
        
        //display list.
        System.out.println("color_list="+color_list);
        
        //Display the contents of the List using an Iterator
        Iterator<String> cl=color_list.iterator();
        /*
        cl.iterator(): This method call creates an Iterator for the color_list collection. 
        The Iterator will allow you to traverse through the elements of the color_list collection one by one.
        */
        System.out.println("Display the contents of the List using an Iterator");
        while(cl.hasNext()){
            String element=cl.next();
            System.out.println("element="+element);
        }
        
        //Display the contents of the List in reverse order using a ListIterator
        ListIterator<String> cl2=color_list.listIterator(color_list.size());
        System.out.println("Display the contents of the List in reverse order using a ListIterator");
        while(cl2.hasPrevious()){
            String element=cl2.previous();
            System.out.println("element="+element);
        }
        
        //Create another list containing pink and green. Insert the elements of this list between blue and yellow.
        LinkedList<String> ls2=new LinkedList<String>();
        ls2.add("pink");
        ls2.add("green");
        System.out.println("color_list2="+ls2);
        int index=color_list.indexOf("yellow"); // we use the index of yellow so as the elements are added before yellow
        System.out.println("index="+index);
        color_list.addAll(index,ls2);
        System.out.println("color_list="+color_list);
    }
}
