/*
implementing and using ArrayList
ArrayList = is array with variable size and each element is linked to the next element.

operations on arraylist
add - add element
get - retrieve element
modify - add in between elements or update the element
delete/Remove - element deletion
iterate/operations
*/

package arraylist;
import java.lang.*;
import java.util.ArrayList;
import java.util.Collections;
import java.io.*;

public class Imp{
    public static void main(String[] args){
        /*
        ArrayList is used to store objects so we cannot store primitive data types we need there class
        Eg: to create a array list of numbers we cannot use int we need to use the Integer class
        In Java Each Data type has its corresponding class starting with Capital letter.
        */
        /*
        Defining an ArrayList.
        ArrayList<Integer> IntList=new ArrayList<>();
        ArrayList<Integer> IntList2=new ArrayList<Integer>();
        ArrayList<String> StrList=new ArrayList<String>();
        ArrayList<Boolean> BoolList=new ArrayList<Boolean>();
        */
        ArrayList<Integer> ilist=new ArrayList<Integer>(); //Integer Refers to the class of Data to be Stored.
/*
ArrayList<Type> list = new ArrayList<>();
Common Names for <Type>
Type parameter → official term in Java docs.
Generic type → because it makes a class/method generic.
Template type → similar to C++ templates, sometimes developers call it that.
Placeholder type → because it’s a placeholder for the actual type.
Formal type parameter → in compiler theory.
Generic parameter → often used in tutorials.
*/
        
        //Add element in list 
        //new element is always added at the end of the list
        ilist.add(1);//1 is the Element
        ilist.add(2);//2 is the Element
        ilist.add(3);//3 is the Element
        
        //print the list
        System.out.println("ilist="+ilist);
        
        //Get element from list
        //we can get or refer to elements with index in arrays starting with 0th index
        int temp=ilist.get(0);//0 is the index value
        System.out.println("temp="+temp);
        temp=ilist.get(1);//1 is the index value
        System.out.println("temp="+temp);
        temp=ilist.get(2);//2 is the index value
        System.out.println("temp="+temp);
        
        //Add element in Between elements or at Specific index
        ilist.add(1,4);//1 refers to index to place of the element and 4 is the element
        System.out.println("ilist="+ilist);
        
        //Set element - to update or change a existing element
        ilist.set(0,5);//0 refers to index to place of the element and 5 is the updated element
        System.out.println("ilist="+ilist);
        
        //delete element from list
        ilist.remove(2);//2 refers to index to place of the element to be deleted
        System.out.println("ilist="+ilist);
        
        //size of ArrayList or number of elements present in the list
        //size can be used for looping Iteration of the list
        int ilistsize=ilist.size();
        System.out.println("ilist Size="+ilistsize);
        
        //loops or iterating the ArrayList
        //size() is used to get the size of the ArrayList for Exiting the Loop
        for(int i=0;i<ilist.size();i++){
            System.out.print(ilist.get(i));
            //get() is used to get or access the value present at that index
        }
        System.out.println();
        
        //Sorting the ArrayList
        Collections.sort(ilist); //Ascending
        System.out.println("sort in Ascending="+ilist);
        Collections.sort(ilist,Collections.reverseOrder());//Descending
        System.out.println("sort in Descending="+ilist);
    }
}
