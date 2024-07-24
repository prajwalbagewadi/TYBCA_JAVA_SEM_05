/*
3. Write a java program to accept details of n customers (c_id, cname, address, mobile_no)
from user and store it in a file (Use DataOutputStream class). Display the details of
customers by reading it from file.(Use DataInputStream class)
*/

package Chap3SetB_Q3;
import java.lang.*;
import java.util.Scanner;
import java.io.IOException;
//import java.io.File;
import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;

class Customer{
    public int c_id;
    public String cname,address;
    public long mobile_no;
    public static Scanner sc=new Scanner(System.in);
    Customer(){
        System.out.println("Enter Customer Details:");
        System.out.println("Enter Customer id:");
        this.c_id=sc.nextInt();
        System.out.println("Enter Customer Name:");
        this.cname=sc.next();
        System.out.println("Enter Customer Address:");
        //String temp=sc.next();
        this.address=sc.next();
        System.out.println("Enter Customer Mobile_no:");
        this.mobile_no=sc.nextLong();
    }
    void customerDisp(){
        System.out.println();
        System.out.println("Customer Details:");
        System.out.println("Customer Id:"+this.c_id);
        System.out.println("Customer Name:"+this.cname);
        System.out.println("Customer Address:"+this.address);
        System.out.println("Customer Mobile:"+this.mobile_no);
        System.out.println();
    }
}
public class Q3{
    public static void main(String[] args) throws IOException{
        //File f=new File("C:\\Users\\bagew\\Documents\\NetBeansProjects\\Chap3SetB_Q3\\src\\Chap3SetB_Q3\\Customer.txt");
        FileOutputStream fos=new FileOutputStream("C:\\Users\\bagew\\Documents\\NetBeansProjects\\Chap3SetB_Q3\\src\\Chap3SetB_Q3\\Customer.txt");
        FileInputStream fis=new FileInputStream("C:\\Users\\bagew\\Documents\\NetBeansProjects\\Chap3SetB_Q3\\src\\Chap3SetB_Q3\\Customer.txt");
        DataOutputStream dout=new DataOutputStream(fos);
        DataInputStream din=new DataInputStream(fis);
        System.out.println("Enter No Customers:");
        int n=Customer.sc.nextInt();
        Customer[] cust=new Customer[n];
        for(int i=0;i<n;i++){
            cust[i]=new Customer();
//          dout.writeUTF("Customer Details:\n");
//          dout.writeUTF("cus id:"+cust[i].c_id+"\n");
//          dout.writeUTF("cus name:"+cust[i].cname+"\n");
//          dout.writeUTF("cus address:"+cust[i].address+"\n");
//          dout.writeUTF("cus mobile:"+cust[i].mobile_no+"\n");
            dout.writeInt(cust[i].c_id);
            dout.writeUTF(cust[i].cname);
            dout.writeUTF(cust[i].address);
            dout.writeLong(cust[i].mobile_no);
        }
        for(int i=0;i<n;i++){
            System.out.println("Data Read from File:");
            System.out.println();
            int c_id=din.readInt();
            System.out.println("Customer id:"+c_id);
            String cname=din.readUTF();
            System.out.println("Customer Name:"+cname);
            String address=din.readUTF();
            System.out.println("Customer Address:"+address);
            long mobile_no=din.readLong();
            System.out.println("Customer Mobile_no:"+mobile_no);
        }
    }
}
