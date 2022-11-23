package org.howard.edu.lsp.assignment7;

import java.util.*;

public class NormalAverage implements AverageStrategy{
	@Override
	/**
	 * Takes a list of integers in, then calculates and returns the average
	 * @param grades
	 * @throws EmptyListException
	 * @return sum/grades.size()
	 */
	public int compute(List<Integer> grades) throws EmptyListException  
	{  
		if(grades.isEmpty()) {  
			throw new EmptyListException("The list is empty");
		}
	int sum = 0;   
	for (int i : grades) {  
		sum+=i;  
	}  
	return sum/grades.size();   
	}  

}
