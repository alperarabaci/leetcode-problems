package com.leetcode.training.easy;

public class P1572_MatrixDiagonalSum {

	/**
	 * https://leetcode.com/problems/matrix-diagonal-sum/
	 *  Constraints:
		n == mat.length == mat[i].length
		1 <= n <= 100
		1 <= mat[i][j] <= 100
		so we can use short max:32767
	 * @param mat
	 * @return
	 */
    public int diagonalSum(final int[][] mat) {
    	if( mat.length ==1) {
    		return mat[0][0];
    	}
    	final short n = (short) (mat.length -1);
    	short total = 0;
    	
    	for (int y = 0; y <= n; y++) {
    		total +=  mat[y][y] + mat[n-y][y];  		
		}
    	if(n%2==0) {
    		total -= mat[n/2][n/2];
    	}
        return total;
    }
    
    /**
    public static void testShort(String[] args) {
		short total = 0;
		for (int i = 0; i < 100; i++) {
			total += 100 + 100;
		}
		System.out.println(total);
	}
	*/
}
