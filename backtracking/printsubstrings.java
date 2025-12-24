class printsubstrings{
public static void printsubstrings(String str , int i , String ans){
    if(i== str.length()){
        if(ans==""){
        System.out.println("null") ;
        }else{
        System.out.println(ans) ;
        }
        return ; 
    }

    printsubstrings(str,i+1,ans+str.charAt(i)) ; 
    printsubstrings(str,i+1,ans) ; 
}
public static void main(String[] args){
    String str = "abc" ; 
    String str2 = "ab" ; 
    printsubstrings(str,0,"");
    printsubstrings(str2,0,"");
}
}