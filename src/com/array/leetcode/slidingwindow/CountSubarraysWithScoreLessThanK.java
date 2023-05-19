package com.array.leetcode.slidingwindow;

public class CountSubarraysWithScoreLessThanK {
    public static void main(String[] args) {
        int[] nums = {2, 1, 4, 3, 5};
        int k = 10;

        System.out.println(countSubarrays(nums,k));
    }
    public static long countSubarrays(int[] nums, long k) {

        long sum = 0, res = 0;
        for (int i = 0, j = 0; i < nums.length; ++i) {
            sum += nums[i];
            while (sum * (i - j + 1) >= k)
                sum -= nums[j++];
            res += i - j + 1;
        }
        return res;
    }
}