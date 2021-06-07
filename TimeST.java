package CSC301;

import algs4.*;
import myalgs4.BSTEssential;
import myalgs4.AVLTreeST;
import java.util.Arrays;

// Dave Patel


public class TimeST {

	public static void main(String[] args) {
		BSTEssential<String, Integer> binaryTree = new BSTEssential<>();
		AVLTreeST<String, Integer> avlTree = new AVLTreeST<>();
		SeparateChainingHashST<String, Integer> hashST = new SeparateChainingHashST<>();
		Stopwatch timer;
		
		StdIn.fromFile("data/tale.txt");
		String[] taleWords = StdIn.readAllStrings();
		StdOut.println("Dave Patel***");
		StdOut.println("=== Times with original ordering ===");
				
		// BST 
		timer = new Stopwatch();
		for(String word: taleWords) { 
			Integer count = binaryTree.get(word);
			if(count == null) count = 0;
			binaryTree.put(word, count+1);
		}
		StdOut.println("BST Time: " + timer.elapsedTime());
		
		// AVL tree
		timer = new Stopwatch();
		for(String word: taleWords) {
			Integer count = avlTree.get(word);
			if(count == null) count = 0;
			avlTree.put(word, count+1); 
		}
		StdOut.println("AVL Time: " + timer.elapsedTime());
	
		//HashST
		timer = new Stopwatch();
		for(String word: taleWords) {
			Integer count = hashST.get(word);
			if (count == null) count = 0;
			hashST.put(word, count+1);
		}
		StdOut.println("SCHT Time: " + timer.elapsedTime());
		
		Arrays.sort(taleWords);
		StdOut.println("=== Times with sorted ordering ===");
		
		// Re-Initializing the tables
		binaryTree = new BSTEssential<>();
		avlTree = new AVLTreeST<>();
		hashST = new SeparateChainingHashST<>();
		
		// new BST 
		timer = new Stopwatch();
		for(String word: taleWords) { 
			Integer count = binaryTree.get(word);
			if(count == null) count = 0;
			binaryTree.put(word, count+1);
		}
		StdOut.println("BST Time: " + timer.elapsedTime());
		
		// new AVL tree
		timer = new Stopwatch();
		for(String word: taleWords) {
			Integer count = avlTree.get(word);
			if(count == null) count = 0;
			avlTree.put(word, count+1); 
		}
		StdOut.println("AVL Time: " + timer.elapsedTime());
	
		// new HashST
		timer = new Stopwatch();
		for(String word: taleWords) {
			Integer count = hashST.get(word);
			if (count == null) count = 0;
			hashST.put(word, count+1);
		}
		StdOut.println("SCHT Time: " + timer.elapsedTime());
	}
	
}


