 class ithbit {
    public static int findithbit(int n , int i ){
        if((n & (1<<i)) ==0 ) {
            return 0 ; 
        }
        else{
            return 1 ; 
        }
    }
    public static void main(String[] args){
System.out.println(findithbit(5,2));
    }
 }