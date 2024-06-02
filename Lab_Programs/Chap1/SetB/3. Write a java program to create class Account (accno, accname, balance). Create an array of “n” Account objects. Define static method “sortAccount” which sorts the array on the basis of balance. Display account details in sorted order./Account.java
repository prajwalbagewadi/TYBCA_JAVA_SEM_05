/* 
3. Write a java program to create class Account (accno, accname, balance). Create an array
of “n” Account objects. Define static method “sortAccount” which sorts the array on the
basis of balance. Display account details in sorted order.
*/

import java.lang.String;
import java.util.Scanner;
import java.util.Arrays;
import java.io.*;

class Account{
    private int accno;String accname;double Bal;
    public Scanner sc = new Scanner(System.in);

    public Account(){
       
    }

    public Account(int a){
        System.out.println("Account Details:");
        System.out.println("Enter Account No:");
        this.accno=sc.nextInt();
        System.out.println("Enter Account Holders Name:");
        this.accname=sc.next();
        System.out.println("Enter Account Balance:");
        this.Bal=sc.nextDouble();
    }

    //quicksort method
    public static void swap(Account[] arr,int i,int j){
        Account temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int partition(Account[] arr,int low,int high){
        Account pivot=arr[high];
        int i=low;
        for(int j=low;j<high;j++){
            if(arr[j].Bal<pivot.Bal){
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, i, high);
        return i;
    }
    public static void quickSort(Account[] arr,int low,int high){
        if(low<high){
            int pi=partition(arr,low,high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }
    public static Account[] sorAccounts(Account[] arr){
       //quicksort algo
        int lenArr=arr.length;
        int low=0;
        int high=lenArr-1;
        quickSort(arr,low,high);
        //
        return arr;
    }

    public void Display(Account[] arr){
        for(int i=0;i<arr.length;i++){
           System.out.println("Acc_no="+arr[i].accno);
           System.out.println("Acc_name="+arr[i].accname);
           System.out.println("Acc_bal="+arr[i].Bal); 
        }
    }

    public static void main(String[] args){
        Account obj=new Account();
        System.out.println("enter No of Accounts:");
        int n=obj.sc.nextInt();
        Account[] acc=new Account[n];
        for(int i=0;i<acc.length;i++){
            acc[i]=new Account(i);
        }
        Account[] arr=Account.sorAccounts(acc);
        obj.Display(acc);
    }
}
