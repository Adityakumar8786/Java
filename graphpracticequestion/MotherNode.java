import java.util.Stack;
import java.util.ArrayList;
public class MotherNode {

    static class Edge{

        int node  ; 
        int destination ; 

        public Edge(int node , int destination){
this.node = node ; 
this.destination = destination ; 
        }
    }

  public static int findMotherNode(ArrayList<Edge>[] graph ){

    Stack<Integer> s = new Stack<>() ;
boolean[] visited  = new boolean[graph.length] ;  

for(int i = 0 ; i < graph.length ; i++){

    if(!visited[i]){
dfs(i , visited , s , graph) ; 
    }
}

int mother = s.peek() ; 
visited  = new boolean[graph.length] ;  
int count = dfsUtil(graph , mother , visited) ;




if(count == graph.length){
return mother ;
}else {
    return -1 ; 
}

  }  


  public static void dfs(int node , boolean[]visited, Stack<Integer> s ,ArrayList<Edge>[] graph){

visited[node] = true ; 

for(int i = 0 ; i < graph[node].size() ; i++){

    int neighbour = graph[node].get(i).destination ; 

    if(!visited[neighbour]){
dfs(neighbour, visited, s, graph);
    }

}

s.push(node);
  }


public static int dfsUtil(ArrayList<Edge>[] graph , int mother ,boolean[]visited ){

visited[mother] = true ; 
int count = 1 ; 

for(int i = 0 ; i < graph[mother].size() ; i++){

    int neighbour = graph[mother].get(i).destination ; 

    if(!visited[neighbour]){
    count += dfsUtil(graph, neighbour, visited);  
    }
}

return count ; 
}

@SuppressWarnings("unchecked")

public static void main(String[] args){

    ArrayList<Edge>[]graph = new ArrayList[4] ;

    for(int i = 0 ; i < graph.length ; i++){
        graph[i] = new ArrayList<>() ; 
    }

        graph[0].add(new Edge(0, 1));
        graph[1].add(new Edge(1, 2));
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 0));

System.out.println(findMotherNode(graph)) ;
 }


}