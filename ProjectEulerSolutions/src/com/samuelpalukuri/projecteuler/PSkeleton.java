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
		
		Library.printTimeTaken(startTime);
		
	}
	
	@Override
	public String run(){
		return "Testing";
	}

}
