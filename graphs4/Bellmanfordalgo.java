import java.util.ArrayList;

public class Bellmanfordalgo {
    
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






public static void Bellmanford(ArrayList<Edge>[] graphs,int source){

    int distancearr[] = new int[graphs.length] ; 

    for(int i = 0 ; i < graphs.length ; i++){

if(i != source){
distancearr[i] = Integer.MAX_VALUE; 
}

    }


     

    

for(int i = 0 ; i < graphs.length-1 ; i++){

    for(int j = 0 ; j < graphs.length ; j++){

for(int k = 0 ; k < graphs[j].size() ; k++){

    Edge e = graphs[j].get(k) ;  

    int u = e.source ; 
    int v = e.destination ; 
int weight = e.weight ; 


if(distancearr[u] != Integer.MAX_VALUE && distancearr[u] + weight < distancearr[v]){

    distancearr[v] = distancearr[u]+ weight ; 


}


}
}
}

      


    for(int i = 0 ; i < distancearr.length ; i++){
    System.out.println(i+" "+distancearr[i]);
}

}
@SuppressWarnings("unchecked")

public static void main(String[] args){


    ArrayList<Edge> [] graph = new ArrayList[5] ; 

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
