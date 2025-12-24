
import java.util.ArrayList;
import java.util.Collections; 
public class kruskalAlgorithm {

    static class Edge implements Comparable<Edge>{
        int source ; 
        int destination; 
        int weight ; 

        public Edge(int source , int destination, int weight ){
this.source = source ; 
this.destination=destination ; 
this.weight = weight ; 
        }

        @Override 
        public int compareTo(Edge E2){
            return this.weight - E2.weight ;
        }
    }


static int v = 4 ; 
static int n = 4 ; //no of vertices 

static int []parent = new int[n]; 
static int []rank = new int[n]; 


public static void intializtion(){

    for(int i = 0 ; i< n ; i++){
parent[i] = i ;
rank[i] = 0 ; 
    }

}


public static int find(int x){

    if(x == parent[x]){
        return x; 
    }

    return parent[x] = find(parent[x]) ; 
}


public static void union(int a , int b ){

    int parA = find(a) ; 
    int parB = find(b) ; 

    if(rank[parA] == rank[parB]){

parent[parA] = parB ; 
rank[parB]++ ; 

    }else if(rank[parA] > rank[parB]){
parent[parB] = parA ; 

    }else{
parent[parA] = parB ; 

    }

}


    public static void kruskal(ArrayList<Edge> edges, int v){

        intializtion();
        Collections.sort(edges) ; 
int cost = 0 ; 
int count = 0 ; 

for(int i = 0 ; count < v-1 ; i++){

    Edge e = edges.get(i) ; 

    int parA = find(e.source) ; 
    int parB = find(e.destination) ; 

    if(parA != parB){

        union(parA,parB);
        cost += e.weight ;
        count ++ ; 
    }

    
}

System.out.println(cost);
    }


    public static void main(String[] args){
        
        ArrayList<Edge> edges = new ArrayList<>() ; 

        edges.add(new Edge(0,1,10));
        edges.add(new Edge(0,2,15));
        edges.add(new Edge(0,3,30));
        edges.add(new Edge(1,3,40));
        edges.add(new Edge(2,3,50));

        kruskal(edges, v);
    }

}