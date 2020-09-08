package com.leetcode.training.easy;

/**
 * https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/
 * @author alper
 *
 */
public class P1475_FinalPricesWithASpecialDiscountinAShop {

    public int[] finalPrices(final int[] prices) {
    	short i;
    	short j;
    	for (i = 0; i < prices.length-1; i++) {
			for (j = (short) (i+1); j < prices.length; j++) {
				if(prices[j] <= prices[i]) {
					prices[i] -=  prices[j];
					break;
				}
			}
		}
    	//print(prices, "");
    	return prices;
    }
    
    void print(int[] output, String text) {
    	System.out.print(text +" ");
    	for (int i : output) {
    		System.out.print(i + ", ");
		}
    	System.out.println(text + " END");
    }
}
