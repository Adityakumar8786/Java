import java.util.Comparator;
import java.util.PriorityQueue; 

public class halveArraySum {

     
    public static double minimumoperation(double arr[]){


        double count = 0.0; 
     double sum = 0.0; 


        if (arr == null || arr.length == 0){
            return 0.0 ; 
        }


PriorityQueue<Double> pq = new PriorityQueue<>(Comparator.reverseOrder()) ; 


         for(int i = 0 ; i < arr.length ; i++){  
          sum += arr[i] ;   
        }

    double halvesum = sum/2 ; 


        for(int i = 0 ; i < arr.length ; i++){  
pq.add(arr[i]) ;
        }


double currentSum = sum ; 



       while(currentSum > halvesum){

        double largest = pq.poll() ; 
        double halflargest = largest/2 ; 
        currentSum -= (largest - halflargest) ; 

        pq.add(halflargest) ;
        count ++ ; 
       }
        
        return count ; 
    }

    public static void main(String[] args){

        double arr[] = {5, 19, 8, 1} ; 

        System.out.println(minimumoperation(arr)) ; 
    }
}