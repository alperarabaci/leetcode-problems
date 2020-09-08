package com.leetcode.training.easy;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class P1475_FinalPricesWithASpecialDiscountinAShopTest {

	P1475_FinalPricesWithASpecialDiscountinAShop question;
	
	@BeforeEach
    void setUp() {
    	question = new P1475_FinalPricesWithASpecialDiscountinAShop();
    }
	
	@ParameterizedTest
	@MethodSource("provideArray")
	public void testFinalPrices(int[] input, int[] output) throws Exception {
		int[] returnOutput = question.finalPrices(input);
		assertThat(returnOutput).isEqualTo(output);
	}
	
	private static Stream<Arguments> provideArray() {
	    return Stream.of(	      
	      Arguments.of(new int[] {8,4,6,2,3}, new int[] {4,2,4,2,3}),
	      Arguments.of(new int[] {1,2,3,4,5}, new int[] {1,2,3,4,5}),
	      Arguments.of(new int[] {10,1,1,6}, new int[] {9,0,1,6})
	    );
	}
}
