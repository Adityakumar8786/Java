import java.util.*;

public class DetectCycleinDirectedgraph {

    static class Edge{
int source ; 
int destination ; 

public Edge(int source , int destination){
this.source = source ; 
this.destination = destination ; 
}

}

public static boolean isCycle(ArrayList<Edge>[] graph){
boolean[] visited = new boolean[graph.length]  ;
boolean[]stack = new boolean[graph.length];
    

for(int i = 0 ; i< graph.length ; i++){

    if(!visited[i]){
        if(isCycleutil(graph,i,visited,stack)){
            return true ;
        }
    }
}

return false ; 
}



public static boolean isCycleutil(ArrayList<Edge>[] graph,int start , boolean [] visited , boolean[] stack){

stack[start] = true;
visited[start] = true ; 


for(int i = 0 ; i< graph[start].size() ; i++){

    Edge e = graph[start].get(i) ; 

    if(stack[e.destination]){
        return true ; 
    }


    else if( !visited[e.destination] && isCycleutil(graph,e.destination,visited,stack)){
return true ;
    }
}

stack[start] = false ; 
    return false ;
}


    @SuppressWarnings("unchecked")

public static void main(String[] args){

    ArrayList<Edge> [] graphs = new ArrayList[4] ; 

    for(int i = 0 ; i < 4 ; i ++){
        graphs[i] = new ArrayList<>() ; 
    }



    graphs[0].add(new Edge(0, 2));
    graphs[1].add(new Edge(1, 0));
    graphs[2].add(new Edge(2, 3));
    graphs[3].add(new Edge(3, 0));

System.out.print(isCycle(graphs));

}
}