import java.util.ArrayList ; 
import java.util. PriorityQueue ; 

public class PrimsAlgorithm {

    static class Edge {

        int source ; 
         int destination ; 
int weight ; 

         public Edge(int source, int destination,int weight){
this.source = source ; 
this.destination = destination ;
this.weight = weight;
         }

    }

static class Pair implements Comparable <Pair>{

  int vertex ; 
  int distance ; 

  public Pair(int vertex , int distance){
this.vertex = vertex ; 
this.distance = distance ; 


  }

@Override 
public int compareTo(Pair p2){
return this.distance -p2.distance;
}

}


    public static void PrimsAlgo(ArrayList<Edge>[] graph){

        boolean[] visited = new boolean[graph.length] ; 

        PriorityQueue<Pair> pq = new PriorityQueue<>() ; 

        pq.add(new Pair(0, 0)) ; 

        int mstcost = 0 ; 

        // ArrayList<Edge> edgeList = new ArrayList<>() ; 

        while(!pq.isEmpty()){

Pair current = pq.poll() ; 

if(!visited[current.vertex]){

    visited[current.vertex] = true ; 


    mstcost+= current.distance ; 

for(int j = 0 ; j < graph[current.vertex].size() ; j++){

Edge e = graph[current.vertex].get(j) ; 

if(!visited[e.destination]){
    
    pq.add(new Pair(e.destination,e.weight)) ; 
}

}

}
        }

        System.out.println(mstcost) ;
    }
    @SuppressWarnings("unchecked")
    public static void main(String[] args){

ArrayList<Edge> [] graphs = new ArrayList[4]   ; 


for(int i = 0 ; i < graphs.length ; i++){
graphs[i] = new ArrayList<>() ;
}


graphs[0].add(new Edge(0,3,30));
graphs[3].add(new Edge(3,0,30));

graphs[0].add(new Edge(0,2,15));
graphs[2].add(new Edge(2,0,15));

graphs[0].add(new Edge(0,1,10));
graphs[1].add(new Edge(1,0,10));

graphs[1].add(new Edge(1,3,40));
graphs[3].add(new Edge(3,1,40));

graphs[2].add(new Edge(2,3,50));
graphs[3].add(new Edge(3,2,50));


PrimsAlgo(graphs);

 }
}


    //           0

    //    1            2 


    //           3