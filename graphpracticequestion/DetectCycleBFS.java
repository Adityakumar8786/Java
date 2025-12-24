import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DetectCycleBFS {

     static class Edge {

        int source ; 
        int destination; 

        public Edge(int source , int destination){
this.source = source ; 
this.destination=destination ; 
        }

}

static class Pair{

int node ; 
int parent ; 

public Pair(int node , int parent){
this.node = node ; 
this.parent = parent ; 
}
}

public static boolean detectCycle(ArrayList<Edge> [] graph){

    Queue<Pair> q = new LinkedList<>() ; 
    boolean[] visited = new boolean[graph.length] ; 

    q.add(new Pair(0,-1));

    while(!q.isEmpty()){

        Pair p = q.poll() ; 
        visited[p.node] = true ; 

        for(int i = 0 ; i < graph[p.node].size() ; i++){

                Edge e = graph[p.node].get(i) ; 

                if(!visited[e.destination]){
q.add(new Pair(e.destination,p.node)) ; 
                }

                else if(e.destination != p.parent){
return true ; 
                }
        }
    }
    return false ; 
}


@SuppressWarnings("unchecked") 
public static void main(String[] args){

        ArrayList<Edge> [] graph = new ArrayList[4]  ; 

        for (int i = 0; i < 3; i++) graph[i] = new ArrayList<>();
    
    graph[0].add(new Edge(0, 1)); graph[1].add(new Edge(1, 0));
    graph[1].add(new Edge(1, 2)); graph[2].add(new Edge(2, 1));
    graph[2].add(new Edge(2, 0)); graph[0].add(new Edge(0, 2));
    
    System.out.println(detectCycle(graph));

}
}