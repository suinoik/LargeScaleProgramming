package org.howard.edu.lsp.assignment7;
import java.util.*;


public class DropTwoAverage implements AverageStrategy{
	@Override
	/**
	 * Takes a list of integers in, then calculates the average of the list minus the lowest 2 values and returns the average. If the length of the list is less than 3, it just returns the average of the list
	 * @param grades
	 * @throws EmptyListException
	 * @return sum/grades.size()
	 */

	public int compute(List<Integer> grades) throws EmptyListException {
		if (grades.isEmpty()) {
			throw new EmptyListException("The list is empty");
		}
		int sum = 0;
		int average;
		if (grades.size() < 3) {
			for (int i=0; i<grades.size(); i++) {
				sum += grades.get(i);
			}
			average = sum / grades.size();
		} else {
			Collections.sort(grades);
			for (int i=2; i<grades.size(); i++) {
				sum += grades.get(i);
			}
			average = sum / (grades.size()-2);
		}
		return average;
	}

}