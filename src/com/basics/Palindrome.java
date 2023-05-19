package com.basics;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number or string to check fro palindrome");

        try{
            int s=sc.nextInt();
            System.out.println("int");
            isNumberPalindrome(s);

        }catch (Exception e){
            String s=sc.next();
            System.out.println("string");
            System.out.println(  isStringPalindrome(s));

        }

    }

    private static String isStringPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int len= str.length() -1;

        for (int i = 0; i < str.length() -1 ; i++) {
            if (str.charAt(i) != str.charAt(len-1-i)){
                return "String is not a palindrome";
            }
        }
    return "String is a palindrome";
    }

    private static void isNumberPalindrome(int n) {
int sum=0,rem=0;
int s=n;
while(s>0){
    rem=s%10;
    sum=(sum*10)+rem;
    s=s/10;
}
        System.out.println(sum);
if(sum==n)
        System.out.println("Number is palindrome");
    else
        System.out.println("Not a palindrome");
    }
}
