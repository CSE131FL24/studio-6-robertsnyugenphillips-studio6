package studio6;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {
		if(n == 0) {
			return 0;
		} else {
			return (1 / Math.pow(2, n)) + geometricSum(n-1);
		}
	}
	
	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius,
			double radiusMinimumDrawingThreshold) {
		
		// FIXME
	}

	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	public static int[] toReversed(int[] array) {
		int index = 0;
		int[] reverse = new int[array.length];
			// FIXME create a helper method that can recursively reverse the given array
		if (array.length > 0) {
			return toReversedHelper(array, index, reverse);
		} else {
			return reverse;
		}
	}

	public static int[] toReversedHelper(int[] array, int index, int[] reverse) {
		int lastIndex = array.length - 1;
		if (index > array.length / 2) { 
			return reverse;
		} else {
			int mirrorIndex = lastIndex - index;
			reverse[index] = array[mirrorIndex];
			reverse[mirrorIndex] = array[index];
			return toReversedHelper(array, (index + 1), reverse);
		}
	}
	
	/*
	 * [1, 2, 3, 4]
	 * reverse = [*, *, *, *]
	 * 
	 * lastIndex = 4 - 1 = 3
	 * index = 4
	 * 
	 * array.length = 4
	 * array.length / 2 = 2
	 * 4 > 2
	 * return array[4 - 1]
	 * 
	 */
	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {
		
			// FIXME compute the gcd of p and q using recursion
			return 0;
		
	}

}
