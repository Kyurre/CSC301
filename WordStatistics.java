package CSC301;

// Dave Patel

import algs4.StdIn;
import algs4.StdOut;
import algs4.Merge;


public class WordStatistics {
	
	public static void Name(String name){
		StdOut.println(name + "***" );
	}
	
	public static void main(String[] args) {
		Name("Dave");
		StdIn.fromFile("data/tale.txt");
		String[] taleWords = StdIn.readAllStrings();
		LongestWord(taleWords);
		AverageLength(taleWords);
		Merge.sort(taleWords); 
		StdOut.println("Alphabetical first word is: " + taleWords[0] + 
				"\nAlphabetical last word is: "+ taleWords[taleWords.length -1]);
	} 
	
	public static void LongestWord(String[] words) {
		int longestWordSize = 0; 
		String longestWord = words[0] ; 
		for (int i = 0; i < words.length; i++) {
			if (longestWordSize < words[i].length()) {
				longestWordSize = words[i].length();
				longestWord = words[i];
			}
		}
		StdOut.println("The longest word is " + longestWord + " with the length of " + longestWordSize);
	}
	
	public static void AverageLength(String[] avgWord) {
		int wordCounter = 0;
		float wordSum = 0; 
		for (int i = 0; i < avgWord.length; i++) {
			wordSum += avgWord[i].length();
			wordCounter++;
		}
		StdOut.println("Average length of the words: " + (wordSum/wordCounter));
	}
}
