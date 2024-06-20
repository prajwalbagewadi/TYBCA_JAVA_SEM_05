/*
1. Define an interface “Operation” which has methods area(),volume(). Define a constant PI
having a value 3.142. Create a class circle (member – radius), cylinder (members – radius,
height) which implements this interface. Calculate and display the area and volume.
*/

package chap2_setB_q1;
import java.lang.*;
import java.util.*;
import java.io.*;

/*
what is interface:
An interface in Java is a blueprint of a class. 
It has static constants and abstract methods.

The interface in Java is a mechanism to achieve abstraction. 
There can be only abstract methods in the Java interface, not method body. 
It is used to achieve abstraction and multiple inheritance in Java.

syntax :
interface <interface_name>{  
      
    // declare constant fields  
    // declare methods that abstract   
    // by default.  
} 

The relationship between classes and interfaces:
class -> extends -> class
interface -> implements -> class
interface -> extends -> interface
*/

interface Operation{
/*
constant Syntax:
static final datatype identifier_name=value;

1)The purpose to use the static modifier is to manage the memory.
2)It also allows the variable to be available without loading any instance of the class in which it is defined.
3)The final modifier represents that the value of the variable cannot be changed. 
4)It also makes the primitive data type immutable or unchangeable.
*/
public static final double PI=3.142;
public void area();
public void volume();
}

class Circle implements Operation{
    private double radius;
    public Circle(double r){
        this.radius=r;
    } 
    public void area(){
        //formula {Area} = \pi r^2
        System.out.println("Area of Circle="+(PI*this.radius*this.radius));
    }
    public void volume(){
        //{Volume} = \frac{4}{3} \pi r^3 ->({4}/{3})
        System.out.println("Area of Volume="+((4/3)*PI*this.radius*this.radius*this.radius));
    }
}
class Cyclinder implements Operation{
    private double radius;
    private double height;
    public Cyclinder(double r,double h){
        this.radius=r;
        this.height=h;
    }
    public void area(){
        //formula Area=2×PI×radius×(height+radius)
        System.out.println("Area of Cyclinder="+(2*PI*this.radius*(this.height+this.radius)));
    }
    public void volume(){
        //formula volume=PI*r^2*h
        System.out.println("Volume of Cyclinder="+(PI*this.radius*this.radius*this.height));
    }
}
public class Q1{
    public static void main(String[] args){
        Circle obj1=new Circle(4);
        obj1.area();
        obj1.volume();
        Cyclinder obj2=new Cyclinder(4,6);
        obj2.area();
        obj2.volume();
    }
}
