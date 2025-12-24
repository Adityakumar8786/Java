import java.util.* ; 

public class factorial{
public static void main(String args[]){

    int factorial = 1 ; 

Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
    
    for (int i = 1 ; i <= n ; i ++){
factorial *= i ;
    }

System.out.print(factorial);
}
}