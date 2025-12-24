import java.util.ArrayList ;
public class CreateGraph{

    static class Edge {
        int source ; 
        int destination ; 
        int weight  ; 

        public Edge(int source , int destination , int weight){
this.source = source ; 
this.destination = destination ; 
this.weight = weight ;
        }
    }

static int v = 5 ; 

@SuppressWarnings("unchecked")
    public static void main(String [] args){

        ArrayList<Edge> [] graphs = new ArrayList[v] ; 

       for(int i = 0 ; i < v ; i++){
        graphs[i] = new ArrayList<>() ;
       }

       graphs[0].add(new Edge(0,1,5)) ;

       graphs[1].add(new Edge(1,0,5)) ;
       graphs[1].add(new Edge(1,2,1)) ;
       graphs[1].add(new Edge(1,3,1)) ;

       graphs[2].add(new Edge(2,1,1)) ;
       graphs[2].add(new Edge(2,3,1)) ;
       graphs[2].add(new Edge(2,4,4)) ;

       graphs[3].add(new Edge(3,1,3)) ;
       graphs[3].add(new Edge(3,2,1)) ;

       graphs[4].add(new Edge(4,2,2)) ;

       
       //2's neighbour 

       for(int i = 0 ; i < graphs[2].size() ; i++){
        Edge e = graphs[2].get(i) ;
        System.out.println(e.destination) ;
       }
    }
}