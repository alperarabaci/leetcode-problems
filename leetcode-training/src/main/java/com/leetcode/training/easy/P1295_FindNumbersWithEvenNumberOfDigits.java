package com.leetcode.training.easy;

/**
 * https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 * @author alper
 *
 */
public class P1295_FindNumbersWithEvenNumberOfDigits {

    public int findNumbers(final int[] nums) {
    	int evenCount = 0;
    	
    	for (int i = 0; i < nums.length; i++) {
    		if(String.valueOf(nums[i]).length() %2 == 0) {
    			evenCount++;
    		}
		}
    	
		return evenCount;
    }
    
}
