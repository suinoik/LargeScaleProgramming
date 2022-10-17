package org.howard.edu.lsp.assignment5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
public class IntegerSetTest {
	
	
	@Test
	@DisplayName("IntegerSet.add Test case")
	public void testAdd() {
	IntegerSet set1 = new IntegerSet();
	set1.add(20);
	set1.add(50);
	
	System.out.println(set1.toString());
	assertEquals("[20, 50]", set1.toString());
	assertNotEquals("[50, 20]", set1.toString());
	assertNotEquals("[50]", set1.toString());
	
	}
	
	@Test
	@DisplayName("IntegerSet.clear Test case" )
	public void testClear() {
	IntegerSet set1 = new IntegerSet();
	set1.add(452);
	set1.clear();
	assertTrue(set1.isEmpty());
	
	set1.add(42);
	assertFalse(set1.isEmpty());
	}
	
	
	@Test
	@DisplayName("IntegerSet.isEmpty Test Case")
	public void testIsEmpty() {
	IntegerSet set1 = new IntegerSet();
	assertTrue(set1.isEmpty());
	
	set1.add(1);
	assertFalse(set1.isEmpty());
	
	}
	
	
	@Test
	@DisplayName("IntegerSet.contains Test case")
	public void testContains() {
	IntegerSet set1 = new IntegerSet();
	set1.add(20);
	set1.add(50);
	set1.add(74);
	set1.add(39);
	
	assertTrue(set1.contains(74));
	assertFalse(set1.contains(344));
	
	}
	
	
	@Test
	@DisplayName("IntegerSet.equals Test case")
	public void testEquals() {
	IntegerSet set1 = new IntegerSet();
	set1.add(2);
	set1.add(5);
	
	
	IntegerSet set2 = new IntegerSet();
	set2.add(2);
	set2.add(5);
	
	assertTrue(set1.equals(set2));
	
	set2.add(8);
	assertFalse(set2.equals(set1));
	
	
	}
	
	
	@Test
	@DisplayName("IntegerSet.length Test case")
	public void testLength() {
	IntegerSet set1 = new IntegerSet();
	set1.add(21);
	set1.add(550);
	set1.add(57);
	set1.add(62);
	
	assertEquals(4, set1.length());
	assertNotEquals(9, set1.length());
	}

	
	@Test
	@DisplayName("IntegerSet.diff Test case")
	public void testdiff() {
	IntegerSet set1 = new IntegerSet();
	set1.add(2);
	set1.add(3);
	
	IntegerSet set2 = new IntegerSet();
	set2.add(3);
	
	
	set1.diff(set2);
		
	System.out.println(set1.toString());
	assertEquals("[2]", set1.toString());
	assertNotEquals("[2,3]", set1.toString());
	
	
	}	
	
	@Test
	@DisplayName("IntegerSet.intersect Test case")
	public void testIntersect() {
	IntegerSet set1 = new IntegerSet();
	set1.add(29);
	set1.add(37);
	set1.add(5);
	
	IntegerSet set2 = new IntegerSet();
	set2.add(29);
	set2.add(59);
	set2.add(37);
	set2.add(8);
	
	set1.intersect(set2);
	
	System.out.println(set1.toString());
	assertEquals("[29, 37]", set1.toString());
	assertNotEquals("[2, 72]", set1.toString());
	
	}
	
	
	@Test
	@DisplayName("IntegerSet.union Test case")
	public void testUnion() {
	IntegerSet set1 = new IntegerSet();
	set1.add(6);
	set1.add(3);
	
	IntegerSet set2 = new IntegerSet();
	set2.add(7);
	
	set1.union(set2);
	
	System.out.println(set1.toString());
	assertEquals("[6, 3, 7]", set1.toString());
	assertNotEquals("[7, 42, 9]", set1.toString());
	}
	

	

	@Test
	@DisplayName("IntegerSet.remove Test case")
	public void testRemove() {
	IntegerSet set1 = new IntegerSet();
	set1.add(14);
	set1.add(23);
	set1.remove(23);
	
	assertEquals("[14]", set1.toString());
	assertNotEquals("[12, 23]", set1.toString());
	
	set1.remove(14);
	assertEquals("[]", set1.toString());
	assertNotEquals("[14]", set1.toString());
	
	}
	
	
	
	
	@Test
	@DisplayName("IntegerSet.smallest Test case")
	public void testSmallest() throws IntegerSetException 
	{
	IntegerSet set1 = new IntegerSet();
	IntegerSet set2 = new IntegerSet();

	set1.add(23);
	set1.add(71);
	set1.add(14);
	set1.add(520);
	
	set2.add(355);
	set2.add(12);
	set2.add(-77);

	
	assertEquals(14, set1.smallest());
	assertNotEquals(5, set1.smallest());
	
	assertEquals(-77 , set2.smallest());
	assertNotEquals(2, set2.smallest());
	

	
	
	}
	

	@Test
	@DisplayName("IntegerSet.smallest Throws Exception Test case")
	public void testSmallest_THROWS_EXCEPTION() {
	IntegerSet set1 = new IntegerSet();
	
	Exception exception = assertThrows(IntegerSetException.class, () -> {
	
	set1.smallest();
	});
	
	String expectedMessage = "This is an empty set";
	String actualMessage = exception.getMessage();
	assertTrue(actualMessage.contains(expectedMessage));
	}
	
	@Test
	@DisplayName("IntegerSet.toString Test Case")
	public void testToString() {
	IntegerSet set1 = new IntegerSet();
	set1.add(6);
	set1.add(8);
	set1.add(7);
	assertEquals("[6, 8, 7]", set1.toString());
	}
	
	@Test
	@DisplayName("IntegerSet.largest Test case")
	public void testLargest() throws IntegerSetException 
	{
	IntegerSet set1 = new IntegerSet();
	IntegerSet set2 = new IntegerSet();
	
	set1.add(23);
	set1.add(77);
	set1.add(99);
	set1.add(530);
	
	set2.add(135);
	set2.add(22);
	set2.add(525);
	set2.add(-6);
	
	
	
	assertEquals(530 , set1.largest());
	assertNotEquals(77, set1.largest());
	
	assertEquals(525 , set2.largest());
	assertNotEquals(22, set2.largest());
		
	
	}
	
	
	@Test
	@DisplayName("IntegerSet.largest Throws Exception Test case")
	public void testLargest_THROWS_EXCEPTION() {
	IntegerSet set1 = new IntegerSet();
	
	Exception exception = assertThrows(IntegerSetException.class, () -> {
	
	set1.largest();
	});
	
	String expectedMessage = "This is an empty set";
	String actualMessage = exception.getMessage();
	assertTrue(actualMessage.contains(expectedMessage));
	}}
