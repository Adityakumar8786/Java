import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class connectedcomponents {

    static class Edge {
        int source ; 
        int destination ; 
int weight ;
        public Edge(int source,int destination , int weight){

            this.source = source ; 
            this.destination = destination ;
            this.weight = weight ; 
        }
    }

    static int v = 6 ; 


    //    1---3
    //  /      | \
    //  0      |   5
    //   \     | /
    //    2---4



public static void bfs(ArrayList<Edge> []graph){

HashSet<Integer> hs = new HashSet<>() ;

for (int i = 0 ; i < graph.length ; i++){

    if(!hs.contains(i)){
bfsUtil(graph, hs);
    }

}

}

public static void bfsUtil(ArrayList<Edge> []graph , HashSet<Integer> hs){

    Queue<Integer> q = new LinkedList<>() ; 

q.add(graph[0].get(0).source);


while(!q.isEmpty()){
    int current = q.poll() ; 

    if(!hs.contains(current)){

        System.out.print(current+" ") ; 
        hs.add(current) ;

        for(int i = 0 ; i < graph[current].size() ; i++){
q.add(graph[current].get(i).destination) ;
        }
    }
}
}


public static void dfs(ArrayList<Edge> [] graph){

HashSet<Integer> hs = new HashSet<>() ; 

for(int i = 0 ; i < graph.length ; i++){

    if(!hs.contains(i)){
dfsutil(graph, i, hs);
    }

}
}

public static void dfsutil(ArrayList<Edge> [] graph ,int start , HashSet<Integer> hs){

if(hs.contains(start)){
    return ; 
}

System.out.print(start+" "); 
hs.add(start) ;


for(int i = 0 ; i < graph[start].size();i++){

    Edge e = graph[start].get(i) ; 
    
    if(!hs.contains(e.destination)){
dfsutil(graph, e.destination, hs);
    }
}


    }


    public static void dfss(ArrayList<Edge> [] graphs,int[] visited){

    HashSet<Integer> hs = new HashSet<>() ; 

    for(int i = 0 ; i < graphs.length ; i++){
      
        if(!hs.contains(i)){
            dfssutil(graphs, i, hs ,visited);
        }
    }
}

public static void dfssutil(ArrayList<Edge> [] graphs , int start , HashSet<Integer> hs, int[] visited){

if(hs.contains(visited[start])){
return ; 
}   

System.out.print(visited[start]+" ") ; 
hs.add(visited[start]) ; 

for(int i = 0 ; i < graphs[start].size() ; i++){

    Edge e = graphs[start].get(i) ; 

    if(!hs.contains(e.destination)){
        dfssutil(graphs, e.destination, hs,visited);
    }
}

}

@SuppressWarnings("unchecked")

    public static void main(String[] args){
        ArrayList<Edge> [] graph = new ArrayList[v];

        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
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

    int value[] = {0,10,20,30,40,50} ; 


bfs(graph);
System.out.println() ;
dfs(graph);
System.out.println() ; 
dfss(graph,value) ; 
}
}