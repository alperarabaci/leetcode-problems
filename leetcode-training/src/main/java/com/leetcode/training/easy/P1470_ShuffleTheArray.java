package com.leetcode.training.easy;

/**
 * https://leetcode.com/problems/shuffle-the-array/
 * @author alper
 *
 */
public class P1470_ShuffleTheArray {

    public int[] shuffle(final int[] nums, final int n) {
    	//print(nums, "INPUT");
    	final int output[] = new int[nums.length];
    	int i;
    	
    	for (i = 0; i < n; i++) {
			output[i * 2] = nums[i];
		}
    	for (i=n; i < nums.length; i++) {
    		//System.out.println("INDEX:" + ((i%n * 2) +1) + " i:" + i);
    		output[i%n * 2 +1] = nums[i];
		}
    	//print(output, "OUTPUT");
    	return output;
    }
    
    void print(int[] output, String text) {
    	System.out.print(text +" ");
    	for (int i : output) {
    		System.out.print(i + ", ");
		}
    	System.out.println(text + " END");
    }
    
}
