/**
 * 
 */
package com.samuelpalukuri.projecteulertest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.samuelpalukuri.projecteuler.Library;

/**
 * @author Samuel_Palukuri
 *
 */
public class LibraryTest {

	@Test
	public void testIsPrime() {
		assertEquals(true,Library.isPrime(3));
		assertEquals(true,Library.isPrime(17));
		assertEquals(false,Library.isPrime(18));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testIsPrimeInvalid1() {
		Library.isPrime(-1000000);
	}
	
	@Test
	public void testIsPalindrome() {
		assertEquals(true,Library.isPalindrome(101L));
		assertEquals(false,Library.isPalindrome(1010L));
		assertEquals(true,Library.isPalindrome(10101L));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testIsPalindromInvalid1() {
		Library.isPalindrome(-1L);
	}
	
	@Test
	public void testFindGCD() {
		assertEquals(6L,Library.findGCD(12L, 30L));
		assertEquals(54L,Library.findGCD(216L, 594L));
	}

	@Test(expected=IllegalArgumentException.class)
	public void testFindGCDInvalid1() {
		Library.findGCD(5, -10);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testFindGCDInvalid2() {
		Library.findGCD(0, 11);
	}
	
	@Test
	public void testSumNNaturalNum() {
		assertEquals(55, Library.sumNNaturalNum(10L));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testSumNNaturalNumInvalid1() {
		Library.sumNNaturalNum(0);
	}
	
	@Test
	public void testSumSquareNNaturalNum() {
		assertEquals(385, Library.sumSquareNNaturalNum(10L));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testSumSquareNNaturalNumInvalid1() {
		Library.sumSquareNNaturalNum(-10);
	}
}
