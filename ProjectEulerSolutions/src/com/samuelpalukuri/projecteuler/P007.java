/**
 * 
 */
package com.samuelpalukuri.projecteuler;

/**
 * @author Samuel_Palukuri
 *
 */
public class P007 implements EulerSolution {

	/* (non-Javadoc)
	 * @see com.samuelpalukuri.projecteuler.EulerSolution#run()
	 */
	@Override
	public String run() {
		//We know that 2 is the first prime, so let's start from 3
		//Set count = 1 instead of zero as we already have the first prime number
		int count = 1;
		
		//Start searching from 3
		for (int i = 3; ; i += 2) {
			if (Library.isPrime(i)) {
				++count;
				if (count == 10001) {
					return Long.toString(i);
				}
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		System.out.println(new P007().run());
		
		Library.printTimeTaken(startTime);
	}

}
