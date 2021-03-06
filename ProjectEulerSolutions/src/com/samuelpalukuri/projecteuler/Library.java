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
		for (long i = 3; i*i <= input; i += 2) {
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
	 * Return Greatest Common Divisor of two numbers
	 * @param num1 Number 1
	 * @param num2 Number 2
	 * @return long GCD of number 1 and number 2
	 */
	public static long findGCD(long num1, long num2) {
		
		if (num1 <= 0 || num2 <= 0) {
			throw new IllegalArgumentException("No number being passed should be zero or less than zero!");
		}
		
		if (num1 == num2) {
			throw new IllegalArgumentException("Numbers being passed shouldn't be equal");
		}
		
		//Swap num1 and num2 if needed so that num1 is always greater than num2
		//Use temp variable as the numbers could be too big to rely on swap w/o a temp variable
		long temp;
		
		if(num1 < num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}	
		
		//Euclidean algorithm for GCD
		//Divide num1 by num 2
		//Divide num by remainder from above division
		//Repeat until remainder is zero. The last divisor is the GCD
		while (num1 % num2 != 0) {
			temp = num1;
			num1 = num2;
			num2 = temp % num2;
		}
					
		return num2;
	}
	
	/**
	 * Return sum of first N natural numbers
	 * @param input The number of numbers for which summation is required 
	 * @return long Sum of first N natural numbers
	 */
	public static long sumNNaturalNum (long input) {
		if (input <= 0) {
			throw new IllegalArgumentException("Arguments passed should not be less than or equal to zero");
		}
		return (input * (input + 1)) / 2;
	}
	
	/**
	 * Return sum of squares of first N natural numbers
	 * @param input The number of numbers for which summation of squares is required
	 * @return long Sum of squares of first N natural numbers
	 */
	public static long sumSquareNNaturalNum(long input) {
		if(input <= 0) {
			throw new IllegalArgumentException("Arguments passed should not be less than or equal to zero");
		}
		return (input * (input + 1) * ((2 * input) + 1)) / 6;
	}
	
	/**
	 * Return product of digits of input parameter
	 * @param input The number whose product of digits is required
	 * @return long product of digits;
	 */
	public static long productOfDigits(long input) {
		
		if(input < 0) {
			throw new IllegalArgumentException("Number passed should be >= 0");
		}
		
		long product = 1;
		
		do {
			product *= input % 10;
			
			if (product == 0) {
				break;
			}
			
			input = input / 10;
		} while (input != 0);
		
		return product;
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
