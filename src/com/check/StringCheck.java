package com.check;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringCheck {
    public static void main(String[] args) {
int[] arr={1,1,2,3,3,3,4,4,4,4};

        System.out.println(removeDuplicates(arr));
    }
        public static int removeDuplicates(int[] nums) {

            int j = 1;
            for(int i = 1; i < nums.length; i++) {
                if ((nums[i - 1] != nums[i])){
                    nums[j] = nums[i];
                    j++;
                }
            }
            return j;

        }
}
