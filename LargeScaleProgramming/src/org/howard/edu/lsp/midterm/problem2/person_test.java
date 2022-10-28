package org.howard.edu.lsp.midterm.problem2;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class person_test {
	@Test
	@DisplayName("PersonTest.toString Test case")
	public void testToString() {
		Person person = new Person("suino", "111-11-1111", 20);
		assertEquals("suino 20 111-11-1111", person.toString());
	}
	
	@Test
	@DisplayName("PersonTest.equal Test case")
	public void testEqual() {
		Person person = new Person("suino", "111-11-1111", 20);
		Boolean value = false;
		Person other_person = new Person("simon", "111-11-1111", 56);
		assertEquals(false, person.equals(value));
		assertEquals(true, person.equals(other_person));
	}

}
