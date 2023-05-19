package com.hashtable.leetcode;

import java.util.HashMap;
import java.util.Map;

public class CountGoodMeals {
    static int mod = 1000000007;
    public static void main(String[] args) {
        int[] deliciousness = {1,1,1,3,3,3,7};
     //  System.out.println(countPairsBrute(deliciousness));
      System.out.println(countPairs(deliciousness));
    }
    public static int countPairs(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        long res = 0;
        for (int num : arr) {
            int power = 1;
            for (int i = 0; i < 22; i++) {
                if (map.containsKey(power - num)) {
                    res += map.get(power - num);
                    res %= mod;
                }
                power *= 2;
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return (int) res;
    }

    public static int countPairsBrute(int[] arr) {
        int len=arr.length;
        int count=0;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(isPowerofTwo(arr[i]+arr[j])){
                    count++;
                }
            }
        }
return count;
    }
    public static boolean isPowerofTwo(long n)
    {
        return (n != 0) && ((n & (n - 1)) == 0);
    }
//    static boolean isPowerOfTwo(int n)
//    {
//        if (n == 0)
//            return false;
//
//        while (n != 1) {
//            if (n % 2 != 0)
//                return false;
//            n = n / 2;
//        }
//        return true;
//    }

}
