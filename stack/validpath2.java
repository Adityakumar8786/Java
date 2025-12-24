import java.util.* ; 
class validpath2{
    public static void validpath(String str){
Stack<String> s = new Stack<>() ; 
Stack<String> s2 = new Stack<>() ; 
String res = "" ; 
// String [] parts = str.split("/") ; // spli the complete string where / comes and store all parts in a array 
String [] parts = str.split("/+") ; // tread multiple // as / 
for(int i = 0 ; i < parts.length ; i++ ){
    if(parts[i].equals(".")){
        continue ; 
    }
     else if(parts[i].equals("..")){
        if(!s.isEmpty()){
            s.pop() ;
        }
     }
     else{
        s.push(parts[i]); 
     }
}
while(!s.isEmpty()){
   s2.push(s.pop()); 
}
while(!s2.isEmpty()){
   res +=  s2.pop() +"/"; 
}
System.out.println(res) ; 
    }
    public static void main(String[] args){
        String str = "/a/./b/../../c//a/a/b" ; 
        validpath(str) ; 
    }
}