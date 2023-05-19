package com.array.leetcode.prefixsum;

public class FindPivotIndex {
    public static void main(String[] args) {
       int[] nums = {2,1,-1};

        System.out.println(easypivotIndex(nums));
        System.out.println(pivotIndex(nums));

    }

    private static int easypivotIndex(int[] nums) {
        int len=nums.length;

        int sum =0;
        int leftSum=0;
        int rightSum=0;

        for(int i=0;i<len;i++){
            sum+=nums[i];
        }

        for(int i=0;i<len;i++){
    leftSum+= nums[i];
    rightSum=sum-leftSum;

    if(rightSum==leftSum){
        return i;
    }
        }
        return -1;

    }

    public static int pivotIndex(int[] nums) {
int len=nums.length;
int num=0;
        int[] leftSum=new int[len];
        int[] rightSum=new int[len];
leftSum[0]=rightSum[len-1]=0;

        for(int i=1;i<len;i++){
            leftSum[i]=leftSum[i-1]+nums[i-1];
        }

for(int i=len-2;i>=0;i--){
    rightSum[i]=rightSum[i+1]+nums[i+1];
}
for(int i=0;i<len;i++){
    if(rightSum[i]==leftSum[i]){
      return i;
    }
}

return -1;
    }
}
