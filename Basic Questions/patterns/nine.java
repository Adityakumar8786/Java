import java.util.*;

public class nine{
    public static void inverted_half_pyramid_with_number(int n ){
int count = 1 ; 

        for (int i = 1 ; i <= n ; i++){
            for (int j = 1 ; j<=i ; j++){
            System.out.print(count);
               count ++ ;  
            }
            System.out.println();
        }
    }  

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        inverted_half_pyramid_with_number(n);
    } 
}