import java.util.* ; 
class validpath{
    public static String validpath(String str){
Stack<String> s = new Stack<>() ; 
Stack<String> s2 = new Stack<>() ; 
String res = "" ; 
for(int i = 0 ; i < str.length() ; i++){
    String dir = "" ; 
    

    while(i<str.length() && str.charAt(i)!='/' ){
        dir += str.charAt(i) ;
        i++ ;  
    }

    if(dir.equals(".")==true){
        continue ; 
    }else if(dir.equals("..")==true){
        if(!s.isEmpty()){
            s.pop() ; 
        }
    }else{
        if(dir.length() != 0){
            s.push(dir) ; 
        }
    }

}
while(!s.isEmpty()){
s2.push(s.pop());
}
while(!s2.isEmpty()){
    res +="/"+s2.pop(); 
}
return res ; 
    }
    public static void main(String[] args){
        String str = "/a/./b/../../c//a/a/b" ; 
        System.out.print(validpath(str)) ; 
    }
}