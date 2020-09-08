package com.leetcode.training.easy;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Q500_KeyboardRowTest {

	private Q500_KeyboardRow question;
	
	@BeforeEach
    void setUp() {
    	question = new Q500_KeyboardRow();
    }
	
	@ParameterizedTest
	@MethodSource("provideArray")
	public void testFindWords(String[] input, String[] output) throws Exception {
		String[] returnOutput = question.findWords(input);
		assertThat(returnOutput).isEqualTo(output);
	}
	
	@ParameterizedTest
	@MethodSource("provideArray")
	private static Stream<Arguments> provideArray() {
	    return Stream.of(	      
	      Arguments.of(new String[] {"Hello", "Alaska", "Dad", "Peace"}, new String[] {"Alaska", "Dad"}),
	      Arguments.of(new String[] {"You", "Sad", "Lock", "Java"}, new String[] {"You", "Sad"})
	      
	    );
	}

}
