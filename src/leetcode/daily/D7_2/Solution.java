package leetcode.daily.D7_2;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] costs=new int[]{1,3,2,4,1};
        int coins=7;
        System.out.println(maxIceCream(costs,coins));
    }
    public static int maxIceCream(int[] costs, int coins) {
        int length = costs.length;
        int flag=0;
        int count=0;

        Arrays.sort(costs);
        for (int i = 0; i < length; i++) {
            if(coins>=costs[i]){
                count++;
                coins=coins-costs[i];
            }
        }
        return count;
    }
}
