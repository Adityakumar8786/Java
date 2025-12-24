
import java.util.Comparator;
import java.util.PriorityQueue ; 
public class ObjectPq {

    static class Student implements Comparable <Student>{

        String name ; 
        int rank ;  

        public Student(String name , int rank){
this.name = name ; 
this.rank = rank ; 
        }

@Override 
public int compareTo (Student s2){
    return this.rank - s2.rank ;
}
    }

    public static void main(String[] args){

        PriorityQueue<Student> pq = new PriorityQueue<>() ; 

        pq.add(new Student("sonu", 1)) ; 
        pq.add(new Student("sipun", 2)) ; 
        pq.add(new Student("Aditya", 3)) ; 
        pq.add(new Student("Asish", 4)) ; 


        while(!pq.isEmpty()){
            System.out.println(pq.peek().name+" "+ pq.peek().rank) ; 
            pq.remove() ; 
        }


        PriorityQueue<Student> pq2 = new PriorityQueue<>(Comparator.reverseOrder()) ; 

        pq2.add(new Student("sonu", 1)) ; 
        pq2.add(new Student("sipun", 2)) ; 
        pq2.add(new Student("Aditya", 3)) ; 
        pq2.add(new Student("Asish", 4)) ; 


        while(!pq2.isEmpty()){
            System.out.println(pq2.peek().name+" "+ pq2.peek().rank) ; 
            pq2.remove() ; 
        }
    }
}