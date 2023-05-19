package com.array.leetcode.slidingwindow;

public class MaximumAverageSubarray {
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
                int k = 4;
        System.out.println(findMaxAverage(nums,k));
    }
    public static double findMaxAverage(int[] nums, int k) {
        int len=nums.length;
        int i=0,j=0;
        int sum=0;
        double avg=1.0;
        double max=0;

        while(j<len){
            sum+=nums[j];

            if(j-i+1<k){
                j++;
            }else if(j-i+1==k){
                avg=sum/k;
                max=Math.max(max,avg);
                sum-=nums[i];
                i++;
                j++;

            }

        }

        return max;

    }
    }

