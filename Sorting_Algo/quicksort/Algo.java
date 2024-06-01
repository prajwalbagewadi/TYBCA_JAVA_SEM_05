/*
Quick sort algorithm :
*/

import java.lang.*;
import java.util.*;
import java.io.*;

public class Algo{
    public void printarr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    //                                  0       n-1
    public int partition(int[] arr,int low,int high){
       int pivot=arr[high];
       int i=low;
       for(int j=low;j<high;j++){
        if(arr[j]<pivot){
            swap(arr,i,j);
            i++;
        }
       }
       swap(arr,i,high);
       /* i++; 
        Your code appears to implement the quicksort algorithm in Java. 
        However, there's a slight issue in the partition method 
        where the final increment of i before returning its value is redundant. 
        The correct implementation should return i directly without incrementing it again.
       */
       return (i++);
    }
    public void quickSort(int[] arr,int low,int high){
        if(low<high){
            int pi=partition(arr, low, high);
            System.out.println("pi="+pi);
            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);
        }
    }

    public static void main(String[] args){
        int unsorted[]=new int[]{10,80,30,90,40};
        int n=unsorted.length;
        System.out.println("n="+n);
        Algo obj=new Algo();
        obj.printarr(unsorted);
        //System.out.println("length of arr="+(unsorted.length-1));
        obj.quickSort(unsorted,0,n-1);
        
        obj.printarr(unsorted);
    }
}
