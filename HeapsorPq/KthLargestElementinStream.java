import java.util.PriorityQueue;

public class KthLargestElementinStream {

    public static void findlargest(int arr[] , int k ){

        PriorityQueue<Integer> pq = new PriorityQueue<>() ;

        for(int i = 0 ; i< arr.length ;i++){ // O(nlogK)


            if(pq.size() < k){
            pq.add(arr[i]) ; //O(k)
System.out.print("_"+" ") ; 
        }

else{

        if(arr[i]>pq.peek()){
            pq.remove() ;
            pq.add(arr[i]) ; //O(k)
        }
System.out.print(pq.peek()+" ") ;
        

        }


        }
                
    }

    public static void main(String[] args){

        int arr[] = {10, 20, 11, 70, 50, 40, 100, 5} ; 

        findlargest(arr, 3);
    }
}