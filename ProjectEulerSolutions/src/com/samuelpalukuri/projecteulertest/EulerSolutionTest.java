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
	}

}
