package com.leetcode.training.easy;

/**
 * https://leetcode.com/problems/running-sum-of-1d-array/
 * @author alper
 *
 */
public class Q1480_RunningSumOf1dArray {

	
	public int[] runningSum(int[] nums) {
		final int[] totals = new int[nums.length];
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j <= i; j++) {
				totals[i] += nums[j];
			}		
		}
        return totals;
    }
	
}
