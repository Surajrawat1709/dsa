package com.array.leetcode.slidingwindow;

//Minimum Recolors to Get K Consecutive Black Blocks
public class MinimumRecolorsToGetKConsecutiveBlackBlocks {
    public static void main(String[] args) {
       String blocks = "WBBWWBBWBW";
       int k = 7;
        System.out.println(minimumRecolors(blocks,k));
    }

    public static int minimumRecolors(String blocks, int k) {

        int i=0,j=0;
        int len=blocks.length();
        int count=0;
        int min=Integer.MAX_VALUE;
        while(j<len){
            char ch=blocks.charAt(j);
            if(ch=='B'){
                count++;
            }
            if(j-i+1<k){
                j++;
            }else if(j-i+1==k){

                min=Math.min(min,k-count);
                char cur=blocks.charAt(i);
                if(cur=='B')
                    count--;

                i++;
                j++;

            }

        }
        return min;
    }
}
