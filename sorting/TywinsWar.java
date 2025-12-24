import java.util.*;
class TywinsWar {
    public static int minSoldiers(int[] arr, int k) {
        int needed = (arr.length+1)/2 ; 
        int luckeytroop = 0 ; 
        int [] requiredsoldier = new int[arr.length] ; 
        int count = 0 ; 
        
        
        for(int i = 0 ; i< arr.length ; i++){
            if(arr[i] % k == 0){
                luckeytroop ++ ; 
            }else{
                requiredsoldier[count] = k - (arr[i]%k) ;
                count ++ ; 
            }
            
        }
        
        Arrays.sort(requiredsoldier,0,count) ; 
        
        
        
        int soldierneeded = 0 ; 
        for(int i = 0 ; i< needed-luckeytroop ; i++){
            soldierneeded += requiredsoldier[i] ; 
        }
        
        
        return soldierneeded ;
    }
    
    public static void main(String[] args){
        
        int arr [] = {2,3,4,9,8,7} ; 
        System.out.println(minSoldiers(arr,4)); 
        
        
    }
}