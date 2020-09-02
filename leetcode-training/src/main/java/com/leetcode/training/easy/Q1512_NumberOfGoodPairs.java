package com.leetcode.training.easy;

/**
 * https://leetcode.com/problems/number-of-good-pairs/
 * @author alper
 *
 */
public class Q1512_NumberOfGoodPairs {

    public int numIdenticalPairs(final int[] nums) {
    	int goodPairs = 0;
    	for (int i = 0; i < nums.length; i++) {
    		for (int j = 0; j < nums.length; j++) {
    			if (nums[i] == nums[j] && i < j) {
    				goodPairs++;
    			}
    		}
    	}
    	return goodPairs;
    }
    
    /**
     * https://leetcode.com/problems/number-of-good-pairs/discuss/731624/C%2B%2BJava-O(n)
     * @param nums
     * @return
     */
    public int numIdenticalPairs2(final int[] nums) {
        int cnt[] = new int[101], res = 0;
        for (int n: nums)
            res += cnt[n]++;
        return res;
    }
}
