package com.leetcode.training.easy;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 * @author alper
 *
 */
class P1295_FindNumbersWithEvenNumberOfDigitsTest {

	P1295_FindNumbersWithEvenNumberOfDigits question;
	
	@BeforeEach
    void setUp() {
    	question = new P1295_FindNumbersWithEvenNumberOfDigits();
    }

	@ParameterizedTest
	@MethodSource("provideArray")
	void test(int[] input, int output) {
		int returnOutput = question.findNumbers(input);
		assertThat(returnOutput).isEqualTo(output);
	}
	
	private static Stream<Arguments> provideArray() {
	    return Stream.of(
	      Arguments.of(new int[] {12,345,2,6,7896}, 2),
	      Arguments.of(new int[] {555,901,482,1771}, 1),
	      Arguments.of(new int[] {1,2,3}, 0),
	      Arguments.of(new int[] {111111,20,3333}, 3)
	    );
	}
}
