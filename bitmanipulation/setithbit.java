 class setithbit {
    public static int findithbit(int n , int i ){
    return n | (1<<i) ; 
    }
    public static void main(String[] args){
System.out.println(findithbit(10,2));
    }
 }
 