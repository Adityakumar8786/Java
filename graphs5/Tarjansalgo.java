import java.util.ArrayList;

public class Tarjansalgo {

static class Edge {

        int source ; 
        int destination; 

        public Edge(int source , int destination){
this.source = source ; 
this.destination=destination ; 
        }

}


static int V = 6 ; 
static int time = 0 ; 

public static void dfs(ArrayList<Edge> [] graphs , int current , int parent  , boolean[] visited , int[] lowest , int[] discoverytime ){

visited[current] = true ; 
lowest[current] = discoverytime[current]  = ++ time ; 

for(int i = 0 ; i < graphs[current].size() ; i++){

 Edge e =  graphs[current].get(i) ; 
int neighbour = e.destination ;

 if(parent == neighbour){

    continue ; 

 }else if(!visited[neighbour]){

    dfs(graphs, neighbour, current, visited, lowest, discoverytime);
lowest[current] = Math.min(lowest[current], lowest[neighbour]) ; 

if(discoverytime[current] < lowest[neighbour]){

System.out.println(current+"-----"+neighbour) ; 

}

 }else{

    lowest[current] = Math.min(lowest[current] , discoverytime[neighbour]) ; 
 }


}

}

public static void findBridgeEdge(ArrayList<Edge> [] graphs){

boolean [] visited = new boolean[V] ; 
int [] lowest = new int[V] ; 
int [] discoverytime = new int[V] ; 

for(int i = 0  ; i < graphs.length ; i++){

    if(!visited[i]){
    dfs(graphs , i , -1 ,  visited , lowest , discoverytime);
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
        graphs[3].add(new Edge(3, 5));
        graphs[5].add(new Edge(5, 3));
        graphs[5].add(new Edge(5, 4));
        graphs[4].add(new Edge(4, 5));

     findBridgeEdge(graphs);
}
}