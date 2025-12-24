public class MatixChainMultiplication {

    public static int recursion(int[] arr , int i , int j){

        if(i == j){
            return 0 ; 
        }

        int ans = Integer.MAX_VALUE ;
        for(int k = i ; k <= j-1 ; k++){
int cost1 = recursion(arr, i, k) ; 
int cost2 = recursion(arr, k+1, j) ;
int cost3 = arr[i-1] * arr[k] *arr[j] ;

int finalcost = cost1 + cost2 + cost3 ;

ans = Math.min(ans,finalcost);
        }

        return ans ; 
    }


    public static int memoization(int[] arr, int i , int j ,int[][] dp){

        if(i==j){
            return 0 ; 
        }

        if(dp[i][j] != -1){
            return dp[i][j] ;
        }

        int ans = Integer.MAX_VALUE ;

        for(int k = i ; k <= j-1 ; k++){
            int cost1 = memoization(arr, i, k, dp) ;
            int cost2 = memoization(arr, k+1, j, dp) ;
            int cost3 = arr[i-1]*arr[k]*arr[j] ;
            int finalcost = cost1+cost2+cost3 ; 

            ans = Math.min(ans,finalcost) ;
        }
        return dp[i][j] = ans ;
    }



    public static int tabulation(int[] arr){

        int n = arr.length ;

        int[][] dp = new int[n][n] ;

        for(int i = 0 ; i < n ; i++){
            dp[i][i] = 0 ;
        }


for(int len = 2 ; len <= n-1 ; len ++){
    for(int i = 1 ; i <= n-len ; i++){
        int j = i+len-1 ;

        dp[i][j] = Integer.MAX_VALUE ;

        for(int k = i ; k <= j-1 ; k++){

            int cost1 = dp[i][k] ; 
            int cost2 = dp[k+1][j] ;
            int cost3 = arr[i-1]*arr[k]*arr[j] ;

            int finalcost = cost1+ cost2+cost3 ;

dp[i][j] = Math.min(finalcost,dp[i][j]) ;


        }
    }
}
return dp[1][n-1] ;
    }


    public static void main(String[]args){

        int[] ans = {1,2,3,4,3} ; 
int n = ans.length ;
        System.out.println(recursion(ans, 1, 4));

        int[][] dp= new int[n+1][n+1] ;

        for(int i = 0 ; i < dp.length ; i++){
            for(int j = 0 ; j < dp[0].length; j++ ){
                dp[i][j] = -1 ;
            }
        }

        System.out.println(memoization(ans, 1, 4 ,dp));


        System.out.println(tabulation(ans));
        
    }
}