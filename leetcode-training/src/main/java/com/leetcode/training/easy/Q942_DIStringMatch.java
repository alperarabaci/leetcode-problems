package com.leetcode.training.easy;

/**
 * https://leetcode.com/problems/di-string-match/
 * Time Limit Exceeded :(
 * @author alper
 *
 */
public class Q942_DIStringMatch {

	public int[] diStringMatch(String S) {
		int[] elements = new int[S.length()+1];
		for (int i = 0; i < elements.length; i++) {
			elements[i] = i;
		}
		return iteratePermutation(elements.length, elements, S);
	}

	/**
	 * Permutation algorithm was copied
	 * https://www.baeldung.com/java-array-permutations
	 */
	public int[] iteratePermutation(int n, int[] elements, String S) {
		int[] indexes = new int[n];
		for (int i = 0; i < n; i++) {
		    indexes[i] = 0;
		}
		 
		boolean result = checkElements(elements, S);
		if(result) {
			return elements;
		}
		 
		int i = 0;
		while (i < n) {
		    if (indexes[i] < i) {
		        swap(elements, i % 2 == 0 ?  0: indexes[i], i);
		        result = checkElements(elements, S);
		        if(result) {
					return elements;
				}
		        indexes[i]++;
		        i = 0;
		    }
		    else {
		        indexes[i] = 0;
		        i++;
		    }
		}
		
		return null;
	}

	private static void swap(int[] input, int a, int b) {
		int tmp = input[a];
		input[a] = input[b];
		input[b] = tmp;
	}

	private static boolean checkElements(int[] input, String S) {
		for (int i = 0; i < input.length-1; i++) {
			if(('I' ==S.charAt(i) && input[i] <input[i+1]) || ('D' ==S.charAt(i) && input[i] >input[i+1])) {
				continue;
			}else {
				return false;
			}
		}
		return true;
	}
	
}
