import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Bfs {

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

    static int v = 7 ; 


    //    1---3
    //  /      | \
    //  0      |   5
    //   \     | /
    //    2---4



public static void BFS(ArrayList<Edge>[] graph){

    Queue<Integer> q = new LinkedList<>() ; 

    boolean visited[] = new boolean[graph.length] ;
    q.add(0) ; 

    while(!q.isEmpty()){

        int current = q.remove() ; 

        if(!visited[current]){

            System.out.print(current+" ") ; 
            visited[current] = true ; 

            for(int i = 0 ; i < graph[current].size() ; i++){
                Edge e = graph[current].get(i);
                q.add(e.destination) ;
            }
        }
    }

}


public static void bfss(ArrayList<Edge> []graph){

    Queue<Integer> q = new LinkedList<>() ; 
    HashSet<Integer> hs = new HashSet<>() ; 

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

        BFS(graph);
        System.out.println();
        bfss(graph);
    }
}