package SetC;

/*
4. Write a Java program create class as MyDate with dd,mm,yy as data members. Write
default and parameterized constructor. Display the date in dd-mm-yy format.(Use this
keyword)
*/
/* 
Public: Accessible everywhere. Has the widest scope among all other modifiers.
Protected: Accessible within the package and outside the package through child class.
Default: Only accessible within the package. Cannot be accessed from outside the package.
Private: Only accessible within the class. Cannot be accessed from outside the class.
*/

//import java.lang.*;
import java.util.Scanner;
//import java.io.*;


public class MyDate{
  private  int dd,mm,yy,limit;
  public MyDate(){
    this.dd=01;
    this.mm=01;
    this.yy=1600;
  }
  public MyDate(int d,int m,int y){
    if(y>=1600 && y<=2116){
      if(m>=1 && m<=12){
        if(y%4==0){
          if(m==2){
            limit=29;
            if(d>=1 && d<=limit){
              this.dd=d;
              this.mm=m;
              this.yy=y;
            }
            else{
              System.out.println("day Error");
            }
          }
          else{
            if(m==1 || m==3 || m==5 || m==6 || m== 8 || m==10 || m==12){
              limit=31;
              if(d>=1 && d<=limit){
                this.dd=d;
                this.mm=m;
                this.yy=y;
              }
              else{
                System.out.println("day Error");
              }
            }
            else{
              limit=30;
              if(d>=1 && d<=limit){
                this.dd=d;
                this.mm=m;
                this.yy=y;
              }
              else{
                System.out.println("day Error");
              }
            }
          } 
        }
        else{
          if(m==1 || m==3 || m==5 || m==6 || m== 8 || m==10 || m==12){
            limit=31;
            if(d>=1 && d<=limit){
              this.dd=d;
              this.mm=m;
              this.yy=y;
            }
          }
          else{
            limit=30;
            if(d>=1 && d<=limit){
              this.dd=d;
              this.mm=m;
              this.yy=y;
            }
          }
        }
      }
      else{
        System.out.println("month Error");
      }
    }
    else{
      System.out.println("Year Error");
    }
  }
  public String showDate(){
    return (this.dd+" "+this.mm+" "+this.yy);
  }

//  public static void main(String[] args){
//    int d,m,y;
//    System.out.print("Enter Date in format:");
//    Scanner sc = new Scanner(System.in);
//    System.out.print("Enter Date : day:");
//    d=sc.nextInt();
//    System.out.print("Enter Date : month :");
//    m=sc.nextInt();
//    System.out.print("Enter Date : year :");
//    y=sc.nextInt();
//
//    MyDate obj1=new MyDate();
//    MyDate obj2=new MyDate(d,m,y);
//    obj1.showDate();
//    obj2.showDate();
//    sc.close();
//  }
}
