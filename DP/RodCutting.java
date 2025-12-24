public class RodCutting {

    public static int Tabulation(int[] values , int length){

             int dp[][] = new int[values.length+1][length+1] ;

        for(int i = 0 ; i <= values.length ; i++){

            dp[i][0] = 0 ; 

        } 

     for(int j = 0 ; j <= length ; j++){
dp[0][j] = 0 ; 
     }
  
     
     for(int i = 1 ; i <= values.length ; i++ ){
        for(int j = 1 ; j <= length ; j++ ){

if(values[i-1] <= j){

    dp[i][j] = Math.max(values[i-1] + dp[i][j-i] , dp[i-1][j]) ; 

}else{

dp[i][j] =  dp[i-1][j] ; 

}

        }
     }

    return dp[values.length][length] ;
    }


    public static void main(String[]args){

        int[]coins = {1, 5, 8, 9, 10, 17, 17, 20} ; 
        System.out.print(Tabulation(coins, 8));
    }
}