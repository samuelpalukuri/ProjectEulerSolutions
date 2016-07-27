/**
 * 
 */
package com.samuelpalukuri.projecteuler;

/**
 * @author Samuel_Palukuri
 *
 */
public class P005 implements EulerSolution {

	/* (non-Javadoc)
	 * @see com.samuelpalukuri.projecteuler.EulerSolution#run()
	 */
	@Override
	public String run() {
		
		long lcm, gcd;
		
		/*
		 * We need LCM ( 1, 2, 3, ... 20)
		 * This can be written as LCM (1,2) followed by 3, 4 and so on..
		 * LCM = Product / GCD
		 * This is repeated over numbers from 2 ... 20
		 */
		
		lcm = 1;
		
		for (int i = 2; i < 20; i++) {
			
			gcd = Library.findGCD(lcm, i);
			
			//For readability
			long product = lcm * i;			
			lcm = product / gcd;
		}
		return Long.toString(lcm);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		long startTime = System.nanoTime();
		
		System.out.println(new P005().run());
		
		Library.printTimeTaken(startTime);

	}

}
