package CSC301;

import algs4.BreadthFirstPaths;
import algs4.Graph;
import algs4.In;
import algs4.StdIn;
import algs4.StdOut;
import myalgs4.AVLTreeST;

public class bacon2 {
	public static void main(String[] args) {
		StdOut.println("Cavin Test");
		Graph g = new Graph(new In("data/KBgraph.txt"));
		AVLTreeST<Integer, String> graphTable = new AVLTreeST<>();
        AVLTreeST<String, Integer> secondTable = new AVLTreeST<>();

        StdIn.fromFile("data/KBgraphActors.txt");
        while (!StdIn.isEmpty()) {
            for (int v = 0; v < g.V(); v++) {
                graphTable.put(v, StdIn.readLine());
            }
        }
        StdIn.fromFile("data/KBgraphActors.txt");
        while (!StdIn.isEmpty()) {
            for (int v = 0; v < g.V(); v++) {
                secondTable.put(StdIn.readLine(), v);
            }
        }
		
		
		BreadthFirstPaths path = new BreadthFirstPaths(g, 0);
		
		StdOut.println("Actor\t\t    Bacon #  Bacon Path");
		for (int i =0; i < 39; i++) {StdOut.print("-");}
		StdOut.println("");
		
		for (String key: secondTable.keys()) {
			StdOut.printf("%-22s",key);
			StdOut.printf("%-6d ", path.distTo(secondTable.get(key)));
			for (int x: path.pathTo(secondTable.get(key))) {
				StdOut.print(graphTable.get(x) + " -> ");
			}
			StdOut.print("\n");
		}
	}
}
