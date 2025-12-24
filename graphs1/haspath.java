import java.util.*;
class haspath {
    static class Edge {
        int source;
        int destination;
        public Edge(int source, int destination) {
            this.source = source;
            this.destination = destination;
        }
    }

@SuppressWarnings("unchecked")


    public static ArrayList<Edge>[] creategraph(int n, int[][] edges) {
        ArrayList<Edge>[] graphs = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graphs[i] = new ArrayList<>();
        }
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            graphs[u].add(new Edge(u, v));
            graphs[v].add(new Edge(v, u));
        }
        return graphs;
    }

    public static boolean dfs(ArrayList<Edge>[] graph, int current, int destination, boolean[] visited) {
        visited[current] = true;

        if (current == destination) {
            return true;
        }

        // Use foreach to iterate over the ArrayList
        for (Edge e : graph[current]) {
            int neighbour = e.destination;
            if (!visited[neighbour]) {
                if (dfs(graph, neighbour, destination, visited)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean validPath(int n, int[][] edges, int source, int destination) {
        if (source == destination) {
            return true;
        }

        ArrayList<Edge>[] graphs = creategraph(n, edges);
        boolean[] visited = new boolean[n];

        return dfs(graphs, source, destination, visited);
    }

    public static void main(String[] args){

        int[][] edges = {{0,1},{1,2},{2,0}} ; 
        int n = 3 ; 

        System.out.println(validPath(n, edges,0,2));
    }
}