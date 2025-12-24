import java.util.*;

public class eight{

    public static void inverted_half_pyramid_with_number(int n ){
        for (int i = n ; i >= 1 ; i--){
            for (int j = i ; j>=1 ; j--){
            System.out.print(n-i+1);
                
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