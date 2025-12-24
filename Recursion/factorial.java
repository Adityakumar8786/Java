class factorial {
    public static int factorial(int n ){
        if (n == 0 ) return 1 ; 

        int factorial = n * factorial(n-1) ; 

        return factorial ;
    }
    public static void main(String[] args){
        System.out.println(factorial(5));
    }
}