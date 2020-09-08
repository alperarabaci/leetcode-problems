package com.leetcode.training.easy;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * https://leetcode.com/problems/running-sum-of-1d-array/
 * @author alper
 */
class P1480_RunningSumOf1dArrayTest {

	P1480_RunningSumOf1dArray question;
		
    @BeforeEach
    void setUp() {
    	question = new P1480_RunningSumOf1dArray();
    }

	@ParameterizedTest
	@MethodSource("provideArray")
	void test(int[] input, int[] output) {
		int[] returnOutput = question.runningSum(input);
		assertThat(returnOutput).isEqualTo(output);
	}
	
	private static Stream<Arguments> provideArray() {
	    return Stream.of(
	      Arguments.of(new int[] {1,2,3,4}, new int[] {1,3,6,10}),
	      Arguments.of(new int[] {1,1,1,1,1}, new int[] {1,2,3,4,5}),
	      Arguments.of(new int[] {3,1,2,10,1}, new int[] {3,4,6,16,17})
	    );
	}
}
