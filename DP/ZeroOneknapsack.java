public class ZeroOneknapsack {

    public static int knapsack(int[]values , int[] weights , int weight , int n){

        if(n== 0 || weight == 0){
            return 0 ; 
        }

        if(weights[n-1] <= weight ){

int ans1 = values[n-1] + knapsack(values, weights, weight-weights[n-1], n-1) ;
int ans2 = knapsack(values, weights, weight, n-1) ; 
return Math.max(ans1,ans2) ;
        }
        else {

return knapsack(values, weights, weight, n-1);
        }
    }






public static int tabulation(int values[] , int weights[] , int Weight , int n){

    int [][] dp = new int[n+1][Weight+1] ;

    
for(int i = 0 ; i <= n ; i++){

    dp[i][0] = 0 ; 
}

for(int j = 0 ; j <= Weight ; j++){

    dp[0][j] = 0 ; 
}


for(int i = 1 ; i < n+1 ; i ++){
    for(int j = 1 ; j < Weight+1 ; j++){

        int v = values[i-1] ; 
        int w = weights[i-1] ; 

        if(w <= j){

           int ans1 = v+dp[i-1][j-w] ;
           int ans2 = dp[i-1][j] ;

           dp[i][j] = Math.max(ans1, ans2);
        }

        else{
            dp[i][j] = dp[i-1][j] ;
        }

    }
}

           return dp[n][Weight] ; 

}




    public static void main(String[]args){
int[] values = {60, 100, 120};
        int[] weights = {10, 20, 30};
        int W = 50;
        int n = values.length;

        System.out.println(knapsack(values, weights, W, n));
        System.out.println(tabulation(values, weights, W, n));
    }
}