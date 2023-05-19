package com.searching;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={5,10,4,32,66,55};
        int n=6;

        System.out.println(findNoBS(arr,n));
    }

    private static int findNoBS(int[] arr, int n) {
        Arrays.sort(arr);

        int first=0;
        int last=arr.length-1;

        while(first<=last){
            int mid=first+(last-first)/2;

            if(arr[mid]==n){
              return arr[mid];
            } else if (arr[mid]>n) {
                last=mid-1;
            }else{
                first=mid+1;
            }
        }

return -1;

    }
}
