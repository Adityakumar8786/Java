import java.util.ArrayList;

public class AlienDictionary {

    
    static class Edge{

        int source ; 
        int destination ; 

        public Edge(int source , int destination){

            this.source = source ; 
            this.destination = destination ; 
        }
    }


    public static String Topologicalsort(ArrayList<Edge>[] graph){

boolean[] visited = new boolean[graph.length]; 
boolean[] recursivestack = new boolean[graph.length] ;        
ArrayList<Integer>order = new ArrayList<>() ;

for(int i = 0 ; i < graph.length ; i++){

    if(!visited[i]){
    if(dfs(graph,visited,recursivestack,i,order)){
        return "" ; 
    }
    }

}

StringBuilder result = new StringBuilder() ; 
for(int i = order.size()-1 ; i >=0 ; i--){

    result.append((char)(order.get(i) + 'a')) ; 
}

return result.toString() ;
    }

  
    public static boolean dfs(ArrayList<Edge>[] graph , boolean[] visited ,boolean[]recursivestack , int currentNode,ArrayList<Integer>order ){

        if(recursivestack[currentNode] == true){
            return true ; 
        }

        if(visited[currentNode] == true ){
            return false ; 
        }

        visited[currentNode] = true ; 
        recursivestack[currentNode] = true ; 
        for(int i = 0 ; i < graph[currentNode].size() ; i++){

            int neighbour = graph[currentNode].get(i).destination ; 

            if(!visited[neighbour]){
                if(dfs(graph, visited, recursivestack, neighbour,order)){
                    return true ; 
                }
            }
        }

        recursivestack[currentNode] = false ; 
        order.add(currentNode) ; 
        return false ; 
    }

    @SuppressWarnings("unchecked")

    public static String alienDictionary(String[] dictionary , int n , int k ){

ArrayList<Edge>[] graph  = new ArrayList[k] ; 

for(int i = 0 ; i < k ; i++){
    graph[i] = new ArrayList<>() ;
}


        for(int i = 0 ; i < n-1 ; i++){

char[] ch1 = dictionary[i].toCharArray() ; 
char[] ch2 = dictionary[i+1].toCharArray() ; 

for(int j = 0 ; j < Math.min(ch1.length , ch2.length) ;  j++){


    if(ch1[j] != ch2[j]){

        graph[ch1[j]-'a'].add(new Edge(ch1[j]-'a', ch2[j]-'a')) ; 
break ; 
    }


}
        }

        return Topologicalsort(graph);
    }

    public static void main(String[] args){

        int n = 5 ; 
        int k = 4 ; 

        String[]dict = {"baa","abcd","abca","cab","cad"} ; 

        System.out.println(alienDictionary(dict, n, k)) ;
    }
}