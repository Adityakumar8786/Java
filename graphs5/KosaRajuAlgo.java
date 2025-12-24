import java.util.ArrayList ; 
import java.util.Stack ; 

public class KosaRajuAlgo {

    static class Edge {
        int source ; 
        int destination; 

        public Edge(int source , int destination){
this.source = source ; 
this.destination=destination ; 
        }

       
    }


public static void creategraph(ArrayList<Edge>[]graph){


for(int i = 0 ; i < graph.length ; i++){
graph[i] = new ArrayList<>() ; 
}

graph[0].add(new Edge(0,2)) ; 
graph[0].add(new Edge(0,3)) ; 
graph[1].add(new Edge(1,0)) ; 
graph[2].add(new Edge(2,1)) ; 
graph[3].add(new Edge(3,4)) ; 


}

public static void Topologicalsort(ArrayList<Edge>[] graph , int current ,boolean[] visited ,Stack <Integer> Stack){

    visited[current] = true ; 

    for(int i = 0 ; i< graph[current].size() ; i++){

        Edge e = graph[current].get(i) ; 

       if(!visited[e.destination]){
Topologicalsort(graph,e.destination,visited,Stack);
       }

    }
    Stack.add(current) ; 
}


public static void dfs(ArrayList<Edge>[] graph , int current ,boolean[] visited){

visited[current] = true ; 

for(int i = 0 ; i < graph[current].size() ; i++){

Edge e = graph[current].get(i) ; 
System.out.print(current + " ");

if(!visited[e.destination]){


dfs(graph, e.destination, visited);
}
}

}

    public static void StrongCyclegraph(ArrayList<Edge>[]graph , int V){

        Stack<Integer> s = new Stack<>() ;
        boolean[] visited = new boolean[graph.length] ;

        creategraph(graph); 


        for(int i = 0 ; i<V ; i++){

            if(!visited[i]){
        Topologicalsort(graph,i,visited,s) ; 
            }

        }

@SuppressWarnings("unchecked")

        ArrayList<Edge> [] transposegraph = new ArrayList[graph.length];


for(int i = 0 ; i < transposegraph.length ; i++){

    transposegraph[i] = new ArrayList<>() ; 
}


        for(int i = 0 ; i < V ; i ++){

            for(int j = 0 ; j < graph[i].size() ; j++){

Edge e = graph[i].get(j) ; 

transposegraph[e.destination].add(new Edge(e.destination, e.source));

            }

        }


 visited= new boolean[V] ;  

        while(!s.isEmpty()){

            int current = s.pop() ; 

            if(!visited[current]){
dfs(transposegraph , current , visited) ; 
System.out.println();

            }

        }
    }


@SuppressWarnings("unchecked")

    public static void main(String[] args){

        ArrayList<Edge> [] graphs = new ArrayList[5] ; 

        StrongCyclegraph(graphs, 5);
    }
}