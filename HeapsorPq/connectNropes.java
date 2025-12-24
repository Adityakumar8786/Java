import java.util.PriorityQueue ;
public class connectNropes {

    public static void main(String[] args){
int ropes[] = {4,3,2,6} ; 

PriorityQueue<Integer> pq = new PriorityQueue<>() ; 

for(int i = 0 ; i< ropes.length ; i++){
    pq.add(ropes[i]) ;
}

int cost = 0 ; 

while(!pq.isEmpty()){
    int first = pq.remove() ; 
    int second = pq.remove() ; 

    pq.add(first+second) ; 

    cost += first + second ;
}

System.out.println(cost) ;
    }
}