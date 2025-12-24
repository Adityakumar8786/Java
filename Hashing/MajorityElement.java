import java.util.HashMap;
import java.util.Set;

class MajorityElement {

    public static int majorityElement(int[] nums) {

        if(nums.length == 0){
            return -1 ; 
        }


        HashMap<Integer,Integer> hm = new HashMap<>() ;

        for(int i = 0 ; i < nums.length ; i++){

            if(hm.containsKey(nums[i])){

hm.put(nums[i] , hm.get(nums[i])+1) ; 

            }
            
            else{

hm.put(nums[i],1) ; 

            }

        } 

        Set<Integer> k = hm.keySet() ; 

        for(Integer key : k){

            if(hm.get(key) > nums.length/2) {
                return key ; 
            }

        }

        return -1 ; 
    }

    public static void main(String[] args){
;
int nums[]={1,1,2,3,3,3,3,5,3,1,3,3} ; 
System.out.println(majorityElement(nums) ); 
    }
}