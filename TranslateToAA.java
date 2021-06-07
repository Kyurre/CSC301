package CSC301;
// Dave Patel
import algs4.BinarySearchST;
import algs4.StdOut;
import algs4.StdIn;

public class TranslateToAA {

    public static void main(String[] args){

        BinarySearchST<String, String> dnaToAA = new BinarySearchST<>(); // creating a symbol table 
        StdOut.println("Dave ***");
        StdIn.fromFile("data/DNAtoAA.txt");

        while(!StdIn.isEmpty()){ 
            String[] dnaValues = StdIn.readLine().split(" ");  
            
            // System.out.println(dnaValues[0] + " " + dnaValues[1]);

            dnaToAA.put(dnaValues[0], dnaValues[1]);  // inputing values in the table
        }
        StdIn.fromFile("data/sequence1.txt");
        String[] dnaSequence = StdIn.readAllStrings();
       // int count = 0;
        for(int i = 0; i < dnaSequence.length; i++){  // searching the keys for a match

            StdOut.print(dnaToAA.get(dnaSequence[i]));
          //  count++;
        }

        // StdOut.println(count);
    }    
}
