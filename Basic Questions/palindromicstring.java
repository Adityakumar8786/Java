class palindromicstring{
    public static void ispalindromic(String str){
for(int i = 0 ; i < str.length()/2 ; i++){
    if(str.charAt(i) == str.charAt(str.length()-1-i)){
        System.out.print("String is Palindromic");
        return ; 
    }else{
        System.out.print("String is not palindromic");
        return ; 
    }
}
    }

    public static void main(String[] args){
        String str = "Racecar";
        ispalindromic(str);
    }
}