package com.leetcode.training.easy;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class P1572_MatrixDiagonalSumTest {
	
	P1572_MatrixDiagonalSum question;
	
	@BeforeEach
    void setUp() {
    	question = new P1572_MatrixDiagonalSum();
    }

	@ParameterizedTest
	@MethodSource("provideArray")
	public void testDiagonalSum(int[][] input, int output) throws Exception {
		int returnOutput = question.diagonalSum(input);
		assertThat(returnOutput).isEqualTo(output);
	}
	
	private static Stream<Arguments> provideArray() {
	    return Stream.of(	      
	      Arguments.of(new int[][] {{1,2,3},{4,5,6}, {7,8,9}}, 25),
	      Arguments.of(new int[][] {{1,1,1,1},{1,1,1,1}, {1,1,1,1}, {1,1,1,1}}, 8),
	      Arguments.of(new int[][] {{5}}, 5),
	      //extra:
	      Arguments.of(new int[][] {{1,2},{4,5}}, 12)
	    );
	}

}
