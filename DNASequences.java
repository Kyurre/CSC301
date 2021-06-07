package CSC301;
// Dave Patel

import java.util.*;
import myalgs4.*;

public class DNASequences {
	
	private AVLTreeST<String, String> dnaSequences;
	private ArrayList<String> names = new ArrayList<String>();
	
	public DNASequences() {
		dnaSequences = new AVLTreeST<>();
	}
	
	public void addSpecies(String species, String sequence) {
		dnaSequences.put(species, sequence);
	}
	
	public void removeSpecies(String species) {
		dnaSequences.delete(species);
	}
	
	public ArrayList speciesList() {
		for(String key: dnaSequences.keys()){
			names.add(key);
		}
		Collections.sort(names);
		return names;
	}
	
	public String sequence(String species) {
		if(dnaSequences.get(species).equals(null)) return null;
		return dnaSequences.get(species);
	}
	
	public int size() {
		return dnaSequences.size();
	}

}
