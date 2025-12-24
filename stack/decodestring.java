import java.util.* ; 
class decodestring{
    public static void decode(String str){
Stack<Integer> numstack = new Stack<>() ; 
Stack<String> strstack = new Stack<>() ;

String currstr = "" ; 
int num = 0 ; 

for(int i= 0 ; i < str.length(); i++ ){
    char ch = str.charAt(i) ; 

    if(Character.isDigit(ch)){
        num = num*10+(ch-'0') ; 
    }else if(ch == '['){
numstack.push(num);
strstack.push(currstr) ; 
num = 0 ; 
currstr ="" ; 
    }
    else if (ch==']'){
        int repeat = numstack.pop() ; 
        String temp = strstack.pop() ; 

        StringBuilder sb = new StringBuilder(temp) ; 
        sb.append(currstr.repeat(repeat)) ;
        currstr = sb.toString() ; 
    }
    else{
        currstr += ch ; 
    }
}
System.out.println(currstr) ;
    }

    public static void main(String[] args){
        String str = "b2[3[c]]" ; 
        decode(str) ; 
    }
}