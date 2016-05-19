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
	public void test() {
		assertEquals(true,Library.isPrime(3));
		assertEquals(true,Library.isPrime(17));
		assertEquals(false,Library.isPrime(18));
	}

}
