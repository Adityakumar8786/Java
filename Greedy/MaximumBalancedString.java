import java.util.Scanner;
public class MaximumBalancedString {

    public static int BalancedPartiton(String str){
        
        int n = str.length() ; 

        if (n == 0 ){
            return 0 ; 
        }
int l = 0 ; 
int r = 0 ; 
int ans = 0 ; 
for(int i = 0 ; i < n ; i++){
    if (str.charAt(i) == 'L'){
l++ ; 
    }else if(str.charAt(i) == 'R'){
r++ ; 
    }if(l==r){
ans ++ ; 
    }
}
        return ans ; 
    }

    public static void main(String args[]){
Scanner scanner = new Scanner(System.in) ; 

String questionedString = scanner.nextLine() ; 


System.out.println(BalancedPartiton(questionedString)) ;  

scanner.close();
    }
}
