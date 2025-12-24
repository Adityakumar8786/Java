import java.util.ArrayList;
import java.util.Stack ; 

public class TopologicalSort {

    static class Edge{
int source ; 
int destination ; 

public Edge(int source , int destination){
this.source = source ; 
this.destination = destination ; 
}

}


public static void topologicalsort(ArrayList<Edge> [] graph){

    boolean[] visited = new boolean[graph.length] ; 
    Stack<Integer> stack = new Stack<>() ; 

for(int i = 0 ; i < graph.length ; i++){

    if(!visited[i]){

        topologicalsortutil(graph,i,visited,stack);
    }
}


while (!stack.isEmpty()) {
    System.out.print(stack.pop()+" ") ; 
}

}

public static void topologicalsortutil(ArrayList<Edge> [] graph , int start , boolean[] visited , Stack<Integer> stack){

    visited[start] = true ; 

    for(int i = 0 ; i < graph[start].size() ; i++){

        Edge e = graph[start].get(i) ; 

if(!visited[e.destination]){
    topologicalsortutil(graph, e.destination, visited, stack);
}
    }

    stack.add(start);
}
    @SuppressWarnings("unchecked")


public static void main(String[] args){

    ArrayList<Edge> [] graph = new ArrayList[6] ; 

    for(int i = 0 ; i < 6 ; i ++){
        graph[i] = new ArrayList<>() ; 
    }


    graph[2].add(new Edge(2,3)) ; 
    graph[3].add(new Edge(3,1)) ; 
    graph[4].add(new Edge(4,0)) ; 
    graph[4].add(new Edge(4,1)) ; 
    graph[5].add(new Edge(5,0)) ; 
    graph[5].add(new Edge(5,2)) ; 

    topologicalsort(graph);
}
}