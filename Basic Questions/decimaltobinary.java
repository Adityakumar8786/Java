import java.util.*; 

public class decimaltobinary {


public static void decimaltobinary(int n){
int decimalnum = n ;
int power = 0 ;
int binarynum = 0 ;

while (n>0){
    int reminder = n%2 ; 
    binarynum = binarynum+(reminder*(int)Math.pow(10,power));
    power++;
    n /=2 ;
}

System.out.println("The binary form of "+decimalnum+" is "+binarynum);
}

public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
decimaltobinary(n);

}
}