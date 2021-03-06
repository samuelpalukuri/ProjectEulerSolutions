/**
 * 
 */
package com.samuelpalukuri.projecteulertest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.samuelpalukuri.projecteuler.*;

/**
 * @author Samuel_Palukuri
 *
 */
public class EulerSolutionTest {

	@Test
	public void test() {
		assertEquals("Testing",new PSkeleton().run());
		assertEquals("233168",new P001().run());
		assertEquals("4613732",new P002().run());
		assertEquals("6857",new P003().run());
		assertEquals("906609", new P004().run());
		assertEquals("232792560", new P005().run());
		assertEquals("25164150", new P006().run());
		assertEquals("104743", new P007().run());
		assertEquals("23514624000", new P008().run());
	}

}
