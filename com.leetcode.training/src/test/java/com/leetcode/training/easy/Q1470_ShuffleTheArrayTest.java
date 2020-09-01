package com.leetcode.training.easy;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Q1470_ShuffleTheArrayTest {

	Q1470_ShuffleTheArray question;
	
    @BeforeEach
    void setUp() {
    	question = new Q1470_ShuffleTheArray();
    }
	
    @ParameterizedTest
	@MethodSource("provideData")
	public void test(int[] nums, int n, int[] output) throws Exception {
		int[] returnOutput = question.shuffle(nums, n);
		assertThat(returnOutput).isEqualTo(output);
	}
    
	private static Stream<Arguments> provideData() {
	    return Stream.of(
	      Arguments.of(new int[] {2,5,1,3,4,7}, 3, new int[] {2,3,5,4,1,7}),
	      Arguments.of(new int[] {1,2,3,4,4,3,2,1}, 4, new int[] {1,4,2,3,3,2,4,1}),
	      Arguments.of(new int[] {1,1,2,2}, 2, new int[] {1,2,1,2})
	    );
	}

}
