package com.array.leetcode.prefixsum;

public class NumberOfWaysToSplitArray {
    public static void main(String[] args) {
        int[] nums = {2,3,1,0};

        System.out.println(waysToSplitArray(nums));
        System.out.println(easywaysToSplitArray(nums));

    }

    private static int easywaysToSplitArray(int[] nums) {
        int n = nums.length;
        int count = 0;
        long sum = 0;
        long leftSum = 0;
        long rightSum = 0;

        for(int i=0;i<n;i++){
            sum += nums[i];
        }

        for(int j = 0;j<n-1;j++){
            leftSum += nums[j];
            rightSum = sum-leftSum;

            if(leftSum>=rightSum){
                count++;
            }
        }

        return count;
    }

    public static int waysToSplitArray(int[] nums) {
int len=nums.length;
       long[] leftSum=new long[len-1];
        long[] rightSum=new long[len-1];
        int count=0;
        leftSum[0]=nums[0];
        rightSum[len-2]=nums[len-1];

        for(int i=1;i<len-1;i++){
            leftSum[i]=leftSum[i-1]+nums[i];
        }

        for(int i=len-3;i>=0;i--){
            rightSum[i]=rightSum[i+1]+nums[i+1];
        }

        for(int i=0;i<len-1;i++){
            if(leftSum[i]>=rightSum[i])
                count++;
        }

        return count;
    }


}
