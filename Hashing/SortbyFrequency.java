import java.util.ArrayList ; 
import java.util.HashMap ; 
import java.util.Map;
import java.util.Collections;

public class SortbyFrequency {

    public static String convert(String str){

        char[] charArray = str.toCharArray() ; 
        HashMap<Character,Integer> map = new HashMap<>() ; 

        for(int i = 0 ; i < charArray.length ; i++){


            if(map.containsKey(charArray[i])){

map.put(charArray[i] , map.get(charArray[i])+1) ; 

            }else{

map.put(charArray[i] , 1) ; 

            }

        }


        ArrayList<Map.Entry<Character,Integer>> list = new ArrayList<>(map.entrySet()) ; 

        Collections.sort(list,(a,b)->b.getValue() - a.getValue()) ; 

StringBuilder sb = new StringBuilder() ; 

for(int i = 0 ; i < list.size() ; i++){

Map.Entry<Character,Integer> entry = list.get(i) ; 

    char ch = entry.getKey() ;
    int freq = entry.getValue() ; 

    for(int j = 0 ; j < freq ; j++){
sb.append(ch) ; 
    }

}

return sb.toString() ; 

    }  


    public static void main(String[] args){
        String str = "tree" ; 
       System.out.println(convert(str)) ; 
    }
}