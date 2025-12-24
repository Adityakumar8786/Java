import java.util.*;

public class typeconversion{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
int a = 8 ;
double b = a ; 
System.out.println(b);

float c = sc.nextInt();
System.out.println(c);

char ch = 'a';
int d = ch ; 
System.out.println(d);

System.out.println((int)ch);



    }
}


//converison type shoud be same example both should be number 
//destination type > source type 
//byte>short>int>long>float>double 