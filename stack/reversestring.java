import java.util.Stack ; 

class reversestring{
    public static void reverseString(String str){
        Stack<Character> s = new Stack<>() ; 
        for(int i = 0 ; i<str.length() ; i++){
            s.push(str.charAt(i)) ; 
        }

StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()){
char top = s.pop() ;
result.append(top) ; 
        }
        System.out.println(result.toString()) ; 
    }
    public static void main(String[] args){
String str = "abc" ; 
reverseString(str);
    }
}