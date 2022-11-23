package org.howard.edu.lsp.assignment7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.*;

import org.junit.jupiter.api.Test;




public class AverageStrategyTest {
	@Test
	public void testAverageStrategy() {
		AverageContext context = new AverageContext();
		context.setAverageStrategy(new NormalAverage());
		try {
			assertEquals(22,context.compute(Arrays.asList(10, 2, 38, 23, 38, 23, 21)));
		} 
		catch (EmptyListException empty) {
			fail();
		}
		
	}
	
	@Test
	public void testAverageStrategyException() {
		AverageContext context = new AverageContext();
		context.setAverageStrategy(new NormalAverage());
		try {
			assertEquals(665,context.compute(Arrays.asList()));
			fail();
		} catch (EmptyListException empty) {
		}
		
	}
	
	@Test
	public void testDropTwoAverage() {
		AverageContext context = new AverageContext();
		context.setAverageStrategy(new DropTwoAverage());
		try {
			assertEquals(32, context.compute(Arrays.asList(10, 2, 38, 38, 21)));
		}
		catch (EmptyListException empty) {
			fail();
		}
	}
		
	@Test
	public void testDropTwoAverageException() {
		AverageContext context = new AverageContext();
		context.setAverageStrategy(new DropTwoAverage());
		try {
			assertEquals(56, context.compute(Arrays.asList()));
			fail();
		}
		catch (EmptyListException empty) {
		}
			
	}

}
