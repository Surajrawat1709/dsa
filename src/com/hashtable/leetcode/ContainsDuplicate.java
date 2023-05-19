package com.hashtable.leetcode;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public static void main(String[] args) {
       int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int[] nums) {
        int len=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        int count=1;
        for(int i=0;i<len;i++){
            if(map.containsKey(nums[i])){
              return true;
            }
            else{
                map.put(nums[i],i);
            }
        }
        return false;
    }
}
