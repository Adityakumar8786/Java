import java.util.ArrayList;
public class createGraphFrom2DArray {

    
    static class Edge {
    
        int source ; 
        int destination ; 
public Edge(int source , int destination){
this.source = source ; 
this.destination = destination ; 
}
    }

@SuppressWarnings("unchecked")


    public static ArrayList<Edge>[] creategraph(int n , int[][] edges){

ArrayList<Edge>[] graphs = new ArrayList[n] ; 

for(int i = 0 ; i < n; i++){
graphs[i] = new ArrayList<>() ; 
}


for(int i = 0 ; i < edges.length ; i++){

int u = edges[i][0] ; 
int v = edges[i][1] ;

graphs[u].add(new Edge(u, v)) ; 
graphs[v].add(new Edge(v,u))  ;

}

return graphs ; 
    }

    public static void main(String[] args){
        int n = 6 ; 
        int[][]edges = {{0,1},{0,2},{3,5},{5,4},{4,3}}; 
        ArrayList<Edge>[] graphs = creategraph(n, edges) ; 

        for(int i = 0 ; i < graphs[5].size() ; i++){
        Edge e = graphs[5].get(i) ;
        System.out.println(e.destination) ;
       }


    }
}