class updatebit{



    public static int clearithbit(int n , int i ){
    return n & (~(1<<i)) ; 
    }


    public static int setithbit(int n , int i ){
    return n | (1<<i) ; 
    }


    public static int updatebit(int n , int i , int newint){
        if(newint == 0){
return clearithbit(n,i);
        }else{
            return setithbit(n,i);
        }
    }

    public static void main(String [] args){
        System.out.println(updatebit(10,2,1));
    }
}