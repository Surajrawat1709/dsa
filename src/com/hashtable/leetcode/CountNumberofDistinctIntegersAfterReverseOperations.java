package com.hashtable.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountNumberofDistinctIntegersAfterReverseOperations {
    public static void main(String[] args) {
        int[] nums = {1, 13, 10, 12, 31};
        System.out.println(countDistinctIntegers(nums));
    }

    public static int countDistinctIntegers(int[] nums) {
int len=nums.length;
Map<Integer,Integer> map=new HashMap<>();

int[] arr=new int[len*2];

for(int i=0;i<len;i++){
    arr[i]=nums[i];
    arr[i+len]= reverse(nums[i]);
}
        System.out.println(Arrays.toString(arr));

for(int i=0;i<len;i++){
    if(map.containsKey(arr[i])){
        map.put(arr[i],map.get(arr[i]+1));
    }
    else{
        map.put(arr[i],1);
    }
}
        System.out.println(map);
return map.size();
    }
    public static int reverse(int n){
        int rev=0;

        while(n>0){
            rev=rev*10+n%10;
            n/=10;
        }
        return rev;
    }
}
