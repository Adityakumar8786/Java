public class PartArrayIntoTw0ArrtoMinSumDiff {

    public static int minsum(int[] nums){
int n = nums.length ; 
int sum = 0 ; 
        
for(int i = 0 ; i < nums.length ; i++){
    sum += nums[i] ; 
}
int W = sum/2 ; 
int[][] dp = new int [n+1][W+1] ; 

for(int i = 0 ; i < n+1 ; i++){
    for(int j = 0 ; j < W+1 ; j++){

if(i == 0 || j == 0){
dp[i][j] = 0 ; 
}
    }
}


for(int i = 1 ; i < n+1 ; i++){
    for(int j = 1 ; j <W+1 ; j++){

if(nums[i-1] <= j){
dp[i][j] = Math.max(dp[i-1][j-nums[i-1]]+nums[i-1] , dp[i-1][j]) ;
}else{
dp[i][j] = dp[i-1][j] ; 
}
    }
}
int sum1 = dp[n][W] ; 
int sum2 = sum-sum1 ; 
return Math.abs(sum1 - sum2 );


    }

    public static void main(String[] args){

        int[] nums = {60, 100, 120}; 
        System.out.println(minsum(nums));
    }
}