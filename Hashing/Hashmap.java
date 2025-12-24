import java.util.HashMap; 

public class Hashmap {

    public static void main(String[] args){
      
       HashMap<String,Integer> menu  = new HashMap<>() ; 

       menu.put("chai",5) ; 
       menu.put("coffee",10) ; 
       menu.put("samosa",6) ; 

       System.out.println(menu) ; 

       System.out.println(menu.get("chai"));

       System.out.println(menu.containsKey("cofee"));
       System.out.println(menu.containsKey("bread pakoda")); 

menu.remove("coffee") ; 
System.out.println(menu.containsKey("coffee")) ; 


System.out.println(menu.isEmpty()) ; 

menu.clear() ; 

System.out.println(menu.isEmpty()) ; 
    }
}