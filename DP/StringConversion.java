public class StringConversion {
    
    public static int lcs(String word1 , String word2 , int n , int m ){

        int[][] dp= new int[n+1][m+1] ; 

        for(int i = 0 ; i < n+1 ; i++){
            for(int j = 0 ; j < m+1 ; j++){

                if(i == 0 || j == 0){
                    dp[i][j] = 0 ;
                }
            }
        }


        for(int i =1 ; i < n+1 ; i++){
            for(int j =1 ; j < m+1 ; j++){

if(word1.charAt(i-1) == word2.charAt(j-1)){
dp[i][j] = dp[i-1][j-1]+1 ;
}else{
dp[i][j] = Math.max(dp[i-1][j] , dp[i][j-1]) ; 
}
            }
        }

return dp[n][m] ;
    }

    public static int stringconversion(String w1 , String w2){

int lcsstringlength = lcs(w1, w2, w1.length(), w2.length()) ;

int totalnoOfDeletion = w1.length() - lcsstringlength ; 
int totalnoOfinsertion = w2.length() - lcsstringlength ; 

int totalnoOfOperation = totalnoOfDeletion + totalnoOfinsertion ; 

return totalnoOfOperation ;

    }

    public static void main(String[] args){

        String word1 = "heap" ; 
        String word2 = "pea" ; 

        System.out.println(stringconversion(word1, word2));
    }
}
