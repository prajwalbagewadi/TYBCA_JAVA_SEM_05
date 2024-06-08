/*
1. Define a “Point” class having members – x,y(coordinates). Define default constructor and
parameterized constructors. Define two subclasses “ColorPoint” with member as color and
subclass “Point3D” with member as z (coordinate). Write display method to display the
details of different types of Points.
*/

package Question1;
import java.lang.*;
import java.util.*;
import java.io.*;

class Point{
    private double x;
    private double y;
    /*
        The Java double keyword, as in any other language, 
        indicates a computer format for representing a floating point number, 
        occupying 64 bits, or 8 bytes, in memory.
        16 Decimal places
    */
    
    public Point(){
        //default constructor
        this.x=0.0000000000000000; //16 decimal places
        this.y=0.000;
    }
    public Point(double xcod,double ycod){
        // parameterized constructor
        this.x=xcod;
        this.y=ycod;
    }
    public void PointDisp(){
        System.out.println("Point Class Display Function");
        System.out.println("X cordinate="+this.x);
        System.out.println("Y cordinate="+this.y);
    }
}
class ColorPoint extends Point{ //Dependent on point class
    private String Color;
    public ColorPoint(){
        //Default constructor
        this.Color="White";
    }
    public ColorPoint(double xcod,double ycod,String col){
        //Parameterized constructor
         super(xcod,ycod);
        this.Color=col;
    }
    public void ColorPointDisp(){
        this.PointDisp();
        System.out.println("ColorPoint Class Display Function");
        System.out.println("Point Color="+this.Color);
    }
}
//class Point3d extends ColorPoint{
class Point3d extends Point{ //Dependent on point class
    private double z;
    public Point3d(){
        //default constructor.
        this.z=0.000;
    }
    public Point3d(double xcod,double ycod,double zcod){
        //Parameterized Constructor
        super(xcod,ycod);
        this.z=zcod;
    }
    public void Point3dDisp(){
        this.PointDisp();
        //this.ColorPointDisp();
        System.out.println("Point3d Class Display Function");
        System.out.println("Z cordinate="+this.z);
    }
}
public class Quest1{
    public static void main(String[] args){
        //type1
        System.out.println("Type 1:");
        Point p1=new Point(0,3);
        p1.PointDisp();
        System.out.println();
        //type2
        System.out.println("Type 2:");
        ColorPoint p2=new ColorPoint(1,4,"Blue");
        System.out.println("Call to Parent class Display:");
        p2.PointDisp();
        System.out.println();
        p2.ColorPointDisp();
        System.out.println();
        //type3
        System.out.println("Type 3:");
        Point3d p3=new Point3d(2,3,4);
        System.out.println("Call to Parent class Display:");
        p3.PointDisp();
        System.out.println();
        p3.Point3dDisp();
    }
}
