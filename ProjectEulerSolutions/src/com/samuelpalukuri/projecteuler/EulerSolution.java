/**
 * 
 */
package com.samuelpalukuri.projecteuler;

/**
 * This interface defines a standard template to solve Euler problems.
 * This makes it easy to test the solutions against common test classes.
 * 
 * @author Samuel Palukuri
 *
 */
public interface EulerSolution {
	/**
	 * This method has to be used to execute the problem and return the
	 * solution as a string
	 * 
	 * @return String This returns the solution to the problem
	 */
	public String run();
}