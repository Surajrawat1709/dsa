package com.array.leetcode.slidingwindow;

import java.util.Arrays;

public class MinDifferenceBetweenHighestandLowestofKScores {
    public static void main(String[] args) {
        int[] nums = {9,4,1,7};
        int k = 2;
        System.out.println(minimumDifference(nums,k));
    }
    public static int minimumDifference(int[] nums, int k) {
            Arrays.sort(nums);
            int minDiff = Integer.MAX_VALUE;
            for(int i=0;i<nums.length;i++){
                if(i>=k-1)
                    minDiff = Math.min(minDiff,nums[i]-nums[i-(k-1)]);
            }
            return minDiff;
        }
        }

