import java.util.*;

public class binarydecimal{
   

public static void binarytodecimal(int n) {

int binarynum = n; 
int power = 0 ; 
int decnum = 0 ; 

while(n>0){
    int lastdigit = n%10 ; 
    decnum = decnum + (lastdigit*(int)Math.pow(2,power)); 
    power++;
    n = n/10 ;
}
System.out.println("the decimal form of "+binarynum+" is "+decnum);
}



 public static void main(String args[]){
Scanner sc = new Scanner(System.in);

int n = sc.nextInt();
binarytodecimal(n);

}
}
