package com.recursion.basic;

import java.util.Scanner;

public class Print1toN {
    public static void main(String[] args) {
        int n = 1;
        int m = 5;
        print1toN(n, m);
        backTrackingPrint1toN(n, m);
    }

    private static void backTrackingPrint1toN(int n, int m) {
        if (m < n)
            return;
        backTrackingPrint1toN(n, m - 1);
        System.out.println(m);
    }

    private static void print1toN(int n, int m) {
        if (m < n)
            return;
        System.out.println(n);
        print1toN(n + 1, m);
    }
}
