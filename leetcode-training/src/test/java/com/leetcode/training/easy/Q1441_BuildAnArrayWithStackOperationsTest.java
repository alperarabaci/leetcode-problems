package com.leetcode.training.easy;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Q1441_BuildAnArrayWithStackOperationsTest {

	Q1441_BuildAnArrayWithStackOperations question;
	
	@BeforeEach
    void setUp() {
    	question = new Q1441_BuildAnArrayWithStackOperations();
    }
	
	@ParameterizedTest
	@MethodSource("provideArray")
	public void testBuildArray(int[] target, int n, String[] output) throws Exception {
		List<String> returnOutput = question.buildArray(target, n);
		assertThat(returnOutput.toArray()).isEqualTo(output);
	}
	
	@ParameterizedTest
	@MethodSource("provideArray")
	private static Stream<Arguments> provideArray() {
	    return Stream.of(	      
	      Arguments.of(new int[] {1,3}, 3, new String[]{"Push","Push","Pop","Push"}),
	      Arguments.of(new int[] {1,2,3}, 3, new String[]{"Push","Push","Push"}),
	      Arguments.of(new int[] {1,2}, 4, new String[]{"Push","Push"}),
	      Arguments.of(new int[] {2,3,4}, 4, new String[]{"Push","Pop","Push","Push","Push"})
	    );
	}

}
