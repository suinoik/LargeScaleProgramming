package org.howard.edu.lsp.assignment3;

import java.util.*;

public class Combinations {
	public void combinationSum(int[] candidates, int target) {
	     
        List<List<Integer>> ans = new ArrayList<>();
        helper(candidates, target, ans, new ArrayList<Integer>(),0);
        List<List<Integer>> endResult = removeDuplicates(ans);
        System.out.println("Input: " + Arrays.toString(candidates) + " Sum: " + String.valueOf(target));
        System.out.println("Combinations: ");
        if (endResult.isEmpty()) {
        	System.out.println("[]");
        	return;
        }
        for (List<Integer> combo: endResult) {
        	System.out.println(combo);
        }
    }
    
    public static void helper(int[] candidates, int target, List<List<Integer>> ans, List<Integer> result, int index){
        if(index>=candidates.length){
            if(target==0){
                ans.add(new ArrayList<>(result));
            }
            return;
        }
        
        if(candidates[index]<=target){
            result.add(index);
            helper(candidates, target-candidates[index], ans, result, index); 
            result.remove(result.size()-1);
        }
        helper(candidates, target, ans, result, index+1);     }
    
    public static List<List<Integer>> removeDuplicates(List<List<Integer>> ans) {
    	List<List<Integer>> finalList = new ArrayList<>();
    	for (List<Integer> combo : ans) {
    		Set<Integer> formedSet = new HashSet<>(combo);
    		if (formedSet.size() == combo.size()) {
    			finalList.add(combo);
    		}
    	}
    	return finalList;
    }

}
