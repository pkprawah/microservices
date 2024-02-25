/**
 * 
 */
package bfdf;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Pawam Kumar
 *
 */
public class Graph {

	// 0-1 0-4
	// 1-0 1-2 1-4 1-3
	// 2-1 2-3
	// 3-2 3-4 3-1
	// 4-0 4-1 4-3
	private final static Integer vertex = 9;
	private Integer verte;

	GraphsOperations graphsOperations = new GraphsOperations("Pawan");

	LinkedList<Integer> adjacent[];

	public Graph(Integer vertex) {
		adjacent = new LinkedList[vertex];
		for (int i = 0; i < vertex; i++) {
			adjacent[i] = new LinkedList<Integer>();
		}

		System.out.println("adjacent[] :: " + adjacent.toString());
	}

	public static void main(String[] args) {
		Graph g = new Graph(7);
		g.verte = 7;

		int V = 5;
		List<List<Integer>> graphs = new ArrayList<List<Integer>>(V);

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < V; i++) {
			graphs.add(new ArrayList<Integer>());

		}

		System.out.println(g.verte);

		addEdge(graphs, 0, 1);
		addEdge(graphs, 0, 4);

		addEdge(graphs, 1, 2);
		addEdge(graphs, 1, 3);
		addEdge(graphs, 1, 4);

		addEdge(graphs, 2, 3);
		addEdge(graphs, 3, 4);

		// for (int i = 0; i < 100000; i++) {
		// addEdge(graphs, i + 1, i + 2); // 1,2, 1,3
		// }

		printGraph(graphs);

		GraphsOperations graphsOperations = new GraphsOperations();

		graphsOperations.BFS(graphs);

		// graphsOperations.BFSSourceDestination(graphs, 0, 4);

		/*
		 * Graph graphss = new Graph(5);
		 * 
		 * System.out.println("Enter the No. of vertex and Edges");
		 * 
		 * int v = sc.nextInt(); int e = sc.nextInt();
		 * 
		 * System.out.println("Entered vertex is :: " + v +
		 * " Entered edge is :: " + e);
		 * 
		 * for (int i = 0; i < e; i++) {
		 * 
		 * int source = sc.nextInt(); int destination = sc.nextInt();
		 * 
		 * graphss.addEdges(source, destination);
		 * 
		 * }
		 * 
		 * graphss.printGraphAdj();
		 * 
		 * 
		 * 
		 */
		boolean visited[] = new boolean[graphs.size()];

		int value[] = new int[graphs.size()];

		for (int i = 0; i < graphs.size(); i++) {
			visited[i] = false;

		}
		// graphsOperations.DFS(graphs, 0, visited, value);

		// graphsOperations.DFSTraversal(graphs);
		System.out.println();
		System.out.print("DFS Traversal:: " + " [");
		for (int j = 0; j < value.length; j++) {
			System.out.print(value[j] + " ");
		}
		System.out.print("]");
	}

	public void printGraphAdj() {
		GraphsOperations graphsOperations = new GraphsOperations();
		for (int i = 0; i < adjacent.length; i++) {
			System.out.println("Adjacent value is  :: " + i);
			System.out.println(adjacent[i]);

		}
		// graphsOperations.DFSTraversal(null);

	}

	public static void printGraph(List<List<Integer>> graph) {

		for (int i = 0; i < graph.size(); i++) {
			System.out.println("Adjacency list of vertex " + i);
			for (int j = 0; j < graph.get(i).size(); j++) {
				System.out.println(i + " --- " + graph.get(i).get(j));
			}
			System.out.println();
		}

	}

	private void addEdges(int source, int destination) {

		System.out.println(vertex);
		adjacent[source].add(destination);
		adjacent[destination].add(source);

	}

	public static void addEdge(List<List<Integer>> graphs, int u, int v) {

		graphs.get(u).add(v);
		graphs.get(v).add(u);

	}

	public void BfSTestPostive(List<List<Integer>> graph) {
		GraphsOperations graphsOperations = new GraphsOperations();
		graphsOperations.BFS(graph);

	}

	public void BfSTestNegaruive(List<List<Integer>> graph) {
		GraphsOperations graphsOperations = new GraphsOperations();
		graphsOperations.BFS(graph);

	}

	public void BfSTestNull(List<List<Integer>> graph) {
		GraphsOperations graphsOperations = new GraphsOperations();
		graphsOperations.BFS(graph);

	}

	public void BfSTestEmpty(List<List<Integer>> graph) {
		GraphsOperations graphsOperations = new GraphsOperations();
		graphsOperations.BFS(graph);

	}

}
