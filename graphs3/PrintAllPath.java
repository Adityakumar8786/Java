    import java.util.ArrayList;


public class PrintAllPath {



    static class Edge{
int source ; 
int destination ; 

public Edge(int source , int destination){
this.source = source ; 
this.destination = destination ; 
}

}


public static void printpath(ArrayList<Edge> [] graphs, int src , int dest , String ans ){

    if(src == dest){
System.out.print(ans+dest);
        return ;  
    }

    for(int i = 0 ; i < graphs[src].size() ; i++){

        Edge e = graphs[src].get(i) ; 

printpath(graphs, e.destination, dest, ans+src+" ");

    }

    System.out.println() ; 
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
    graph[0].add(new Edge(0,3)) ; 

  
printpath(graph, 5, 1, "");

}

}