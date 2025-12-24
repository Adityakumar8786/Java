import java.util.*;
public class binomialfact{


public static int factorial(int n){
    int fact= 1 ; 
    for(int i = 1 ; i <= n ; i++ ){
        fact *= i ; 
    }
    return fact ; 
}

public static int calcbinomial(int n, int r){
int fact_n = factorial(n);
int fact_r = factorial(r);
int fact_nmr = factorial(n-r);
int binomialcoeficcient = fact_n/(fact_r*fact_nmr);
return binomialcoeficcient ;
}


    public static void main(String args[]){
Scanner sc = new Scanner (System.in);
System.out.println("Enter n"); 
int n = sc.nextInt();
System.out.println("Enter r"); 
int r = sc.nextInt();

System.out.println(calcbinomial(n,r));

    }
}