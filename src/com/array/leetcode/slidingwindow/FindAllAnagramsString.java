package com.array.leetcode.slidingwindow;

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagramsString {
    public static void main(String[] args) {
     //  String s = "cbaebabacd", p = "abc";
      String s = "ab", p = "eidbaooo";
        System.out.println(findAnagrams(s,p));
    }
        public static boolean findAnagrams(String s, String p) {
            List<Integer> list=new ArrayList<>();
int len=p.length();
int i=0,j=0;
int k=s.length();
while(j<len){
    if(j-i+1<k){
        j++;
    }else if(j-i+1==k){
       String str= p.substring(i,j+1);
        if(isAnagram(str,s)){
          //  list.add(i);
            return true;
        }
            j++;
        i++;
    }

}
//return list;
            return false;
        }

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
