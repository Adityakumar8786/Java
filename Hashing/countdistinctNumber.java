import java.util.HashSet ; 
public class countdistinctNumber {

    public static void main(String[] args){
        int arr[] = {1,2,4,5,3,6,2,9,2,4,1} ; 
        
        HashSet<Integer> hs = new HashSet<>() ; 

        for(int i = 0 ; i < arr.length ; i++){
hs.add(arr[i]) ;
        }

        System.out.println(hs.size()) ; 
    }
}