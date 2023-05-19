package com.array.leetcode.slidingwindow;


// Given an array of integers of size ‘n’
//         Our aim is to calculate the maximum sum of ‘k’ consecutive elements in the array.

public class MaxSumOfKConsecutive {
    public static void main(String[] args) {

        int arr[] = {1, 4, 0,0,0};
        int k = 4;
        int n = arr.length;
        System.out.println(maxSum(arr, n, k));
        //24
    }

    private static int maxSum(int[] arr, int n, int k) {
        int len = arr.length;
        int max = 0, sum = 0;
        int i = 0, j = 0;

        while (j < len) {
            sum += arr[j];

            if (j-i+1<k){
                j++;
            } else if (j-i+1==k) {
                max=Math.max(max,sum);
                sum=sum-arr[i];
                i++;
                j++;
            }

        }


        return max;

    }


}
