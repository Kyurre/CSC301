package CSC301;

import algs4.BreadthFirstPaths;
import algs4.*;

public class ShortestPaths {
	
	public static void main(String[] args) {
		
		StdOut.println("Dave Patel***");
		Graph graph = new Graph(new In("data/KBgraph.txt"));
		BreadthFirstPaths paths = new BreadthFirstPaths(graph, 0);
		for(int i = 0; i < graph.V(); i++) {
			StdOut.println("Vertex Number: " + i + " Distance: "+ paths.distTo(i) + " Path: "+ paths.pathTo(i));
		}
	}
	

}
