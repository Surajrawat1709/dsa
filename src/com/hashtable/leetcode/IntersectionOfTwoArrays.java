package com.hashtable.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5,6,6,8};
        int[] nums2 = {9,4,9,8,4,6,7,8};

        System.out.println(Arrays.toString(intersection(nums1,nums2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set1=new HashSet<>();
        for(int i:nums1){
            set1.add(i);
        }

        Set<Integer> set2=new HashSet<>();
        for(int i:nums2){
            set2.add(i);
        }

        Set<Integer> result=new HashSet<>();
        for(int i:set1){
            if(set2.contains(i)){
                result.add(i);
            }
        }
        int[] arr=new int[result.size()];
        int j=0;
        for(Integer i:result){
            arr[j]=i.intValue();
            j++;
        }

        return arr;

    }
}
