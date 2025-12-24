 class clearrangeofbits {
    public static int clearrangeofbits(int n , int j , int i ){
    int a = -1<<j+1 ; 
    int b = (1<<i)-1 ; 
int bitmask = a|b ; 
return n & bitmask ; 

    }
    public static void main(String[] args){
System.out.println(clearrangeofbits(10,4,2));
    }
 }
 