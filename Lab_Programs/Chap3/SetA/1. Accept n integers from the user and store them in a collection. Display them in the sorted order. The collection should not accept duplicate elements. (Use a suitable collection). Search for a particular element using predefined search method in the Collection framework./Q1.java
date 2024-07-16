/*
1. Accept n integers from the user and store them in a collection. Display them in the sorted order.
The collection should not accept duplicate elements. (Use a suitable collection). Search for a
particular element using predefined search method in the Collection framework.
*/

/*
The HashSet class in Java is part of the Java Collections Framework and is used to store a collection of unique elements.
Key Features of HashSet:
No Duplicates: A HashSet does not allow duplicate elements.
Null Elements: HashSet permits null elements.
Unordered: The elements are not ordered; they do not maintain any particular order.
Fast Access: It provides constant-time performance for basic operations like add, remove, contains, and size, 
assuming the hash function disperses elements properly among the buckets
*/
package Chap3SetA_Q1;
import java.lang.*;
import java.util.Scanner;
import java.util.Collections;
import java.util.HashSet;// is designed to store unique elements of a single type
import java.util.List;
import java.util.ArrayList;
//import java.io.*;

public class Q1{
    public static void main(String[] args){
       HashSet<Integer> set=new HashSet<Integer>();
       Scanner sc=new Scanner(System.in);
       System.out.println("List:");
       System.out.println("Enter List Size:");
       int n=sc.nextInt();
   
       //accept input from user
       for(int i=0;i<n;i++){
           System.out.println("Enter List Element:");
           set.add(sc.nextInt());
       }
    
       //display list
       System.out.println("set="+set);
       
       //sorting
       List<Integer> convlist = new ArrayList<Integer>(set);// convert hashset to List(ArrayList)
       /*The statement List<String> list = new ArrayList<>(set); 
       converts a HashSet<String> into an ArrayList<String>. 
       This is a common practice when you need to 
       perform operations on the elements of the set 
       sthat are not directly supported by HashSet, such as sorting.
       */
       /*
       In Java, the List interface is a part of the Java Collections Framework and represents an ordered collection 
       (also known as a sequence). It allows duplicate elements and provides positional access and insertion of elements.
       Some of the commonly used implementations of the List interface include ArrayList, LinkedList, Vector, and Stack.
       */
       Collections.sort(convlist);
       System.out.println("list sort in Ascending="+convlist);
       Collections.sort(convlist,Collections.reverseOrder());
       System.out.println("list sort in Descending="+convlist);
       
       //Searching
       System.out.println("Enter the Element to Be Searched:");
       int key=sc.nextInt();
       
       //Using the contains Method returns boolean value
       /*
       Most collection classes in the Java Collections Framework, such as ArrayList, HashSet, LinkedList, etc., 
       provide the contains method to check if a collection contains a specific element.
       */
       if(set.contains(key)){
          System.out.println("contains Method Set Element "+key+"is present in set"); 
       }
       else{
           System.out.println("contains Method Set Element "+key+"is not present in set");
       }
       
       //Using the indexOf Method
       /*
       For lists (like ArrayList and LinkedList), you can use the indexOf method 
       to find the index of the first occurrence of an element.
       */
       convlist = new ArrayList<Integer>(set);
       //display list
       System.out.println("list="+convlist);
       if(convlist.indexOf(key)!=-1){
        System.out.println("indexOf Method List Element "+key+"is present in List at index:"+convlist.indexOf(key));
       }
       else{
        System.out.println("indexOf Method List Element "+key+"is not present in List");    
       }
       
       //Using the binarySearch Method in Collections Utility Class works on list
       /*
       For sorted lists, you can use the binarySearch method provided by the Collections utility class 
       to perform a binary search. Note that the list must be sorted before calling binarySearch.
       */
       //int ind=Collections.binarySearch(convlist, key);
       //System.out.println(ind);
       // returns -5 index. if element not found.
        if(Collections.binarySearch(convlist, key)>=0){
        System.out.println("binarySearch Method List Element "+key+"is present in List at index:"+Collections.binarySearch(convlist, key));
       }
       else{
        System.out.println("binarySearch Method List Element "+key+"is not present in List");    
       }
    }
}
