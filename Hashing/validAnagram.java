import java.util.HashMap ; 

class validAnagram {

    public static boolean isAnagram(String s, String t) {
        
        HashMap<Character,Integer> hm = new HashMap<>() ; 

        for(int i = 0; i < s.length() ; i++){

            if(hm.containsKey(s.charAt(i))){

            hm.put(s.charAt(i),hm.get(s.charAt(i))+1) ; 

            }else{

            hm.put(s.charAt(i),1) ; 

            }
        } 


for(int i = 0 ; i < t.length() ; i++){

if(hm.containsKey(t.charAt(i))){

    hm.put(t.charAt(i),hm.get(t.charAt(i))-1) ; 
}


else{

    return false ; 

}

 if(hm.get(t.charAt(i))==0){
    hm.remove(t.charAt(i)) ; 
}

}

if(hm.isEmpty()){
    return true ; 
}
else{
    return false ; 
}

    }

    public static void main(String[] args){

        String a = "sk" ; 
        String b = "ks" ; 
        // String str = "cat" ; 
        System.out.println(isAnagram(a,b)) ; 
    }
}