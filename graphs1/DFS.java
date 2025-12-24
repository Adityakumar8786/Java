import java.util.ArrayList ;
import java.util.HashSet; 

public class DFS {

    static int v = 7 ; 

    static class Edge{

        int source ; 
        int destination ; 
        int weight ; 

        public Edge(int source , int destination , int weight) {
        
            this.source = source ; 
            this.destination = destination ; 
            this.weight = weight ; 

        }
    }

    public static void dfs(ArrayList<Edge> [] graph ,int start , HashSet<Integer> hs){

if(hs.contains(start)){
    return ; 
}

System.out.print(start+" "); 
hs.add(start) ;


for(int i = 0 ; i < graph[start].size();i++){

    Edge e = graph[start].get(i) ; 
    
    if(!hs.contains(e.destination)){
dfs(graph, e.destination, hs);
    }
}


    }

@SuppressWarnings("unchecked")

    public static void main(String[] args){

        ArrayList<Edge> [] graph = new ArrayList[v];


        for(int i = 0 ; i < v ; i ++){
graph[i] = new ArrayList<>() ;
        }



         // Add edges (undirected) with weight 1
        // 0-1
        graph[0].add(new Edge(0, 1, 1));
        graph[1].add(new Edge(1, 0, 1));
        
        // 0-2
        graph[0].add(new Edge(0, 2, 1));
        graph[2].add(new Edge(2, 0, 1));
        
        // 1-3
        graph[1].add(new Edge(1, 3, 1));
        graph[3].add(new Edge(3, 1, 1));
        
        // 2-4
        graph[2].add(new Edge(2, 4, 1));
        graph[4].add(new Edge(4, 2, 1));
        
        // 3-4
        graph[3].add(new Edge(3, 4, 1));
        graph[4].add(new Edge(4, 3, 1));
        
        // 3-5
        graph[3].add(new Edge(3, 5, 1));
        graph[5].add(new Edge(5, 3, 1));
        
        // 4-5
        graph[4].add(new Edge(4, 5, 1));
        graph[5].add(new Edge(5, 4, 1));

HashSet<Integer> hs = new HashSet<>() ; 

        dfs(graph, graph[0].get(0).source, hs);
    }

}