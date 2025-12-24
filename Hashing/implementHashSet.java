import java.util.HashSet; 

public class implementHashSet {

public static void main(String[] args){

HashSet<Integer> hs = new HashSet<>(); 

hs.add(1) ; 
hs.add(2) ; 
hs.add(6) ; 
hs.add(1) ; 
hs.add(7) ; 


System.out.println(hs) ; 

System.out.println(hs.contains(5)) ; 
System.out.println(hs.size()) ; 
System.out.println(hs.isEmpty()) ; 


}
}