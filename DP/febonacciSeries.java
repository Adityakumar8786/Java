public class febonacciSeries{

public static int calculatefebonacci(int n , int[]f){

    
    if(n == 0 || n == 1){
        f[n] = n ; 
return n ; 
    }

    f[0] = 0 ; 
    f[1] = 1 ; 

    if(f[n] == 0){
f[n] = calculatefebonacci(n-1, f) + calculatefebonacci(n-2, f); 

    }

    return f[n] ; 
}


public static int tabulation(int n){

    int dp[] = new int[n+1] ; 

    dp[0] = 0 ; 
    dp[1] = 1 ; 

    for(int i = 2 ; i <= n ; i ++){
dp[i] = dp[i-1] + dp[i-2] ;
    }

   return dp[n] ;
}

public static void main(String[] args){

int n = 5 ; 

int[] f = new int[n+1] ; 

System.out.println(calculatefebonacci(n,f));
System.out.println(tabulation(n));

}
}