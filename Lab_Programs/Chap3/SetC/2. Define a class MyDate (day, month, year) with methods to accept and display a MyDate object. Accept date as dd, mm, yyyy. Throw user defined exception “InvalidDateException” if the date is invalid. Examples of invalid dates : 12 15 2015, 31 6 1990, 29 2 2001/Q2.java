/*
2. Define a class MyDate (day, month, year) with methods to accept and display a MyDate
object. Accept date as dd, mm, yyyy. Throw user defined exception “InvalidDateException”
if the date is invalid. Examples of invalid dates : 12 15 2015, 31 6 1990, 29 2 2001
*/

package Chap3SetC_Q2;
import java.lang.*;
import java.util.Scanner;
import java.lang.Exception;

class InvalidDateException extends Exception{
    
    InvalidDateException(/*String msg*/){
        System.out.println("Invaild Date Entered");
        //System.out.println("message:"+msg);
    }
}
class MyDate{
    public int dd,mm,yyyy;
    public Scanner sc=new Scanner(System.in);
    
    MyDate(){
        try{
            System.out.println("Enter date:");
            System.out.println("Enter day dd:");
            this.dd=sc.nextInt();
            System.out.println("Enter month mm:");
            this.mm=sc.nextInt();
            System.out.println("Enter year yyyy:");
            this.yyyy=sc.nextInt();
            // months have 31 days(1,3,5,7,8,10,12)
            // months have 30 days (2,4,6,9,11)
            if(this.dd>=1 && this.dd<=31){
                if(this.mm>=1 && this.mm<=12){
                    if(this.yyyy>=1924 && this.yyyy<=2124){
                        if(this.mm==2 && this.dd<=29 && /*(this.yyyy%4==0&&this.yyyy%100==0) ||*/ this.yyyy%400==0 ){
                           //throw new InvalidDateException();
                           this.dateDisp();
                        }
//                        else{
//                           throw new InvalidDateException("Feb month can have date Greater than > 29"); 
//                        }
                        else if(this.mm==2 && this.dd<=28 && /*(this.yyyy%4==0&&this.yyyy%100==0) ||*/ this.yyyy%400!=0){
                            this.dateDisp();
                        }
                        else if(this.dd<=31 && (this.mm==1||this.mm==3||this.mm==5||this.mm==7||this.mm==8||this.mm==10||this.mm==12)){
                            //throw new InvalidDateException();
                            this.dateDisp();
                        }
                        /*
                        By adding parentheses around the month conditions, the && (logical AND) 
                        operator correctly applies to the entire grouped month condition, 
                        ensuring that both the day and month conditions are evaluated as intended.
                        */
//                        else{
//                           throw new InvalidDateException("Day Greater than > 31"); 
//                        }
                        else if(this.dd<=30 && (this.mm==4||this.mm==6||this.mm==9||this.mm==11)){
                            //throw new InvalidDateException();
                            this.dateDisp();
                        }
                        else{
                           throw new InvalidDateException(/*"Months April(04),June(06),September(09),November (11)"*/); 
                        } 
                    }
                    else{
                        throw new InvalidDateException(/*"Invaild Year"*/);
                    }
                }
                else{
                    throw new InvalidDateException(/*"Invaild Month"*/); 
                }
            }
            else{
               throw new InvalidDateException(/*"Invaild Day"*/); 
            }
        }
        catch(InvalidDateException obj){
            System.out.println("Exception:"+obj);
            System.exit(0);
        }
    }
    void dateDisp(){
        System.out.println("date:"+this.dd+" "+this.mm+" "+this.yyyy);
    }
}
public class Q2{
    public static void main(String[] args){
        MyDate obj=new MyDate();
        //obj.dateDisp();
    }
}
