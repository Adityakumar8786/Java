class nooflowercase{
    public static void countlowercase(String str){
        int count = 0 ; 
        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                count++ ;
            }
        }
System.out.println(count);
    }
public static void main(String[] args){
String str = "Aditya Kumar PRadhan";
countlowercase(str);

}
}