import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue ; 

public class TopologicasortBfs {

    static class Edge{
int source ; 
int destination ; 

public Edge(int source , int destination){
this.source = source ; 
this.destination = destination ; 
}

}




public static void calculateindegree(ArrayList<Edge>[] graphs,int[] indegree){

    for(int i = 0 ; i< graphs.length ; i++){
        for(int j = 0 ; j < graphs[i].size() ; j++){

            Edge e = graphs[i].get(j) ; 

            indegree[e.destination]++ ; 
        }
    }
}



public static void topologicalsort(ArrayList<Edge>[] graphs){

    int[] indegree = new int[graphs.length] ; 

    calculateindegree(graphs, indegree);
    Queue<Integer> q = new LinkedList<>(); 

    for(int i = 0 ; i<graphs.length ; i++ ){

        if(indegree[i] == 0 ){
q.add(i) ; 
        }

    }


    while(!q.isEmpty()){

        int current = q.poll(); 

        System.out.print(current+" ") ; 


            for(int i = 0 ; i < graphs[current].size() ; i++){

                Edge e = graphs[current].get(i); 

                indegree[e.destination] -- ; 


                if(indegree[e.destination] == 0){
q.add(e.destination);
                }

            }
        }
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