package com.sorting;

import java.sql.Array;

public class MergeSort {
    public static void main(String[] args) {
int[] arr={5,10,9,15,6,8,4,66};

        System.out.println(mergeSortArr(arr,0,arr.length-1));

    }

    private static int[] mergeSortArr(int[] arr, int start, int end) {

        if(start<end){
            int mid=start+(end-start)/2;
            mergeSortArr(arr,start,mid);
            mergeSortArr(arr,mid+1,end);
            mergeArr(arr,start,mid,end);

        }
return arr;
    }

    private static void mergeArr(int[] arr, int start, int mid, int end) {

        int n1= (mid-start)+1;
        int n2=end-mid;

        int[] arr1=new int[n1+1];
        int[] arr2=new int[n2+1];

        for(int i=0;i<n1;i++){
            arr1[i]=arr[(start+i)-1];
        }
        for(int i=0;i<n1;i++){
            arr1[i]=arr[(mid+i)];
        }

        arr1[n1+1]=100000;
        arr[n2+1]=100000;

        int i=0,j=0;
        int k=0;

       while(i<n1&&j<n2){
            if(arr1[i]<=arr2[j]){
                arr[k]=arr1[i];
                i++;
            }
            else{
                arr[k]=arr2[j];
                j++;
            }
            k++;
        }



    }
}
