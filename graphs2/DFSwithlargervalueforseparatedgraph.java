import java.util.ArrayList  ;
import java.util.HashSet;

public class DFSwithlargervalueforseparatedgraph {

    

static class Edge{
    int source ; 
    int destination ; 

    public Edge(int source , int destination){
        this.source = source ; 
        this.destination = destination ; 
    }
}


//          0 -----------3
//        /  |           | 
//       /   |           |
//      /    |           |
//    1      |           |
//      \    |           4
//       \   |
//        \  |
//          2


public static void dfs(ArrayList<Edge> [] graphs,int[] visited){

    HashSet<Integer> hs = new HashSet<>() ; 

    for(int i = 0 ; i < graphs.length ; i++){
      
        if(!hs.contains(i)){
            dfsutil(graphs, i, hs ,visited);
        }
    }
}

public static void dfsutil(ArrayList<Edge> [] graphs , int start , HashSet<Integer> hs, int[] visited){

if(hs.contains(visited[start])){
return ; 
}   

System.out.print(visited[start]+" ") ; 
hs.add(visited[start]) ; 

for(int i = 0 ; i < graphs[start].size() ; i++){

    Edge e = graphs[start].get(i) ; 

    if(!hs.contains(e.destination)){
        dfsutil(graphs, e.destination, hs,visited);
    }
}

}





@SuppressWarnings("unchecked")

public static void main(String[] args){

    ArrayList<Edge> [] graph = new ArrayList[5];

    for(int i = 0 ; i < 5 ; i ++){
        graph[i] = new ArrayList<>() ; 
    }

    int value[] = {0,10,20,30,40} ; 

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));


        dfs(graph, value);
}
}