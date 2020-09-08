package com.leetcode.training.easy;

import java.util.Arrays;
/**
 * https://leetcode.com/problems/array-partition-i/
 * @author alper
 *
 */
public class P0561ArrayPartitionI {

    public int arrayPairSum(int[] nums) {
    	Arrays.sort( nums);
    	int total = 0;
    	/**
    	 * Already ordered :(
    	 * No need any compare operation
    	 */
    	for (int i = 0; i < nums.length/2; i++) {
			total += nums[i*2] ;
		}
		return total;
    }
    
}
