package com.leetcode.training.easy;

import java.util.Arrays;

public class Q561ArrayPartitionI {

    public int arrayPairSum(int[] nums) {
    	Arrays.sort( nums);
    	int total = 0;
    	for (int i = 0; i < nums.length/2; i++) {
			total += (nums[i*2] < nums[(i*2)+1])? nums[i*2]:nums[(i*2)+1];
		}
		return total;
    }
    
}
