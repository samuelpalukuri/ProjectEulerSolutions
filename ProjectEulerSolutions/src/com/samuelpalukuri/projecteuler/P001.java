/**
 * 
 */
package com.samuelpalukuri.projecteuler;

/**
 * @author Samuel Palukuri
 *
 */
public class P001 implements EulerSolution {

	/* (non-Javadoc)
	 * @see com.samuelpalukuri.projecteuler.EulerSolution#run()
	 */
	@Override
	public String run() {
		
		int sum = 0;
		
		for (int i = 1; i < 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		return Integer.toString(sum);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		long startTime = System.nanoTime();
		
		System.out.println(new P001().run());
		
		Library.printTimeTaken(startTime);
		
	}

}
