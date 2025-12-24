public class ZeroOneKnapsackmemoization {

    public static int memoization(int values[] , int weights[] , int Weight , int n , int dp[][]){

        if(n == 0 || Weight==1 ){
return 0 ; 
        }

 if(dp[n][Weight] != -1){
    return dp[n][Weight] ; 
 }   
 
 if(weights[n-1] < Weight){

 int ans1 = values[n-1]+memoization(values, weights, Weight-weights[n-1], n, dp)  ;
 int ans2 = memoization(values, weights, Weight, n, dp)  ;
  dp[n][Weight] = Math.max(ans2, ans1); 
 
    return dp[n][Weight] ; 
 }
 else {
dp[n][Weight] = memoization(values, weights, Weight, n, dp)  ;
    return dp[n][Weight] ; 
 }
    }

    public static void main(String[]args){
int[] values = {60, 100, 120};
        int[] weights = {10, 20, 30};
        int W = 50;
        int n = values.length;

int[][] dp = new int[n][weights.length] ;
        System.out.println(memoization(values, weights, W, n,dp));
    }

}