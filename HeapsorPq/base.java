import java.util.PriorityQueue ; 
import java.util.Comparator; 


public class base {
    
    public static void main(String[] args){

PriorityQueue<Integer> pq = new PriorityQueue<>() ; 

pq.add(1) ; 
pq.add(2) ; 
pq.add(3) ; 
pq.add(4) ; 
pq.add(5) ; 

while(!pq.isEmpty()){
    System.out.println(pq.peek());
    pq.remove() ; 
}


PriorityQueue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder()) ; 

pq1.add(1) ; 
pq1.add(2) ; 
pq1.add(3) ; 
pq1.add(4) ; 
pq1.add(5) ; 

while(!pq1.isEmpty()){
    System.out.println(pq1.peek());
    pq1.remove() ; 
}


    }
}
