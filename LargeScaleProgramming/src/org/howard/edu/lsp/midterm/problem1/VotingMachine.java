package org.howard.edu.lsp.midterm.problem1;
import java.util.*;

public class VotingMachine {
	HashMap<String, Integer> voters = new HashMap<>();
	/**
	 * Adds a candidate to the list
	 * @param name The name of added candidate
	 */
	public void addCandidate(String name) {
		voters.put(name, 0);
	} 

	/**
	 * To add vote count for a candidate
	 * @param name candidate votes are to be added to
	 * @param votes number of votes for candidate
	 */
	public void castVotes(String name, int votes) {
		if(voters.containsKey(name)){
			int vote = voters.get(name);
			vote = vote + votes;
			voters.put(name, vote);
			
			
		}
	}

	/**
	 * returns number of votes for a requested candidate
	 * @param names name of candidate that you're getting votes for
	 * @return number of votes for selected candidate
	 * @throws UnknownCandidateException throws exception if candidate is not found
	 */
	public int getVotes(String names)  throws UnknownCandidateException {
		if (!(voters.containsKey(names))) {
            throw new UnknownCandidateException("Candidate is unknown");
        }
		int vote_count = 0;
		if (voters.containsKey(names)) {
			vote_count = voters.get(names);
		}
		return vote_count;
		
		
	}

	/**
	 * total number of votes for selected candidate
	 * @return total number of candidate's votes
	 */
	public int sum() {
		int total = 0;
		for(String x: voters.keySet()) {
			total = total + voters.get(x);
		}
		return total;
	}


}
