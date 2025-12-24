import java.util.HashMap ; 

public class largestSubArraywithSum0 {

    public static int findlargestsubarray(int arr[]){
int sum = 0 ; 
int length = 0 ; 

HashMap<Integer,Integer> hm = new HashMap<>() ;

for(int i = 0 ; i < arr.length ; i++){
    sum += arr[i] ; 

    if(hm.containsKey(sum)){
length = Math.max(length,i-hm.get(sum)) ; 
    }
else{
    hm.put(sum,i) ; 
}
}

return length ; 
    }

public static void main(String[] args){

    int arr[] = {15,-2,2,-8,1,7} ; 

    System.out.println(findlargestsubarray(arr));
}
}