public class LongestCommonSubSequence {

    
    public static int recursion(String a , String b , int n , int m ){

        if(n == 0 || m == 0){
            return 0 ; 
        }



        if(a.charAt(n-1) == b.charAt(m-1)){
return recursion(a, b, n-1, m-1) +1 ; 
        }else{
return Math.max(recursion(a, b, n-1, m) , recursion(a, b, n, m-1) );
        }


    }



    public static int memoization(String a , String b , int n , int m , int[][] dp){

    if(n == 0 || m == 0){
            return 0 ; 
        }


if(dp[n][m] != -1){
    return dp[n][m] ; 
}


if(a.charAt(n-1) == b.charAt(m-1)){

dp[n][m] = memoization(a,b,n-1,m-1,dp)+1; 
return dp[n][m] ; 
}
else{
dp[n][m] = Math.max(memoization(a,b,n-1,m,dp),memoization(a,b,n,m-1,dp)) ; 
return dp[n][m] ; 

}

}




public static int tabulation(String a , String b , int n , int m){

  int[][] dp = new int[n+1][m+1] ; 

for(int i = 0 ; i < n+1 ; i++){
    for(int j = 0 ; j < m+1 ; j++){

if(i== 0 || j == 0){
    dp[i][j] = 0 ; 
}

    }
    
    }
for(int i = 1 ; i < n+1 ; i++){
    for(int j = 1 ; j < m+1 ; j++){

if(a.charAt(i-1) == b.charAt(j-1)){

dp[i][j] = dp[i-1][j-1] +1 ;
}else{
dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]) ; 
}
    }
}

  

return dp[n][m] ; 
}


    public static void main(String[]args){
        String a = "abcde";
        String b = "ace";

        int n = a.length();
        int m = b.length();

          int[][] dp = new int[n+1][m+1] ; 

  for(int i = 0 ; i < n+1 ; i++){
    for(int j = 0 ; j < m+1 ; j++){

dp[i][j] = -1 ; 

    }
}


        int lcsLength = recursion(a, b, n, m);
        System.out.println("Length of Longest Common Subsequence: " + lcsLength);
        System.out.println("Length of Longest Common Subsequence: " + memoization(a, b, n, m, dp));
        System.out.println("Length of Longest Common Subsequence: " +tabulation(a, b, n, m) );
    }
}