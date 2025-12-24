import java.util.PriorityQueue ;
import java.util.ArrayList; 

public class DijkstraAlgo {

static class Edge{

    int source ;
    int destination ; 
    int weight ; 

public Edge(int source , int destination , int weight){
this.source = source ; 
this.destination = destination ; 
this.weight = weight ; 
}

}
   

static class pair implements Comparable<pair> {

    int node ; 
    int distance ; 

    public pair (int node , int distance){
this.node = node ; 
this.distance = distance ;
    }

    @Override
public int compareTo(pair p2){
return this.distance - p2.distance ;
}

}


public static void Dijkstra(ArrayList<Edge>[] graph,int src){

    int [] distancearr = new int[graph.length]; 

    for(int i = 0 ; i < distancearr.length ; i++){

if(i != src){
distancearr[i] = Integer.MAX_VALUE ; 
}

    }

boolean[] visited = new boolean[graph.length] ; 

PriorityQueue<pair> pq = new PriorityQueue<>() ; 

pq.add(new pair(src, 0));

while(!pq.isEmpty()){
    pair current = pq.poll() ;

    if(!visited[current.node]){

        visited[current.node] = true ; 

        for(int i = 0 ; i < graph[current.node].size() ; i++){

Edge e = graph[current.node].get(i) ; 

int u = e.source ; 
int v = e.destination ; 
int wt = e.weight ; 


if(distancearr[u] + wt < distancearr[v]){
    distancearr[v] = distancearr[u] + wt ;

    pq.add(new pair(v, distancearr[v])) ;
}
        }
    }
}


for(int i = 0 ; i < distancearr.length ; i++){
    System.out.println(i+" "+distancearr[i]);
}
    }



    public static void addEdge(ArrayList<Edge>[] graph, int u, int v, int w) {
        graph[u].add(new Edge(u, v, w));
        graph[v].add(new Edge(v, u, w)); // undirected graph
    }


    @SuppressWarnings("unchecked")

    public static void main(String[] args) {
        int V = 5; // number of vertices
        ArrayList<Edge>[] graph = new ArrayList[V];

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // Add edges (u, v, weight)
        addEdge(graph, 0, 1, 2);
        addEdge(graph, 0, 2, 4);
        addEdge(graph, 1, 2, 1);
        addEdge(graph, 1, 3, 7);
        addEdge(graph, 2, 4, 3);
        addEdge(graph, 3, 4, 1);

        // Run Dijkstra from source node 0
        Dijkstra(graph, 0);
    }


}


