public class TargetSumSubset {
    

    public static boolean isTargetSumSubset(int values[] , int targetsum){

        boolean[][] dp = new boolean[values.length+1][targetsum+1] ; 

for(int i = 0 ; i < values.length ; i++){
dp[i][0] = true ; 
}

for(int j = 0 ; j < targetsum ; j++){
dp[0][j] = false ; 
}

for(int i = 1; i < values.length +1 ; i++){
    for(int j = 1 ; j < targetsum + 1 ; j++){

    int v = values[i-1] ; 

        if(v <= j && dp[i-1][j-v] == true ){
dp[i][j] = true ; 
        }
         else if(dp[i-1][j] == true){
dp[i][j] = true ; 
        }
    }
}

return dp[values.length][targetsum] ; 
    }

    public static void main(String[] args){
        int arr[] = {4,2,7,1,3} ; 
        int targetsum = 10 ; 

        System.out.print(isTargetSumSubset(arr, targetsum));
    }
}
