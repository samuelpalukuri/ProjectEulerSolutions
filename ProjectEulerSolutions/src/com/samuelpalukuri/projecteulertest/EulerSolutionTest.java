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
	}

}
