package com.array.leetcode.twopointer;

public class ReverseString {
    public static void main(String[] args) {
       char[] s = {'h','e','l','l','o'};

        System.out.println(reverseString(s));

    }

    public static char[] reverseString(char[] s) {

        int len=s.length;
        int i=0;
        int j=len-1;
        int k=0;
        char[] arr=new char[len];

        while(i<=j){
            swap(s,s[i],s[j]);
            i++;
            j--;
        }
return s;
    }

    public static void swap(char[] arr,char i,char j){
        char temp=i;
        i=j;
        j=temp;
    }
}

