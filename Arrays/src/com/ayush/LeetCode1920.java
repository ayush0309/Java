package com.ayush;

import java.util.Scanner;

public class LeetCode1920 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        int[] ans = new int[n];

        for (int i=0;i<n;i++)
            nums[i] = in.nextInt();

        for (int i=0;i<n;i++) {
            ans[i] = nums[nums[i]];
            System.out.print(ans[i] + " ");
        }
     }
}
