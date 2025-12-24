import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue ;
public class cheapestflightwithKstops {



static class Edge{

    int source ;
    int destination ; 
    int cost ; 

public Edge(int source , int destination , int cost){
this.source = source ; 
this.destination = destination ; 
this.cost = cost ; 
}

}
   

static class pair  {

    int node ; 
    int cost ; 
    int stops ; 

    public pair (int node , int cost , int stops){
this.node = node ; 
this.cost = cost ; 
this.stops = stops ;
}

    
}


public static void creategraph(int arr[][] , ArrayList<Edge> [] graphs){

    for(int i = 0 ; i < graphs.length ; i++){

        graphs[i] = new ArrayList<>() ; 

    }

    for(int i = 0 ; i < arr.length ; i++){

        int src = arr[i][0] ; 
        int destination = arr[i][1] ; 
        int cost = arr[i][2] ; 
        
        graphs[src].add(new Edge(src, destination, cost)) ; 
    }
}


@SuppressWarnings("unchecked") 

public static int cheapestflight(int n , int[][] arr , int source , int destination , int k ){

    ArrayList<Edge> [] graphs = new ArrayList[n] ; 
creategraph(arr, graphs);


int costarr[] = new int[graphs.length] ; 


for(int i = 0 ; i < costarr.length ; i++){

    if( i !=source ){
costarr[i] = Integer.MAX_VALUE ; 
    }
}
Queue<pair> q = new LinkedList<>() ; 
q.add(new pair(source,0,0)) ; 


while(!q.isEmpty()){

    pair current = q.poll() ; 


if(current.stops > k){
    continue ; 
}

        for(int i = 0 ; i< graphs[current.node].size() ; i++){

            Edge e = graphs[current.node].get(i) ; 

int u = e.source ; 
int v = e.destination ; 
int cost = e.cost ;

if(costarr[u] != Integer.MAX_VALUE && current.cost +cost < costarr[v] && current.stops <= k ){

    costarr[v] = costarr[u]+cost ; 

    q.add(new pair(e.destination, costarr[v], current.stops+1)) ; 
}

        }


        
}

if(costarr[destination] == Integer.MAX_VALUE){
            return -1 ; 
        }else{
            return costarr[destination] ; 
        }


}

    



    public static void main(String[] args) {
        


        int n = 4 ; 
        int flights[][] = {{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}} ;
        int src = 0 , destination = 3 , k =1 ; 

        System.out.println(cheapestflight(n, flights, src, destination, k)) ; 
    }


}



