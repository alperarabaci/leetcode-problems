package com.leetcode.training.easy;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class P561ArrayPartitionITest {

	P561ArrayPartitionI question;
	
	@BeforeEach
    void setUp() {
    	question = new P561ArrayPartitionI();
    }
	
	@ParameterizedTest
	@MethodSource("provideArray")
	public void testArrayPairSum(int[] input, int output) throws Exception {
		int returnOutput = question.arrayPairSum(input);
		assertThat(returnOutput).isEqualTo(output);
	}
	
	@ParameterizedTest
	@MethodSource("provideArray")
	private static Stream<Arguments> provideArray() {
	    return Stream.of(	      
	      Arguments.of(new int[] {1,4,3,2}, 4),
	      Arguments.of(new int[] {1,2,3,4,5,6}, 9),
	      Arguments.of(new int[] {10,1,1,6}, 7),
	      Arguments.of(new int[] {10,1,0,6, -3, 20}, 8)
	    );
	}

}
