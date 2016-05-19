/**
 * 
 */
package com.samuelpalukuri.projecteuler;

/**
 * This class is a test implementation of the interface EulerSolution.
 * This will allow to have a sample implementation for time taken to 
 * refer in other problems.
 * 
 * @author Samuel_Palukuri
 *
 */
public class PSkeleton implements EulerSolution {

	/**
	 * 
	 */
	public static void main(String[] args) {
		
		long startTime = System.nanoTime();
		
		System.out.println(new PSkeleton().run());
		
		long endTime = System.nanoTime();
		
		System.out.print("Time taken to execute program is ");
		System.out.print((endTime - startTime) + " ns or ");
		System.out.println((endTime - startTime)/1000.0 + " ms");
		
	}
	
	@Override
	public String run(){
		return "Testing";
	}

}
