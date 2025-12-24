class tillingproblem{
    public static int countnoofways(int n){
        if (n == 0 || n == 1 ) return 1 ; 
        int vertical = countnoofways(n-1) ;
        int horizontal = countnoofways(n-2) ;

        int totalways= vertical +horizontal ;  
        return totalways ; 
    }

    public static void main(String[] args){
        System.out.println(countnoofways(2));
    }
}