import java.util.*;
public class printnum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        for(;;){
            int n = sc.nextInt(); 
            if(n%10 == 0 ) break;
            if(n%5==0) continue ; 
            System.out.println(n);

            }

        
    }
}