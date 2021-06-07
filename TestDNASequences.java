package CSC301;
// Dave Patel
import algs4.*;
import java.util.*;

public class TestDNASequences {
	
	public static void main(String[] args) {
		DNASequences species = new DNASequences();
		
		
		StdOut.println("Dave Patel***");
		StdIn.fromFile("data/mammals.txt");
		
		while(!StdIn.isEmpty()) {
			String[] speciesMakeUp = StdIn.readLine().split("\t");
			species.addSpecies(speciesMakeUp[0], speciesMakeUp[1]);
		}
		
		StdOut.println("Amount of Species: "+species.size());
		
		/* Printing and removing species */
		ArrayList<String> names = species.speciesList();
		for(String k: names) {
			StdOut.println(k + " " + species.sequence(k).substring(0, 20));
			species.removeSpecies(k);
		}
		
		/*Final Species Size */
		StdOut.println("Amount of Species: "+species.size());
		
		
	}
}
