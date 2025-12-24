import java.util.PriorityQueue;

public class ConnectCitieswithMinCost {

    static class Pair implements Comparable <Pair>{

        int city ; 
        int cost ; 

        public Pair(int city , int cost){

            this.city = city ; 
            this.cost = cost ; 
        }

        @Override 
        public int compareTo(Pair p2){
return this.cost - p2.cost ;
        }

    }


    public static int mincost(int[][] city){

int cost = 0 ; 

PriorityQueue<Pair> pq = new PriorityQueue<>() ; 

boolean[] visited = new boolean[city.length] ; 

pq.add(new Pair(0, 0)) ; 

while(!pq.isEmpty()){

    Pair currentPair = pq.poll() ; 
    
    if(!visited[currentPair.city]){

        visited[currentPair.city] = true ; 

cost += currentPair.cost ; 

for(int i = 0 ; i < city[currentPair.city].length ; i++){

    if(!visited[i] && city[currentPair.city][i] >0){
pq.add(new Pair(i, city[currentPair.city][i])) ; 

    }

}

    }

}

        return cost ;

    }
    public static void main(String[] args){


        int[][] cost = {
            {0, 2, 3, 0},
            {2, 0, 15, 2},
            {3, 15, 0, 13},
            {0, 2, 13, 0}
        };

        System.out.println("Minimum cost = " + mincost(cost)); 
    }
}