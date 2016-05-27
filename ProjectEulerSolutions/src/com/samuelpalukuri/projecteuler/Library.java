/**
 * 
 */
package com.samuelpalukuri.projecteuler;

/**
 * This file is used to hold common functions that can be reused across
 * various problems
 * @author Samuel Palukuri
 *
 */
public class Library {
	
	/**
	 * Validate if number is prime or not
	 * @param input Number to be tested for primality
	 * @return boolean True if prime
	 */
	public static boolean isPrime(long input) {
		
		if (input <= 1) {
			throw new IllegalArgumentException("Primality can be tested only for numbers >= 2");
		}
		
		//Spl condition to handle 2 and 3 as these are corner cases
		if ( input == 2 || input == 3 ) {
			return true;
		}
		
		if (input % 2 == 0) {
			return false;
		}
		
		/*
		 * Check divisibility by every odd number starting from 3
		 * till square root of input number.
		 */
		for (long i = 3; i*i < input; i += 2) {
			if ( input % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	/**
	 * Validate if number received as input is a palindrome or not
	 * Palindrome is a number which reads same both ways. For example, 10101
	 * @param input Number to be tested
	 * @return boolean True, if input is a palindrome
	 */
	public static boolean isPalindrome( long input) {
		
		if (input < 0) {
			throw new IllegalArgumentException("Palindrome test needs number >= 0");
		}
		
		long reversedInput = 0L;
		long safeInput = input;
		
		do {
			reversedInput = reversedInput*10 + input%10;
			input = input/10;
		} while (input != 0);
		
		return (reversedInput == safeInput ? true : false);
	}
	
	/**
	 * Print time taken to execute the program. Capture the start time before
	 * execution of main program and pass this value at end of program
	 * @param startTime
	 */
	public static void printTimeTaken (long startTime) {
		
		long endTime = System.nanoTime();
		
		System.out.println("Time taken to execute program is ");
		System.out.print((endTime - startTime)/1000000000.0 	+ " s // ");
		System.out.print((endTime - startTime)/1000000.0 		+ " ms");
		//System.out.print((endTime - startTime) 					+ " ns");
	}
	
}
