import java.util.HashMap ;

public class findItinerary {


    public static String findStart(HashMap<String,String> hm){

        HashMap<String,String> reverse = new HashMap<>() ; 

        for(String key : hm.keySet()){
            reverse.put(hm.get(key),key) ;
        }

        


        for(String key : hm.keySet()){

            if(!reverse.containsKey(key)){
                return key ;
            }
        }

        return null ; 
    }

    public static void main(String[] args){

        HashMap<String,String> hm = new HashMap<>() ; 

        hm.put("chennai","Bengaluru");
        hm.put("Mumbai","Delhi");
        hm.put("Goa","chennai");
        hm.put("Delhi","Goa");


        String start = findStart(hm) ; 

        System.out.print(start) ; 

// for(String key : hm.keySet()){

//     System.out.print("->"+hm.get(start));
//     start = hm.get(start) ;
// }

while (hm.containsKey(start)) {
        System.out.print("->" + hm.get(start));
        start = hm.get(start);
    }

    }
}