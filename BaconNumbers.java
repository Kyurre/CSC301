package CSC301;
// Dave Patel
import algs4.*;
import myalgs4.AVLTreeST;
import myalgs4.*;

public class BaconNumbers {
	
	public static void main(String[] args) {
		StdOut.println("Dave Patel***");
		Graph graph = new Graph(new In("data/KBgraph.txt"));
		
		AVLTreeST<Integer, String> set1 = new AVLTreeST<>();
		AVLTreeST<String, Integer> set2 = new AVLTreeST<>();
		
		StdIn.fromFile("data/KBgraphActors.txt");
		int count = 0; 
		
		while(!StdIn.isEmpty()) {
			String s = StdIn.readLine();
			
			set1.put(count, s);
			set2.put(s,count);
			count++;
			
		}
		BreadthFirstPaths path = new BreadthFirstPaths(graph, 0);
		
		StdOut.println("Actor\t\t    Bacon #  Bacon Path");
		for (int i =0; i < 39; i++) {StdOut.print("-");}
		StdOut.println("");
		
		for (String key: set2.keys()) {
			StdOut.printf("%-22s",key);
			StdOut.printf("%-6d ", path.distTo(set2.get(key)));
			for (int x: path.pathTo(set2.get(key))) {
				StdOut.print(set1.get(x) + " -> ");
			}
			StdOut.print("\n");
		}
	}
}
