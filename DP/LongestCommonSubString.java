public class LongestCommonSubString {

static int result = 0 ; 
static int memoizationresult = 0 ; 
   public static int recursion(String a , String b , int n , int m , int count){


    if(n== 0 || m == 0){
        return count ; 
    }

    if(a.charAt(n-1) == b.charAt(m-1)){
  count =  recursion(a, b, n-1, m-1 ,count+1) ; 
result = Math.max(count, result);
    }else{
count = 0 ; 
    }

    recursion(a, b, n-1, m, 0); 
    recursion(a, b, n, m-1, 0); 

    return result ; 
   }


   public static int tabulation(String a , String b , int n , int m ){
     int max = 0 ; 

    int[][] dp = new int[n+1][m+1] ; 

    for(int i = 1 ; i < n+1 ; i++){
      for(int j = 1 ; j < m+1 ; j++){

        if(a.charAt(i-1) == b.charAt(j-1)){
dp[i][j] = dp[i-1][j-1]+1 ;
max = Math.max(max, dp[i][j]);
        }else{
dp[i][j] = 0 ; 
        }

      }
    }
return max; 

   }

   public static int memoization(String a , String b , int n , int m , int count , int[][]dp){

    if(n == 0 || m == 0 ){
      return count ;
    }


    if(dp[n][m] != -1){
    return dp[n][m] ; 

    }

    

if(a.charAt(n-1) == b.charAt(m-1)){
count = memoization(a,b,n-1,m-1,count+1,dp);
dp[n][m] = Math.max(count,memoizationresult) ;
} 

else{
  count = 0 ; 
}       
    
memoization(a, b, n - 1, m, 0, dp);
memoization(a, b, n, m - 1, 0, dp);


return dp[n][m] ; 
   }

   public static void main(String[]args){
 String a = "abcdxyz";
 String b = "xyzabcd";
int n = a.length() ; 
int m = b.length() ; 

 System.out.println(recursion(a, b,n,m,0));


int[][] dp = new int[n+1][m+1] ; 

for(int i = 0 ; i < n+1 ; i++){
for(int j = 0 ; j < m+1 ; j++){

  dp[i][j] = -1 ; 
}
}

System.out.println(memoization(a, b, n, m, 0, dp)) ;
System.out.println(tabulation(a, b, n, m)) ;
   }
}