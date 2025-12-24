 class clearlastibits {
    public static int clearlastibits(int n , int i ){
    return n & ((-1<<i)) ; 
    }
    public static void main(String[] args){
System.out.println(clearlastibits(15,2));
    }
 }
 