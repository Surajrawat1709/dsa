package com.hashtable.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
   int[] nums = {2,7,11,15};
   int target = 9;
        System.out.println(Arrays.toString(twoSum(nums,target)));
}
    public static int[] twoSum(int[] nums, int target) {
int len= nums.length;
        int[] arr=new int[2];

        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<len;i++){
            if(map.containsKey(target-nums[i])){
                arr[1]=i;
                arr[0]=map.get(target-nums[i]);
            }
            map.put(nums[i],i);
        }

return arr;
    }
}
