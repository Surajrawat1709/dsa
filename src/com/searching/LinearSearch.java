package com.searching;

public class LinearSearch {
    public static void main(String[] args) {
        LinearSearch obj=new LinearSearch();

        int[] arr={5,10,4,32,66,55};
        int n=33;

        System.out.println(obj.findLinearSearch(arr,n));

    }

    public Boolean findLinearSearch(int[] arr,int n){

        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                return true;
            }
        }

        return false;
    }
}
