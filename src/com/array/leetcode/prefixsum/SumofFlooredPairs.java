package com.array.leetcode.prefixsum;

public class SumofFlooredPairs {
    public static void main(String[] args) {
        int[] nums = {2,5,9};
        System.out.println(sumOfFlooredPairs(nums));
        System.out.println(sumOfFlooredPairsN2(nums));
    }

    private static int sumOfFlooredPairs(int[] nums) {
        return 0;

    }

    public static int sumOfFlooredPairsN2(int[] nums) {

        int len=nums.length;
        int div=0,sum=0;

        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){

                div=(nums[i]/nums[j]);
                sum+=div;

            }
        }

        return sum;

    }
}
