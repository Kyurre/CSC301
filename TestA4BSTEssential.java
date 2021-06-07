package CSC301;
// Dave Patel

import algs4.StdOut;
import algs4.StdIn;

public class TestA4BSTEssential {
	
	public static void main(String[] args) {

		A4BSTEssential<String, Integer> tree = new A4BSTEssential<>();

		StdOut.println("Dave Patel***");
		StdIn.fromFile("data/tinyTale.txt");
		String[] taleWords = StdIn.readAllStrings();
		
		
		// inputting in the tree
		for (String word: taleWords){
			Integer count = tree.get(word);
			if(count == null) count = 0;
			tree.put(word, count+1);

		}
		
		// printing the number of unique words
        int uniqueWords = tree.countValue(1);
        StdOut.print(uniqueWords);

	}

}
