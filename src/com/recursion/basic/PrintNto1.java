package com.recursion.basic;

public class PrintNto1 {
    public static void main(String[] args) {
        int n=1,m=5;

        printNto1(n,m);
        backTrackNto1(n,m);
    }

    private static void backTrackNto1(int n, int m) {
        if(m<n)
            return;
backTrackNto1(n+1,m);
        System.out.println(n);
    }

    private static void printNto1(int n, int m) {
        if(m<n)
            return;

        System.out.println(m);
        printNto1(n,m-1);

    }
}
