class ClimbingStairs {


public static int recursion(int n){

if (n<0){
    return 0 ;
}

if(n==0){
    return 1 ; 
}

return recursion(n-1) + recursion(n-2) ; 

}


public static int memoization(int n , int[]dp){

dp[0] = 1 ; 

if(n==1){
return 1 ; 
}

if(dp[n] == 0){

dp[n] = memoization(n-1,dp) + memoization(n-2,dp) ;
    
}

return dp[n] ; 
}

public static int tabulation(int n , int dp[]){


dp[0] = 1 ; 
dp[1] = 1 ; 

for(int i = 2 ; i <= n ; i++){
dp[i] = dp[i-1] + dp[i-2] ; 
}

return dp[n] ; 
}

    public static int climbStairs(int n) {
 int[]dp = new int[n+1] ; 
        
    // return recursion(n);
    // return memoization(n,dp) ; 
    return tabulation(n,dp) ;  
    }

public static void main(String[]args){

    System.out.print(climbStairs(5)) ;
}
}