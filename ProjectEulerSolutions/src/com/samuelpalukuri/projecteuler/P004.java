/**
 * 
 */
package com.samuelpalukuri.projecteuler;

/**
 * @author Samuel_Palukuri
 *
 */
public class P004 implements EulerSolution {

	/* (non-Javadoc)
	 * @see com.samuelpalukuri.projecteuler.EulerSolution#run()
	 */
	@Override
	public String run() {
		
		long maxPalindrome = 0;
		long currentProduct;
		
		for (int i = 100; i < 1000; i++) {
			for (int j = 100; j < 1000; j++) {
				currentProduct = i*j;
				if (Library.isPalindrome(currentProduct)) {
					if (currentProduct > maxPalindrome) {
						maxPalindrome = currentProduct;
					}
				}
			}
		}
		
		return Long.toString(maxPalindrome);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		System.out.println(new P004().run());
		
		Library.printTimeTaken(startTime);
		

	}

}
