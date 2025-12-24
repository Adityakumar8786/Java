import java.util.HashMap ; 
import java.util.ArrayList ; 
import java.util.List ; 
import java.util.Arrays ;


class groupAnagram {
    public static List<List<String>> groupAnagramss(String[] strs) {

        HashMap<String , List<String>> map = new HashMap<>() ; 

for(int i= 0 ; i<strs.length ; i++){

    char[] chars = strs[i].toCharArray() ; 

    Arrays.sort(chars) ; 

    String sorted = new String(chars) ;

if(!map.containsKey(sorted)){
    map.put(sorted,new ArrayList<>()) ;
}


    map.get(sorted).add(strs[i]) ; 


}

return new ArrayList<>(map.values()) ;
    }


    public static void main(String[] args){

        String[] str = {"eat","tea","tan","ate","nat","bat"} ; 
List <List<String>> x= new ArrayList<>() ;
       x = groupAnagramss(str) ;

       for(int i = 0 ; i< x.size() ; i++){
        System.out.print(x.get(i)+" ") ;
       }

    }
}