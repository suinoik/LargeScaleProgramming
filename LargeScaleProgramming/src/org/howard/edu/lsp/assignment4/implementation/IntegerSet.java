package org.howard.edu.lsp.assignment4.implementation;
import java.util.*;


public class IntegerSet {
	/**
	 * The internal representation of the set.
	 */
	private List<Integer> set = new ArrayList<Integer>();

	// Default Constructor
	/**
	 * Constructor for Integer set class
	 */
	public IntegerSet() {
		this.set = new ArrayList<Integer>();
	}

	// Clears the internal representation of the set
	/**
	 * Empties the set
	 */
	public void clear() {
		this.set.clear();
		
	}

	// Returns the length of the set
	/**
	 * Returns length of the set
	 * @return Number of elements in the set
	 */
	public int length() {
		int count = 0; // returns the length
		for (int i=0; i<this.set.size(); i++) {
			count++;
		}
		return count;
	}

	/*
	  * Returns true if the 2 sets are equal, false otherwise;
	 * Two sets are equal if they contain all of the same values in ANY order.
	*/
	/**
	 * Checks if 2 sets are equal
	 * @param b Second set to be compared
	 * @return True if sets are equal, false otherwise
	 */
	public boolean equals(IntegerSet b) {
		if(this.set.size() != b.set.size()) {
			return false;
		}
		for (Integer number: b.set) {
			if (!this.set.contains(number)) {
				return false;
			}
		}
		return true;
	}

	// Returns true if the set contains the value, otherwise false
	/**
	 * Checks if set contains a value
	 * @param value Value searched for in set
	 * @return True if value is in set, false otherwise
	 */
	public boolean contains(int value) {
		if (this.set.contains(value)) {
			return true;
		} else {
			return false;
		}
	}    

	// Returns the largest item in the set; Throws a IntegerSetException if the set is empty 
	/**
	 * Checks for largest item in set
	 * @return Largest item in set
	 * @throws IntegerSetException
	 */
	public int largest() throws IntegerSetException {
		int current_largest = Integer.MIN_VALUE;
		for (Integer number: this.set) {
			if (number>current_largest) {
				current_largest = number;
			}
		}
		return current_largest;
	}

	// Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
	/**
	 * Checks for smallest item in set
	 * @return Smallest item in set
	 * @throws IntegerSetException
	 */
	public int smallest() throws IntegerSetException {
		int current_smallest = Integer.MAX_VALUE;
		for (Integer number: this.set) {
			if (number<current_smallest) {
				current_smallest = number;
			}
		}
		return current_smallest;
	}

	// Adds an item to the set or does nothing it already there	
	/**
	 * Adds item to set
	 * @param item Item to be added to set
	 */
	public void add(int item) {
		if (!this.set.contains(item)) {
			this.set.add(item);
		}
	} // adds item to the set or does nothing if it is in set

		// Removes an item from the set or does nothing if not there
	/**
	 * Takes an item out of set
	 * @param item Item to be removed from set
	 */
	public void remove(int item) {
		if (this.set.contains(item)) {
			int number_location = this.set.indexOf(item);
			this.set.remove(number_location);
		}
	} 

	// Set union
	/**
	 * Union of two sets
	 * @param intSetb set compared with
	 */
	public void union(IntegerSet intSetb) {
		List<Integer> newList = new ArrayList<Integer>();
		for (Integer number: this.set) {
			newList.add(number);
		}
		for (Integer number: intSetb.set) {
			if (!newList.contains(number)) {
				newList.add(number);
			}
		}
		this.set = newList;
	}

	// Set intersection
	/**
	 * Intersection of two sets
	 * @param intSetb set compared with
	 */
	public void intersect(IntegerSet intSetb) {
		List<Integer> newList = new ArrayList<Integer>();
		for (Integer number: intSetb.set) {
			if (this.set.contains(number)) {
				newList.add(number);
			}
		}
		this.set = newList;
	} 

	// Set difference, i.e., s1 –s2
	/**
	 * Difference of two sets
	 * @param intSetb set compared with
	 */
	public void diff(IntegerSet intSetb) {
		List<Integer> newList = new ArrayList<Integer>();
		for (Integer number: this.set) {
			if (!intSetb.set.contains(number)) {
				newList.add(number);
			}
		}
		this.set = newList;
	} // set difference, i.e. s1 - s2

	//
	/**
	 * Returns true if the set is empty, false otherwisE
	 * @return  True if the set is empty, false otherwise
	 */
	boolean isEmpty() {
		return this.set.isEmpty();
	} 

	// Return String representation of your set
	/**
	 * Returns set in spring representation
	 */
	public String toString() {
		return this.set.toString();
	}	// return String representation of your set


}
