package org.howard.edu.lsp.midterm.problem2;

public class Person {
	private String name; 
	private int age; 
	private String socialSecurityNumber;

		public Person(String name,  String socialSecurityNumber, int age) {
			// initialize private variables
			this.name = name;
			this.age = age;
			this.socialSecurityNumber = socialSecurityNumber;
			
				
		}
		
		public String toString() {
			Integer new_age = this.age;
			String new_string = new_age.toString();
			String string2 = this.name + " " + new_string + " " + this.socialSecurityNumber;
			return string2;
		}
			
		public boolean equals(Object other_person) {
			if (this == other_person)
				return true;
			if (other_person == null)
				return false;
			if (getClass() != other_person.getClass())
				return false;
			Person Other_person = (Person) other_person;
			if (socialSecurityNumber != Other_person.socialSecurityNumber)
				return false;
			return true;
		
			
		
			
		
			
			
			
		}


}
