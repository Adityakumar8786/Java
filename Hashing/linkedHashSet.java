import java.util.LinkedHashSet ; 
import java.util.Scanner ; 
public class linkedHashSet {

    public static void main(String[] args){
Scanner sc = new Scanner(System.in) ; 

LinkedHashSet <String> cities = new LinkedHashSet<>() ;


for(int i = 0 ; i < 4 ; i++){
    String str = sc.nextLine() ; 
    cities.add(str) ; 
}

System.out.print(cities) ; 
sc.close() ; 
    }
}