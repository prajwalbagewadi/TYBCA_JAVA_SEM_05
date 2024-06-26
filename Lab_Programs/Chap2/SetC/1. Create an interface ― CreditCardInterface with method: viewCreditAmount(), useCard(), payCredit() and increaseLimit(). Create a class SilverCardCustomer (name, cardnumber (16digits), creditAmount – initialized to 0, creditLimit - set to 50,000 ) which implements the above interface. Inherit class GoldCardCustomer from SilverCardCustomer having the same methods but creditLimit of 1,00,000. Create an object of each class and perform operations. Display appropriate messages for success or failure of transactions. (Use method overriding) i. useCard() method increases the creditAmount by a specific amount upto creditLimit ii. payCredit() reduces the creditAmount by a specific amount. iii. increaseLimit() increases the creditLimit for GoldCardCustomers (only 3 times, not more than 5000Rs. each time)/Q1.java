/*
1. Create an interface ― CreditCardInterface with method: viewCreditAmount(), useCard(),
payCredit() and increaseLimit(). Create a class SilverCardCustomer (name,
cardnumber (16digits), creditAmount – initialized to 0, creditLimit - set to 50,000 ) which
implements the above interface. Inherit class GoldCardCustomer from
SilverCardCustomer having the same methods but creditLimit of 1,00,000. Create an
object of each class and perform operations. Display appropriate messages for success or
failure of transactions. (Use method overriding)
i. useCard() method increases the creditAmount by a specific amount upto creditLimit
ii. payCredit() reduces the creditAmount by a specific amount.
iii. increaseLimit() increases the creditLimit for GoldCardCustomers (only 3 times,
not more than 5000Rs. each time)
*/

package Chap2_setC_q1;
import java.lang.*;
import java.util.*;
import java.io.*;

