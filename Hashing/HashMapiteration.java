import java.util.HashMap;
import java.util.Map;
import java.util.Set ;
    public class HashMapiteration {

    public static void main(String[] args){

        HashMap<String,Integer> menu  = new HashMap<>() ; 

       menu.put("chai",5) ; 
       menu.put("coffee",10) ; 
       menu.put("samosa",6) ; 
       menu.put("bread-pakoda",10) ;

       Set<String> keys = menu.keySet() ; 

       for(String k : keys){
        System.out.println(k+"->"+ menu.get(k)) ; 
       }


       Set<Map.Entry<String,Integer>> keyvalue = menu.entrySet() ; 

       for(Map.Entry<String,Integer> entry : keyvalue){
        System.out.println(entry) ; 
       }
    }
}