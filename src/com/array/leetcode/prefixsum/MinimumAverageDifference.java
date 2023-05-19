package com.array.leetcode.prefixsum;

public class MinimumAverageDifference {
    public static void main(String[] args) {
        int[] nums = {2, 5, 3, 9, 5, 3};

        System.out.println(minimumAverageDifference(nums));
    }

    public static int minimumAverageDifference(int[] nums) {

        int len = nums.length;
        int sum = 0;
        int index = 0;
        int min = Integer.MAX_VALUE;
        int leftSum = 0, rightSum = 0;


        for (int i = 0; i < len; i++) {
            sum += nums[i];
        }

        for (int i = 0; i < len; i++) {
            leftSum += nums[i];
            rightSum = sum - leftSum;

            int avgLeftSum = 0;
            int avgRightSum = 0;

            avgLeftSum = leftSum / (i + 1);

            avgLeftSum = leftSum / (i + 1);
            if (rightSum != 0) {
                avgRightSum = rightSum / (len - i - 1);
            }


            int diff = Math.abs(avgLeftSum - avgRightSum);

            if (diff < min) {
                min = diff;
                index = i;
            }


        }

        return index;
    }
}
