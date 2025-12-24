import java.util.ArrayList;
import java.util.PriorityQueue;

public class BellmenFord {
    
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


static class Pair implements Comparable <Pair>{

int node ; 
int distance ; 

 public Pair(int node , int distance){
this.node = node ; 
this.distance = distance ; 
 }

 @Override public int compareTo(Pair p2){
    return p2.distance -  this.distance ;
 }

}



public static void Bellmanford(ArrayList<Edge>[] graphs,int source){

    int distancearr[] = new int[graphs.length] ; 

    for(int i = 0 ; i < graphs.length ; i++){

if(i != source){
distancearr[i] = Integer.MAX_VALUE; 
}

    }


    boolean [] visited = new boolean[graphs.length] ; 

    PriorityQueue<Pair> pq = new PriorityQueue<>() ;
    pq.add(new Pair(0, 0)) ; 

    while(!pq.isEmpty()){

        Pair currentPair = pq.poll() ; 

        if(!visited[currentPair.node]){

visited[currentPair.node] = true ; 

for(int i = 0 ; i < graphs[currentPair.node].size() ; i++){

    Edge e = graphs[currentPair.node].get(i) ;  

    int u = e.source ; 
    int v = e.destination ; 
int weight = e.weight ; 


if(distancearr[u] + weight < distancearr[v]){

    distancearr[v] = distancearr[u]+ weight ; 


}

pq.add(new Pair (v,distancearr[v])) ;

}

        }
    }


    for(int i = 0 ; i < distancearr.length ; i++){
    System.out.println(i+" "+distancearr[i]);
}

}
@SuppressWarnings("unchecked")

public static void main(String[] args){


    ArrayList<Edge> [] graph = new ArrayList[4] ; 

    for(int i = 0 ; i < graph.length ; i++){

        graph[i] = new ArrayList<>() ; 

    }


    graph[0].add(new Edge(0,1,2)); 
    graph[0].add(new Edge(0,2,4)); 

    graph[1].add(new Edge(1,2,-4)); 
    graph[2].add(new Edge(2,3,2)); 
    graph[3].add(new Edge(3,4,4)); 
    graph[4].add(new Edge(4,1,-1)); 

    Bellmanford(graph, 0);
}
}
