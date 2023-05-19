package com.array.leetcode.prefixsum;

import java.util.Arrays;

public class LeftandRightSumDifferences {
    public static void main(String[] args) {
        int[] arr = {10, 4, 8, 3};

        System.out.println(Arrays.toString(leftRigthDifference(arr)));
    }

    public static int[] leftRigthDifference(int[] nums) {

        int len=nums.length;

int[] leftSum=new int[len];
int[] rightSum=new int[len];

leftSum[0]=rightSum[len-1]=0;

for(int i=1;i<len;i++){
    leftSum[i]=nums[i-1]+leftSum[i-1];
}
for(int i=len-2;i>=0;i--){
    rightSum[i]=nums[i+1]+rightSum[i+1];
}
int[] ans=new int[len];

for(int i=0;i<len;i++){
    ans[i]=Math.abs(leftSum[i]-rightSum[i]);
}
return ans;
    }
}