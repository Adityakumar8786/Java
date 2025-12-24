import java.util.ArrayList;


public class Tarjansalgo2 {

    static class Edge {

        int source ; 
        int destination; 

        public Edge(int source , int destination){
this.source = source ; 
this.destination=destination ; 
        }

}

static int V = 5 ; 
static int time = 0 ;

public static void dfs(ArrayList<Edge>[] graphs , int current , int parent , boolean[] visited , int[] discovertime , int[] lowest){

    int children = 0 ; 
    
    visited[current] = true ; 
    
    discovertime[current] = lowest[current] = ++time ;

    for(int i = 0 ; i < graphs[current].size() ; i++){

        Edge e = graphs[current].get(i) ; 

        int neighbour = e.destination ; 


        if(neighbour == parent){
continue ; 
        }

        else if(!visited[neighbour]){
dfs(graphs, neighbour, current, visited, discovertime, lowest);

lowest[current] = Math.min(lowest[neighbour], lowest[current]) ; 

if(discovertime[current] < lowest[neighbour]){

System.out.println(current) ; 

}

        }

        else{

lowest[current] = Math.min(discovertime[neighbour], lowest[current]) ; 

        }

        children ++ ; 
    }

    if(parent != -1  && children > 1 ){
    System.out.println(current) ; 
    }
}


public static void findarticulatepoint(ArrayList<Edge>[] graphs , int V){

    boolean [] visited = new boolean[V] ; 
    int[] discovertime = new int[V] ; 
    int [] lowest = new int[V] ; 

    for(int i = 0 ; i< graphs.length ; i++){

        if(!visited[i]){

            dfs(graphs , i , -1 , visited , discovertime , lowest);
        }
    }
 }


@SuppressWarnings("unchecked")
public static void main(String[] args){

    ArrayList<Edge>[] graphs = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graphs[i] = new ArrayList<>();
        }

        // Undirected graph
        graphs[0].add(new Edge(0, 1));
        graphs[1].add(new Edge(1, 0));

        graphs[1].add(new Edge(1, 2));
        graphs[0].add(new Edge(0, 2));
        graphs[2].add(new Edge(2, 0));
        graphs[2].add(new Edge(2, 1));

        graphs[0].add(new Edge(0, 3));
        graphs[3].add(new Edge(3, 0));

        graphs[3].add(new Edge(3, 4));
        graphs[4].add(new Edge(4, 3));

    findarticulatepoint(graphs, 5);

}
}