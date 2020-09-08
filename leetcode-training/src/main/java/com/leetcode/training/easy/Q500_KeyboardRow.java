package com.leetcode.training.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/keyboard-row/
 * @author alper
 *
 */
public class Q500_KeyboardRow {

	private static final String[] KEYBOARD_ROWS = new String[] { "QWERTYUIOP", "ASDFGHJKL", "ZXCVBNM" };

	public String[] findWords(final String[] words) {
		final List<String> output = new ArrayList<>();

		outerloop: for (int i = 0; i < words.length; i++) {
			final String word = words[i].toUpperCase();
			final char firstChar = word.charAt(0);
			final int row = findRow(firstChar);

			for (int j = 1; j < word.length(); j++) {
				if (!checkRow(word.charAt(j), row)) {
					continue outerloop;
				}
			}
			output.add(words[i]);
		}
		return output.toArray(new String[output.size()]);
	}

	private int findRow(final char firstChar) {
		for (int i = 0; i < KEYBOARD_ROWS.length; i++) {
			if (checkRow(firstChar, i)) {
				return i;
			}
		}
		return 0;
	}

	private boolean checkRow(final char wordChar, final int row) {
		return KEYBOARD_ROWS[row].indexOf(wordChar) > -1;
	}
}
