/**
 * 
 */
package bfdf;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Pawam Kumar
 *
 */
public class GraphsOperations {

	public GraphsOperations(String s) {

	}

	public GraphsOperations() {

	}

	public void BFS(List<List<Integer>> graph) {

		Queue<Integer> queue = new LinkedList<Integer>();
		List<Integer> value = new ArrayList<Integer>();
		List<Boolean> visited = new ArrayList<Boolean>();

		for (int i = 0; i < graph.size(); i++) {
			visited.add(false);

		}
		System.out.println("graph :: " + graph);
		queue.add(0);
		System.out.println("Visited :: " + visited);

		while (!queue.isEmpty()) {
			Integer vertex = queue.poll();
			if (!visited.get(vertex))
				value.add(vertex);

			visited.set(vertex, true);
			List<Integer> connections = graph.get(vertex);
			for (int i = 0; i < connections.size(); i++) {
				Integer connection = connections.get(i);
				if (!visited.get(connection)) {
					queue.add(connection);
				}

			}
		}

		System.out.println("BFS value  :: " + value);
	}

	public int BFSSourceDestination(List<List<Integer>> graph, int source, int destination) {

		Queue<Integer> queue = new LinkedList<Integer>();
		// List<Integer> parent = new ArrayList<Integer>();
		int parent[] = new int[graph.size()];
		// List<Boolean> visited = new ArrayList<Boolean>();

		boolean visited[] = new boolean[graph.size()];

		for (int i = 0; i < graph.size(); i++) {
			visited[i] = false;

		}

		queue.add(source);
		visited[source] = true;
		parent[source] = -1;
		while (!queue.isEmpty()) {

			int currentVertex = queue.poll();
			// visited[neighbour] = true;
			if (currentVertex == destination)
				break;

			List<Integer> neighbours = graph.get(currentVertex);

			for (int i = 0; i < neighbours.size(); i++) {

				Integer neighbour = neighbours.get(i);

				if (!visited[neighbour]) {
					queue.add(neighbour);
					visited[neighbour] = true;
					parent[neighbour] = currentVertex;
				}

			}

		}
		int cur = destination;
		int distance = 0;
		Stack<Integer> stack = new Stack<Integer>();
		while (parent[cur] != -1) {
			stack.push(cur);
			cur = parent[cur];
			distance++;
		}
		stack.push(cur);
		System.out.println("Total distance from source to destination is :: " + (stack.size() - 1));
		while (!stack.isEmpty()) {
			System.out.print(stack.pop() + " --> ");
		}
		System.out.println();
		System.out.println("Total distance from source to destination is :: " + distance);

		return distance;
	}

	public void DFS(List<List<Integer>> graph, int source, boolean visited[], int value[]) {
		// boolean visited[] = new boolean[graph.size()];
		// int value[] = new int[graph.size()];
		value[source] = source;
		visited[source] = true;
		List<Integer> neighbours = graph.get(source);
		for (int i = 0; i < neighbours.size(); i++) {
			int neighbour = neighbours.get(i);
			if (!visited[neighbour]) {
				DFS(graph, neighbour, visited, value);
			}

		}

	}

	public void DFSTraversal(List<List<Integer>> graph) {

		int source;
		boolean visited[] = new boolean[graph.size()];
		int value[] = new int[graph.size()];

		for (int i = 0; i < graph.size(); i++) {
			visited[i] = false;
		}

		for (int i = 0; i < graph.size(); i++) {
			source = i;
			DFSRec(graph, source, visited, value);
		}

	}

	public void DFSRec(List<List<Integer>> graph, int source, boolean[] visited, int[] value) {

		if (!visited[source])
			System.out.print(source + " ");
		visited[source] = true;
		value[source] = source;

		List<Integer> neighbours = graph.get(source);

		for (int i = 0; i < neighbours.size(); i++) {

			int neighbour = neighbours.get(i);

			if (!visited[neighbour]) {

				DFSRec(graph, neighbour, visited, value);
			}

		}

	}

	public void findDisjointGraphNumberUsingBFS(List<List<Integer>> graph, int source, boolean[] visited, int[] value) {

	}

	public void findDisjointGraphNumberUsingDFS(List<List<Integer>> graph, int source, boolean[] visited, int[] value) {

	}

}
