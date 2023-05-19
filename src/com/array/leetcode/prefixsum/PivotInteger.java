package com.array.leetcode.prefixsum;

public class PivotInteger {
    public static void main(String[] args) {
        int n=8;


        System.out.println(pivotInteger(n));

    }

    public static int pivotInteger(int n) {
        int sum=0,leftSum=0,rightSum=0;

        for(int i=1;i<=n;i++){
            sum+=i;
        }


        for(int i=1;i<=n;i++){

            leftSum+=i;
            rightSum=sum-leftSum;

            if(leftSum==rightSum+i){
                return i;

            }

        }
        return -1;

    }
}
