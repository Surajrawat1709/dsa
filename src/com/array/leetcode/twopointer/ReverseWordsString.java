package com.array.leetcode.twopointer;

public class ReverseWordsString {
    public static void main(String[] args) {
       String s = "   the sky is blue   ";

        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {

        String[] str=s.split(" ");
        StringBuilder str1=new StringBuilder();

        for(int i=str.length-1;i>=0;i--){
            if(str[i]!=""){
                str1.append(str[i]).append(" ");
            }
        }

        return str1.toString().trim();
    }
}
