package com.leetcode.training.easy;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Q0942_DIStringMatchTest {

	Q0942_DIStringMatch question;
	

	@ParameterizedTest
	@MethodSource("provideArray")
	public void testDiStringMatch() throws Exception {
		String S = "DDI";
		int[] elements = new Q0942_DIStringMatch().diStringMatch(S);
		assertThat(check(elements, S)).isTrue();
	}
	
	private static Stream<Arguments> provideArray() {
	    return Stream.of(
	      Arguments.of("IDID"),
	      Arguments.of("III"),
	      Arguments.of("DDI"),
	      Arguments.of("DIIIDDIDDDDDDDDIDIDI")
	    );
	}
	
	private static boolean check(int[] input, String S) {
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
