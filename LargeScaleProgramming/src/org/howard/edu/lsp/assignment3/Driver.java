package org.howard.edu.lsp.assignment3;


public class Driver {

	public static void main(String[] args) {
		Combinations comb = new Combinations();
		comb.combinationSum(new int[] {1,2,3,4,5,6}, 6);
		comb.combinationSum(new int[] {5,5,15,10}, 15);
		comb.combinationSum(new int[] {}, 15);
		comb.combinationSum(new int[] {1,2,3,4,5}, 16);
		comb.combinationSum(new int[] {1,2,3,4,5,6,7,8}, 8);
		comb.combinationSum(new int[] {9,9,9,9,9,9,9}, 9);
		comb.combinationSum(new int[] {1,6,7,3,9,8,10}, 17);
		
	}

}
