import java.util.*;

public class sumofdigits {
public static void sumofdigitss (int n){
int number = n ; 
int count = 0 ; 

while(n>0){
count += n%10 ; 
n /=10 ; 
}
System.out.println("The sum of all digits of number is "+ count );
}

public static void main(String args[]){
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();

sumofdigitss(n);
}
}
