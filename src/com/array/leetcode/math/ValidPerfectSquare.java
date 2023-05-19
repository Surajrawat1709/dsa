package com.array.leetcode.math;

public class ValidPerfectSquare {
    public static void main(String[] args) {
        int n = 18;
        System.out.println(isPerfectSquare(n));
    }

    public static boolean isPerfectSquare(int num) {
        if (num < 2)
            return true;

        long first = 0;
        long last = num;

        while (first <= last) {
            long mid = first + (last - first) / 2;

            if (mid * mid == num) {
                return true;
            }
          else if(mid*mid>num){
                last=mid-1;
            }
          else{
              first=mid+1;
            }
        }
        return false;
    }
}

