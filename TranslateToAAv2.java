package CSC301;

// Dave Patel


import algs4.*;
import java.util.*;

public class TranslateToAAv2 {



    public static void main(String[] arg){
    	
    	BinarySearchST<String, String> dnaToAA2 = new BinarySearchST<>(); // creating a symbol table 
        StdOut.println("Dave ***");
        StdIn.fromFile("data/DNAtoAA.txt");

        while(!StdIn.isEmpty()){ 
            String[] dnaValues = StdIn.readLine().split(" ");  
            dnaToAA2.put(dnaValues[0], dnaValues[1]);  // inputing values in the table
        }

        StdIn.fromFile("data/sequence2.txt");
        String dnaSequence = StdIn.readString();
       // int count = 0;
        
        /* 
         
        * Both ways work and output similar answer. 
        * Commented out method was my initial method before I was told about the substring method
          
         
        String[] dnaSplit = ThreeCharSplit(dnaSequence);
        
        for(int i = 0; i < dnaSplit.length; i++){
        	StdOut.print(dnaToAA2.get(dnaSplit[i]));
            
        }
        StdOut.print("\n\n");
        
        */
        
       for(int i = 0; i < dnaSequence.length()-4; i+=3){
        	String words = dnaSequence.substring(i,i+3);
        	StdOut.print(dnaToAA2.get(words));
            
        }
      
    }
    
    public static String[] ThreeCharSplit(String sequence) {
    	
    	List<String> sequenceBreak = new ArrayList <>();
    	
    	int length = sequence.length();
    	
    	for(int i = 0; i < length; i+= 3) {
    		sequenceBreak.add(sequence.substring(i, Math.min(length, i+3)));
    	}
    	
    	return sequenceBreak.toArray(new String[0]);
    	
    }

   
    
}
