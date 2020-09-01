package com.leetcode.training.easy;

import java.util.ArrayList;
import java.util.List;

public class Q1431_KidsWithTheGreatestNumberOfCandies {

    public List<Boolean> kidsWithCandies(final int[] candies, final int extraCandies) {
    	int i;    	
    	int max = 0;
    	for (i = 0; i < candies.length; i++) {
    		if(candies[i] > max) {
				max = candies[i];
			}
		}
    	/*
    	int max = Arrays.stream(candies)
    	        .max()
    	        .getAsInt();
    	        */
    	List<Boolean> result = new ArrayList<>();
    	for (i = 0; i < candies.length; i++) {
    		result.add(candies[i] + extraCandies >= max);
    	}
        return result;
    }
    
}
