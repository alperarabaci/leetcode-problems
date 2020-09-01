package com.leetcode.training.easy;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Q1431_KidsWithTheGreatestNumberOfCandiesTest {

	Q1431_KidsWithTheGreatestNumberOfCandies question;
	
    @BeforeEach
    void setUp() {
    	question = new Q1431_KidsWithTheGreatestNumberOfCandies();
    }
	
    @ParameterizedTest
	@MethodSource("provideData")
	public void test(int[] candies, int extraCandies, Boolean[] output) throws Exception {
    	
    	List<Boolean> returnOutput = question.kidsWithCandies(candies, extraCandies);
		assertThat(returnOutput.toArray()).isEqualTo(output);
	}
    
	private static Stream<Arguments> provideData() {
	    return Stream.of(
	      Arguments.of(new int[] {2,3,5,1,3}, 3, new Boolean[] {true,true,true,false,true}),
	      Arguments.of(new int[] {4,2,1,1,2}, 1, new Boolean[] {true,false,false,false,false}),
	      Arguments.of(new int[] {12,1,12}, 10, new Boolean[] {true,false,true})
	    );
	}
}
