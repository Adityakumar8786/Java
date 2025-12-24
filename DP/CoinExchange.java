public class CoinExchange {

    public static int Tabulation(int[] coins , int Totalcost){

        int dp[][] = new int[coins.length+1][Totalcost+1] ;

        for(int i = 0 ; i <= coins.length ; i++){

            dp[i][0] = 0 ; 

        } 

     for(int j = 0 ; j <= Totalcost ; j++){
dp[0][j] = 0 ; 
     }
  
     
     for(int i = 1 ; i <= coins.length ; i++ ){
        for(int j = 1 ; j <= Totalcost ; j++ ){

if(coins[i-1] <= j){

    dp[i][j] = Math.max(coins[i-1] + dp[i][j-coins[i-1]] , dp[i-1][j]) ; 

}else{

dp[i][j] =  dp[i-1][j] ; 

}

        }
     }

    return dp[coins.length][Totalcost] ;
    }

    public static void main(String[]args){

        int[]coins = {1,2,3} ; 
        System.out.print(Tabulation(coins, 5));
    }
}