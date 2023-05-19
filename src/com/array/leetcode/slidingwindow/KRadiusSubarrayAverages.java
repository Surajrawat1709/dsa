package com.array.leetcode.slidingwindow;

import java.util.Arrays;

public class KRadiusSubarrayAverages {
    public static void main(String[] args) {
        int[] nums = {7, 4, 3, 9, 1, 8, 5, 2, 6};
        int k = 3;
        System.out.println(Arrays.toString(getAverages(nums, k)));
    }

    public static int[] getAverages(int[] nums, int k) {
        int len = nums.length;
        long[] arr = new long[len + 1];

        for (int i = 0; i < len; i++) {
            arr[i + 1] = arr[i] + nums[i];
        }

        int[] res = new int[len];

        Arrays.fill(res, -1);

        for (int i = k; i < len - k; i++) {
            res[i] = (int) ((arr[i + k + 1] - arr[i - k]) / (k * 2 + 1));
        }

        return res;

    }
}