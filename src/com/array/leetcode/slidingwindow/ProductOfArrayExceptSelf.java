package com.array.leetcode.slidingwindow;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
       int[] nums = {-1,1,0,-3,3};

        System.out.println(Arrays.toString(productExceptSelf(nums)));
        System.out.println(Arrays.toString(productExceptSelfByDivision(nums)));
    }

    private static int[] productExceptSelfByDivision(int[] nums) {
        int n = nums.length;
        int countZeroes = 0;
        int indexZero = -1;
        int productWithoutZero = 1;

        for(int i = 0 ; i < n ; i++) {
            if(nums[i] == 0) {
                countZeroes++;
                indexZero = i;
            }
            else {
                productWithoutZero *= nums[i];
            }
        }

        int [] output = new int [n];
        if(countZeroes == 0) {
            for(int i = 0 ; i < n ; i++) {
                output[i] = productWithoutZero / nums[i];
            }
        }
        else if(countZeroes == 1) {
            output[indexZero] = productWithoutZero;
        }
        return output;
    }

    public static int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int ans[] = new int[n];
        Arrays.fill(ans, 1);
        int curr = 1;
        for(int i = 0; i < n; i++) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        curr = 1;
        for(int i = n - 1; i >= 0; i--) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        return ans;
    }

}
