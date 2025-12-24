import java.util.*;

public class palindromic {

    public static void checkpalindrome(int n){
        int number = n ; 
        int reversenumber = 0 ;
        int power = 0 ;

        while(n>0){
            reversenumber = reversenumber*10 + n%10 ;
            n /=10 ; 
        }

        if (number == reversenumber){
            System.out.println("This is a palindromic Number");
        }else{
            System.out.println("This is not a palindromic Number");

        }
    }
    public static void main(String args[]){
Scanner sc = new Scanner (System.in);
int n = sc.nextInt();
checkpalindrome(n);

    }
}