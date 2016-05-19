/**
 * 
 */
package com.samuelpalukuri.projecteuler;

/**
 * @author Samuel_Palukuri
 *
 */
public class P003 implements EulerSolution {

	/* (non-Javadoc)
	 * @see com.samuelpalukuri.projecteuler.EulerSolution#run()
	 */
	@Override
	public String run() {
		
		long input = 600851475143l;
		long maxPrimeFactor = 3;
		
		if(input % 2 == 0) {
			maxPrimeFactor = 2;
			return Long.toString(maxPrimeFactor);
		}
				
		for (long i = 3; i*i <= input; i += 2) {
			if (Library.isPrime(i)) {
				if (600851475143l % i == 0) {
					maxPrimeFactor = i;
				}
			}
		}
		return Long.toString(maxPrimeFactor);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		System.out.println(new P003().run());
		
		Library.printTimeTaken(startTime);
		

	}

}
