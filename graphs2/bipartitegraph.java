import java.util.LinkedList;
import java.util.Queue; 
import java.util.ArrayList;

public class bipartitegraph {

    static class Edge {
        int source; 
        int destination; 

        public Edge(int source, int destination) {
            this.source = source; 
            this.destination = destination; 
        }
    }


    public static boolean graphcolor(ArrayList<Edge> []graphs){

        int color[] = new int[graphs.length] ; 

        for(int i = 0 ; i < graphs.length ; i++){
            color[i] = -1 ; 
        }

Queue<Integer> q = new LinkedList<>() ; 

        for(int i = 0 ; i < graphs.length ; i++){
            
            if(color[i] == -1 ){

                q.add(i) ; 
                color[i] = 0 ; 
                

                while(!q.isEmpty()){

                    int current = q.poll() ; 
                    
                   for(int j = 0 ; j < graphs[current].size() ; j++){

                    Edge e = graphs[current].get(j) ; 

                    if(color[e.destination]==-1){
                        int nextcolor = color[current] == 0 ? 1 : 0 ;
                        color[e.destination] = nextcolor ; 
                        q.add(e.destination) ;
                    }


                    else if(color[current] == color[e.destination]){
return false ; 
                    }

                   }

                }

            }

        }
        return true ; 
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList<Edge>[] graphs = new ArrayList[5]; 

        for (int i = 0; i < 5; i++) {
            graphs[i] = new ArrayList<>(); 
        }

        // undirected edges → add both ways
        graphs[0].add(new Edge(0, 1));
        graphs[1].add(new Edge(1, 0));

        graphs[0].add(new Edge(0, 2));
        graphs[2].add(new Edge(2, 0));

        graphs[1].add(new Edge(1, 3));
        graphs[3].add(new Edge(3, 1));

        graphs[2].add(new Edge(2, 4));
        graphs[4].add(new Edge(4, 2));

        graphs[3].add(new Edge(3, 4));
        graphs[4].add(new Edge(4, 3));

System.out.println(graphcolor(graphs));
    }
}