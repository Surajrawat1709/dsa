package com.hashtable.leetcode;

//Find Resultant Array After Removing Anagrams
import java.util.ArrayList;
import java.util.List;

public class ResultantArrayAfterRemovingAnagrams {
    public static void main(String[] args) {
       String[] words = {"abba","baba","bbaa","cd","cd"};

        System.out.println(removeAnagrams(words));

    }
    public static List<String> removeAnagrams(String[] words) {
List<String> list=new ArrayList<>();

for(String i:words) {
    list.add(i);
}

for(int i=list.size()-1;i>0;i--){
if(isAnagram(list.get(i),list.get(i-1))){
list.remove(i);
}

}

return list;
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
