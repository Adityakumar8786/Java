import java.util.HashMap ;
import java.util.Scanner; 
class noOfSubArraywithSumK {

    public static int subarraySum(int[] nums, int k) {
       HashMap<Integer,Integer> hm = new HashMap<>() ; 

hm.put(0,1) ; 
int sum = 0 ; 
int ans = 0 ; 

       for(int i = 0 ; i < nums.length ; i++){

sum += nums[i] ; 

if(hm.containsKey(sum-k)){
    ans += hm.get(sum-k) ; 
}

hm.put(sum,hm.getOrDefault(sum , 0)+1) ; 
       } 

       return ans ; 
    }

    public static void main(String[] args){

        int arr[] = {10,2,-2,-20,10} ; 
Scanner sc = new Scanner(System.in) ; 

int k = sc.nextInt() ;

System.out.println(subarraySum(arr, k)) ;
sc.close() ;  

    }
}