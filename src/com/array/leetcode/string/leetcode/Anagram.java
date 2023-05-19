package com.array.leetcode.string.leetcode;

import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
       String s = "anagram", t = "nagaram";
        System.out.println(isAnagramHash(s,t));
        System.out.println(isAnagram(s,t));
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



        public static boolean isAnagramHash(String s, String t) {

        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if(map.get(ch)!=null){
                if(map.get(ch)==1){
                    map.remove(ch);
                }else{
                    map.put(ch,map.get(ch)-1);
                }
            }else{
                return false;
            }
        }
        return map.isEmpty();
    }
}

