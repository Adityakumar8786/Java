import java.util.Arrays;

public class CatalansSeries{

    public static int recursion(int n){
        if(n == 0 || n == 1){
            return 1 ; 
        }

        int ans = 0 ; 
        for(int i = 0 ; i < n ; i++){
ans += recursion(i) * recursion(n-1-i);
        }

        return ans ; 
    }



    public static long memoiazation(int n, long[]dp){


        if(n == 0 || n ==1){
            return 1L ; 
        }


if(dp[n] != -1L){
    return dp[n] ; 
}

long ans = 0 ; 
for(int i = 0 ; i < n ; i++){
ans += memoiazation(i, dp) * memoiazation(n-1-i, dp)  ;
}

return dp[n] = ans ; 

    }

    public static int tabulation(int sizen){

int[]dp = new int[sizen+1] ; 

dp[0] = 1 ; 
dp[1] = 1 ; 

for(int n = 2 ; n <= sizen ; n++){
    
    for(int i = 0 ; i < n ; i++){
    dp[n] += dp[i] * dp[n-i-1] ;
    }
}

return dp[sizen] ;

}

    public static void main(String[]args){

        int n = 4 ; 
        System.out.println(recursion(n)) ;

        long[] dp = new long[n+1] ; 
        Arrays.fill(dp,-1L);
        System.out.println(memoiazation(n,dp)) ;

        
        System.out.println(tabulation(n)) ;

    }
}