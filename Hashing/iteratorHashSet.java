
import java.util.HashSet ; 
import java.util.Iterator ; 

public class iteratorHashSet {

    public static void main(String[] args){


        HashSet<String> cities = new HashSet<>() ; 


cities.add("Delhi") ; 
cities.add("Noida") ; 
cities.add("Berhampur") ; 
cities.add("Bhubaneswar") ; 


        for(String city : cities){
System.out.print(city+" ") ; 
        }

Iterator<String> it = cities.iterator() ; 

System.out.println() ; 


while(it.hasNext()){
System.out.print(it.next()+" ") ;
}


    }
}