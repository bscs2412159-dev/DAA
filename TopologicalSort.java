import java.util.*;

public class TopologicalSort {
    private int V;
    private ArrayList<ArrayList<Integer>> adj;

    TopologicalSort(int v) {
        V = v;
        adj = new ArrayList<>(v);
        for (int i = 0; i < v; ++i)
            adj.add(new ArrayList<>());
    }

    void addEdge(int v, int w) {
        adj.get(v).add(w);
    }

    void topologicalSortUtil(int v, boolean visited[], Stack<Integer> stack) {
        visited[v] = true;
        for (Integer neighbor : adj.get(v)) {
            if (!visited[neighbor])
                topologicalSortUtil(neighbor, visited, stack);
        }
        stack.push(v);
    }

    void topologicalSort(String[] labels) {
        Stack<Integer> stack = new Stack<>();
        boolean visited[] = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!visited[i])
                topologicalSortUtil(i, visited, stack);
        }

        System.out.print("Topological Order: ");
        while (!stack.empty()) {
            System.out.print(labels[stack.pop()] + " ");
        }
    }

    public static void main(String args[]) {
       
        String[] labels = {"m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        TopologicalSort g = new TopologicalSort(14);

       
        g.addEdge(0, 4); g.addEdge(0, 5); g.addEdge(0, 11);
        g.addEdge(1, 2); g.addEdge(1, 4); g.addEdge(1, 8); 
        g.addEdge(2, 5); g.addEdge(2, 6); g.addEdge(2, 9); 
        g.addEdge(3, 2); g.addEdge(3, 6); g.addEdge(3, 13);
        g.addEdge(4, 7);
        g.addEdge(5, 8); g.addEdge(5, 12);
        g.addEdge(6, 5);
        g.addEdge(8, 7);
        g.addEdge(9, 10); g.addEdge(9, 11);
        g.addEdge(10, 13);
        g.addEdge(12, 9);

        g.topologicalSort(labels);
    }
}