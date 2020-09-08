package com.leetcode.training.easy;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class P1512_NumberOfGoodPairsTest {

	P1512_NumberOfGoodPairs question;
	
	@BeforeEach
    void setUp() {
    	question = new P1512_NumberOfGoodPairs();
    }

	@ParameterizedTest
	@MethodSource("provideArray")
	void test(int[] input, int output) {
		int returnOutput = question.numIdenticalPairs(input);
		assertThat(returnOutput).isEqualTo(output);
	}
	
	private static Stream<Arguments> provideArray() {
	    return Stream.of(
	      Arguments.of(new int[] {1,2,3,1,1,3}, 4),
	      Arguments.of(new int[] {1,1,1,1}, 6),
	      Arguments.of(new int[] {1,2,3}, 0)
	    );
	}
	

}
