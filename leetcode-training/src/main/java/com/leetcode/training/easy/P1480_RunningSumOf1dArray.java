package com.leetcode.training.easy;

/**
 * https://leetcode.com/problems/running-sum-of-1d-array/
 * @author alper
 *
 */
public class P1480_RunningSumOf1dArray {

	
	public int[] runningSum(int[] nums) {
		final int[] totals = new int[nums.length];
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j <= i; j++) {
				totals[i] += nums[j];
			}		
		}
        return totals;
    }
	
	/**
	 * https://leetcode.com/problems/running-sum-of-1d-array/discuss/688613/Java-clean-and-simple-solution
	 * what a shame :(
	 * @param nums
	 * @return
	 */
	public int[] runningSum2(int[] nums) {       
		// modify the input array, adding n[i] with n[i-1]
        for(int i = 1; i < nums.length; i++) {
            nums[i] += nums[i-1];
        }      
		
		// return the modified array
        return nums;
    }
	
}
