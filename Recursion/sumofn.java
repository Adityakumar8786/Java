class sumofn{


    public static int sumofnnaturalno(int n){
        int sum = 0 ; 

if(n==0) return 0; 
sum = n+sumofnnaturalno(n-1) ; 
return sum ; 
    }

public static void main(String [] args){
    System.out.println(sumofnnaturalno(5));
}
}