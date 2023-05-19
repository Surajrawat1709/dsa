package com.hashtable.leetcode;

import java.util.HashMap;
import java.util.Map;

//Given a non-empty array of integers nums, every element appears twice except for one.
// Find that single one.
public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {-1,-1,-2};
        System.out.println(singleNumber(nums));
        System.out.println(singleNumberXOR(nums));
    }

    private static int singleNumberXOR(int[] nums) {
        // easily solved with XOR; when the same number is XORed, the result is 0.
        // just loop through the elements and XOR them; the non repeating number remains.
        int ans =0;
        for(int i=0;i<nums.length;i++){
            ans=ans^nums[i];
        }
        return ans;
    }


    public static int singleNumber(int[] nums) {
        int len=nums.length;

        Map<Integer,Integer> map=new HashMap<>();


        for(int i=0;i<len;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }else{
            map.put(nums[i],1);
        }}


        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }
}
