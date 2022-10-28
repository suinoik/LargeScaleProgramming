package org.howard.edu.lsp.midterm.problem1;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.howard.edu.lsp.assignment5.IntegerSet;
import org.howard.edu.lsp.assignment5.IntegerSetException;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;


public class VotingMachineTest {
	@Test
	@DisplayName ("Test cases for get votes")
	
	
	
	public void testGetVotes() {
		VotingMachine voters = new VotingMachine();
		voters.addCandidate("sola");
		voters.addCandidate("kunle");
		voters.addCandidate("paul");
		
		try {
			assertEquals(0, voters.getVotes ("sola"));
		} catch (UnknownCandidateException x) {
			x.printStackTrace ();
		}
		
		voters.castVotes("sola", 560);
		voters.castVotes("kunle", 24);
		voters.castVotes("paul", 10);
		try {
			assertEquals(560, voters.getVotes("sola"));
			assertEquals(24, voters.getVotes("kunle"));
			assertEquals(10, voters.getVotes("paul"));
		} catch (UnknownCandidateException x) {
			x.printStackTrace();
	
			

	}
	}
	
	@Test
	@DisplayName ("Test cases for sum of votes")
	public void TestSum() {
	VotingMachine voters = new VotingMachine();
	voters.addCandidate("sola"); 
	voters.addCandidate("kunle");
	voters.castVotes("sola", 45);
	voters.castVotes("kunle", 9);
	assertEquals (54, voters.sum());
	}
	
			
	@Test
	@DisplayName("test for unknown candidate exception")
	public void testUnknownCandidateException() {
		VotingMachine voters = new VotingMachine();
		Exception exception = assertThrows(UnknownCandidateException.class, () -> {
	
	voters.getVotes("sope");
	});
	
	String expectedMessage = "Candidate is unknown";
	String actualMessage = exception.getMessage();
	assertTrue(actualMessage.contains(expectedMessage));
	}
	


	
	
}
