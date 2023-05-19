package com.array.leetcode.math;

public class SqrtX {
    public static void main(String[] args) {

        int x = 10;
        System.out.println(realSolutiom(x));
        // System.out.println(mySqrt(x));

    }
    private static int realSolutiom(int x) {

        if (x == 0)
            return 0;

        long first = 0;
        long last = x;

        while (first <= last) {

            long mid = first + (last - first) / 2;
            System.out.println(mid);
            if (mid * mid == x) {
                return (int)mid;
            } else if (mid * mid > x) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }

        }
        return (int)last;
    }


    public static int mySqrt(int x) {
        int sqrt = 0;
        for (int i = 1; i < x / 2; i++) {
            int a = i * i;
            int b = (i + 1) * (i + 1);
            if (x >= a && x <= b) {
                sqrt = i;
            }

        }
        return sqrt;
    }
}

