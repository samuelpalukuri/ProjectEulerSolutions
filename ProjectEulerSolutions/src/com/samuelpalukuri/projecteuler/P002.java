/**
 * 
 */
package com.samuelpalukuri.projecteuler;

/**
 * @author Samuel_Palukuri
 *
 */
public class P002 implements EulerSolution {

	/* (non-Javadoc)
	 * @see com.samuelpalukuri.projecteuler.EulerSolution#run()
	 */
	@Override
	public String run() {
		
		/*
		 * Consider a and b to be two consecutive numbers in the Fibonacci
		 * series. Start with a as 1 and b as 2
		 */
		
		long a = 1, b = 2;
		long sum = 0;
		
		while ( a < 4000000) {
			if ( a % 2 == 0) {
				sum += a;
			}
			
			b = a + b;
			a = b - a;
		}		
		
		return Long.toString(sum);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		long startTime = System.nanoTime();
		
		System.out.println(new P002().run());
		
		long endTime = System.nanoTime();
		
		System.out.print("Time taken to execute program is ");
		System.out.print((endTime - startTime) + " ns or ");
		System.out.println((endTime - startTime)/1000.0 + " ms");
		
	}

}
