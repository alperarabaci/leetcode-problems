package com.leetcode.training.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/build-an-array-with-stack-operations/
 * @author alper
 *
 */
public class P1441_BuildAnArrayWithStackOperations {

	public static final String PUSH = "Push";
	public static final String POP = "Pop";
	
    public List<String> buildArray(final int[] target, final int n) {
    	final List<String> output = new ArrayList<>();
    	boolean isThereAnyGap = false;

		final boolean[] list = new boolean[target[target.length-1]];
		for (int i = 0; i < target.length; i++) {
			//array is 0 based so - 1
			list[target[i]-1] = true;
		}
		for (boolean b : list) {
			if(!b) {
				isThereAnyGap = true;
				break;
			}
		}
		
		if(!isThereAnyGap) {
			for (int i = 0; i < target[target.length-1]; i++) {
				output.add(PUSH);
			}
		}else {
			for (boolean b : list) {
				output.add(PUSH);
				if(!b) {
					output.add(POP);
				}
			}
		}

		return output;
    }
    
}
