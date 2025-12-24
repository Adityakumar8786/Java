public class typecasting {
    public static void main(String[] args){
        float a = 99.23f ; 
        // int b = a ; //can't possible type conversion so we try to type casting 
        int b = (int) a ; 
System.out.println(b); //this is called as type casting 


short e = 33 ;
int f = 78 ; 
char g = 'a';

// byte k = e+f+g ; the op will come incompatible types: possible lossy conversion from int to byte 
//even though there is a addition of int 

byte k = (byte) (e+f+g) ; 
System.out.println(k); // even though there would be a insensible answer we will get 


short l = 6 ; 
double s = 9.99 ; 
long j = 8777 ; 
float n = 98.6f ; 

double result = l+s+j+n  ; 
System.out.println(result);

//if one operand is long , float or double the whole expression is promoted to the heighest priority 



byte x = 5 ; 
//x = x*2 ;  // op error because the x is converted to int and then the whole exprsion couldnot converted into byte 
x = (byte) (x*2 ); 
System.out.println(x);
    }
}