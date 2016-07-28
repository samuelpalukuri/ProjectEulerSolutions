/**
 * 
 */
package com.samuelpalukuri.projecteuler;

/**
 * @author Samuel_Palukuri
 *
 */
public class P006 implements EulerSolution {

	/* (non-Javadoc)
	 * @see com.samuelpalukuri.projecteuler.EulerSolution#run()
	 */
	@Override
	public String run() {
		
		long input = 100L;
		long retVal;
		
		long sumNaturalNum = Library.sumNNaturalNum(input);
		long sumSquareNaturalNum = Library.sumSquareNNaturalNum(input);
		
		long squared = (long)Math.pow(sumNaturalNum, 2);
		
		retVal = squared > sumSquareNaturalNum ? squared - sumSquareNaturalNum : sumSquareNaturalNum - squared;
		
		return Long.toString(retVal);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.nanoTime();
		
		System.out.println(new P006().run());
		
		Library.printTimeTaken(startTime);

	}

}
