package com.hashtable.leetcode;

import java.util.HashMap;
import java.util.Map;

public class NRepeatedElementInSize2NArray {
    public static void main(String[] args) {
       int[] nums = {2,1,2,5,3,2};
        System.out.println(repeatedNTimes(nums));
       System.out.println(brute(nums));
    }

    private static int repeatedNTimes(int[] nums) {
Map<Integer,Integer> map=new HashMap<>();
int len=nums.length;
int value=0;

for(int i:nums){
    if(map.containsKey(nums[i])){
        value=nums[i];
    }
    map.put(nums[i],i);
}
return value;
    }

    public static int brute(int[] nums) {
int len=nums.length;
int value=0;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(nums[i]==nums[j]){
                    value= nums[i];
                }
            }
        }
        return value;
    }
}
