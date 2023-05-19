package com.hashtable.leetcode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        int len = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < len; i++) {

            if (map.containsKey(nums[i])) {
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }



            if(map.get(nums[i])>(len/2)){
                return nums[i];
            }
        }

return -1;
    }
}
