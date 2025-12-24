class permutations{
    public static void permutations(String str ,String ans){
        //basecase

        if(str.length()==0){
            System.out.println(ans) ;
            return ; 
        }
        
        for(int i = 0 ; i < str.length() ; i++){
    char current = str.charAt(i) ; 
    String newstr = str.substring(0,i) + str.substring(i+1) ; 
    permutations(newstr,ans+str.charAt(i)) ; 
        }


    }

    public static void main(String [] args){
        String str = "abc" ; 
        permutations(str,"") ; 
    }
}