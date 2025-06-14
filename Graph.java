package dsap1;

import java.util.*;
import java.util.Queue;
public class Classrooom {
    static class Edge {
        int src;
        int dest;
        
        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        
        graph[0].add(new Edge(0, 2));
        
        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));
        
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));
        
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));
    }

    public static void bfs(ArrayList<Edge> graph[], int V) {
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[V];
        q.add(0);
        
        System.out.println("BFS Traversal:");
        while (!q.isEmpty()) {
            int curr = q.remove();
            if (vis[curr] == false) {
                System.out.print(curr + " ");
                vis[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
        System.out.println();
    }

    public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]) {
        System.out.print(curr + " ");
        vis[curr] = true;
        
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                dfs(graph, e.dest, vis);
            }
        }
    }

    public static void printGraph(ArrayList<Edge> graph[]) {
        System.out.println("\nGraph Adjacency List:");
        for (int i = 0; i < graph.length; i++) {
            System.out.print("Vertex " + i + ": ");
            for (Edge e : graph[i]) {
                System.out.print("-> " + e.dest);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        
        // Print neighbors of vertex 2
        System.out.println("Neighbors of vertex 2:");
        for (int i = 0; i < graph[2].size(); i++) {
            Edge e = graph[2].get(i);
            System.out.println(e.dest );
        }
        
        // Print the entire graph
        printGraph(graph);
        
        // BFS Traversal
        bfs(graph, V);
        
        // DFS Traversal (need to reset visited array)
        boolean vis[] = new boolean[V];
        System.out.println("\nDFS Traversal:");
        dfs(graph, 0, vis);
    }
}