interface CreditCardInterface{
    public abstract void viewCreditAmount();
    public abstract void useCard();
    public abstract void payCredit();
    public abstract void increaseLimit();
}
class SilverCardCustomer implements CreditCardInterface{
    private String cname;
    private long cardno;
    /*
    The long contains minimum value of -2^63 and a maximum value of 2^63-1.
    The long can represent as an unsigned 64-bit long, which has a minimum value of 0 and a maximum value of 2^64-1.
    Its default value is 0L.
    Its default size is 8 byte.
    It is used when you need a higher range integer value.
    */
    private double creditAmt=0;
    private double creditlimit=50000;
    public Scanner sc = new Scanner(System.in);
    public SilverCardCustomer(){
        System.out.println("---Silver Card Customer---");
        this.cname=this.getName();
        this.cardno=this.generateCardNo();
        System.out.println("---END---");
        
    }
    public String getName(){
        System.out.println("Customer name:");
        String name=sc.nextLine();
        return name;
    }
    public long generateCardNo(){ // method to generate 16 digit random number;
        Random rand=new Random();
        long start=1111_1111_1111_1111L;
        long end=9999_9999_9999_9999L;
        long rnd=rand.nextLong(start, end);
        System.out.println("rnd_no="+rnd);
        return rnd;
    }
    @Override
    public void viewCreditAmount(){
        System.out.println("---Silver Card Customer---");
        System.out.println("Card Name:"+this.cname);
        System.out.println("Card No:"+this.cardno);
        System.out.println("Credit amount="+this.creditAmt);
        System.out.println("Credit Card Limit="+this.creditlimit);
        System.out.println("---END---");
    }
    @Override
    public void useCard(){
        System.out.println("---Use_Card---");
        System.out.println("Enter the Amount To Use:");
        double amt=sc.nextDouble();
        if(amt!=0){
            if(amt<=this.creditlimit){
                this.creditAmt=this.creditAmt+amt;
                System.out.println("Amount Successfully Added On Card="+amt);
                this.viewCreditAmount();
            }
            else{
                System.out.println("Amount Exccedes Credit Card limit="+this.creditlimit);  
            }
        }
        else{
            System.out.println("Amount Entered is Zero="+amt);
        }
        System.out.println("---END---");
    }
    @Override
    public void payCredit(){
        System.out.println("---Pay_Credit---");
        System.out.println("Enter the Amount To Pay:");
        double amt=sc.nextDouble();
        if(amt!=0){
            if(amt<=this.creditlimit){
                if(amt<=this.creditAmt){
                    this.creditAmt=this.creditAmt-amt;
                    System.out.println("Amount Successfully Subtracted On Card="+amt);
                    this.viewCreditAmount();
                }
                else{
                     System.out.println("Amount Exccedes Credit Amount on Card="+this.creditAmt);
                }
            }
            else{
                 System.out.println("Amount Exccedes Credit Card limit="+this.creditlimit);
            }
        }
        else{
            System.out.println("Amount Entered is Zero="+amt);
        }
        System.out.println("---END---");
    }
    @Override
    public void increaseLimit(){
        System.out.println("---Silver Card Customer---");
        System.out.println("Service Not Available!");
        System.out.println("---END---");
    }
}
class GoldCardCustomer extends SilverCardCustomer{
    private String cname;
    private long cardno;
    private double creditAmt=0;
    private double creditlimit=100000;
    public int inclimitcnt=0;
    public GoldCardCustomer(){
        System.out.println("---Gold Card Customer---");
        this.cname=super.getName();
        this.cardno=super.generateCardNo();
        System.out.println("---END---");
    }
    @Override
    public void viewCreditAmount(){ //overriden method
        System.out.println("---Gold Card Customer---");
        System.out.println("Card Name:"+this.cname);
        System.out.println("Card No:"+this.cardno);
        System.out.println("Credit Card Amount="+this.creditAmt);
        System.out.println("Credit Card Limit="+this.creditlimit);
        System.out.println("---END---");
    }
    @Override
    public void useCard(){
        System.out.println("---Use_Card---");
        System.out.println("Enter the Amount To Use:");
        double amt=sc.nextDouble();
        if(amt!=0){
            if(amt<=this.creditlimit){
                this.creditAmt=this.creditAmt+amt;
                System.out.println("Amount Successfully Added On Card="+amt);
                this.viewCreditAmount();
            }
            else{
                System.out.println("Amount Exccedes Credit Card limit="+this.creditlimit);  
            }
        }
        else{
            System.out.println("Amount Entered is Zero="+amt);
        }
        System.out.println("---END---");
    }
    @Override
    public void payCredit(){
        System.out.println("---Pay_Credit---");
        System.out.println("Enter the Amount To Pay:");
        double amt=sc.nextDouble();
        if(amt!=0){
            if(amt<=this.creditlimit){
                if(amt<=this.creditAmt){
                    this.creditAmt=this.creditAmt-amt;
                    System.out.println("Amount Successfully Subtracted On Card="+amt);
                    this.viewCreditAmount();
                }
                else{
                     System.out.println("Amount Exccedes Credit Amount on Card="+this.creditAmt);
                }
            }
            else{
                 System.out.println("Amount Exccedes Credit Card limit="+this.creditlimit);
            }
        }
        else{
            System.out.println("Amount Entered is Zero="+amt);
        }
        System.out.println("---END---");
    }
    @Override
     public void increaseLimit(){ //overriden method
        System.out.println("---Increase_Limit---");
        System.out.println("Enter the Amount To Increase Credit Limit:");
        double amt=sc.nextDouble();
        System.out.println("---Gold Card Customer---");
        if(this.inclimitcnt<3){
            if(amt<=5000){
                this.creditlimit=this.creditlimit+amt;
                System.out.println("card limit Successfully Increased by Entered amt="+amt);
                this.inclimitcnt++;
                System.out.println("Number of Times Remaining="+(3-this.inclimitcnt));
            }
            else{
                 System.out.println("Amount Should not be Greater than 5000 Entered amt="+amt);
            }
        }
        else{
            System.out.println("You Have Exceeded your increase Limit!");
        }
        System.out.println("---END---");
    }
}
public class Q1{
    public static void main(String[] args){
        System.out.println("1");
        SilverCardCustomer scardcus1=new SilverCardCustomer();
        System.out.println("2");
        scardcus1.viewCreditAmount();
        System.out.println("3");
        scardcus1.useCard();
        System.out.println("4");
        scardcus1.payCredit();
        System.out.println("5");
        scardcus1.increaseLimit();
        System.out.println("6");
        scardcus1.viewCreditAmount();
        System.out.println("7");
        GoldCardCustomer Gcardcus1=new GoldCardCustomer();
        System.out.println("8");
        Gcardcus1.viewCreditAmount();
        System.out.println("9");
        Gcardcus1.useCard();
        System.out.println("10");
        Gcardcus1.payCredit();
        System.out.println("11");
        Gcardcus1.increaseLimit();
        System.out.println("12");
        Gcardcus1.viewCreditAmount();
    }
}
