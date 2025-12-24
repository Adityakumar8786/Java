import java.util.* ; 
class duplicateparantheses{
public static boolean isduplicate(String str){
    Stack<Character> s = new Stack<>();

    for(int i = 0 ; i<str.length() ; i++){
        char ch = str.charAt(i) ; 

        // closing 
         if(ch == ')'){
        int count = 0 ; 
        while(s.peek() != '('){
            s.pop() ; 
            count ++ ; 
        }

        if(count==0){
             return true ; 
        }else{
s.pop() ; //delete '(' 
        }
        }
        else{

        s.push(ch) ; 
        }
    }
    return false ; 
}


    public static void main(String[] args){
        String str = "((a+b))" ; 
        String str1 = "((a+b)+c)" ;

        System.out.println(isduplicate(str)) ; 
        System.out.println(isduplicate(str1)) ; 
    }
}