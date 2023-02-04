package Algorithms;
//https://leetcode.com/problems/richest-customer-wealth/
public class MaxWealth {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3},
                {2,1,4},
                {1,2,1}
        };

        System.out.println(maximumWealth(arr));

    }
    static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
                sum += i;
            }
            if (sum > ans) {
                ans = sum;
            }
        }

        return ans;
    }
}
