package CSC301;
// Dave Patel


import algs4.BinarySearchST;
import algs4.StdIn;
import algs4.StdOut;

public class CountAA {

	public static void main(String[] args) {
		BinarySearchST<String, String> dnaToAA = new BinarySearchST<>(); 
		BinarySearchST<Character, Integer> countAA = new BinarySearchST<>();
		
		StdOut.println("Dave Patel***");
		StdIn.fromFile("data/DNAtoAA.txt");
		
		// creating DNA to AA table
		while(!StdIn.isEmpty()){ 
			String[] dnaValues = StdIn.readLine().split(" ");  
			dnaToAA.put(dnaValues[0], dnaValues[1]);  
		}
		
		// reading file 
		StdIn.fromFile("data/sequence2.txt");
		String dnaSequence = StdIn.readString();
		
		//converting to AA and inputting data into second table
		for(int i = 0; i < dnaSequence.length()-1; i+=3){
			String words = dnaSequence.substring(i,i+3);
			Integer count = countAA.get(dnaToAA.get(words).charAt(0)); 
			if(count == null) count = 0;
			countAA.put(dnaToAA.get(words).charAt(0), count+1); 
			
		// 	StdOut.print(dnaToAA.get(words).charAt(0) +""+ countAA.get(dnaToAA.get(words).charAt(0)) +" ");
	
		}
		
		// iterating through the table 
		for (Character key: countAA.keys()) {
			StdOut.println(key + " " + countAA.get(key));
		}
		
			
	}	
	
}



