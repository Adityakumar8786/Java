class swapno{
    public static void swapno(int a , int b){
        a = a^b ; 
        b = a^b ; 
        a = a^b ; 
        System.out.println(a+","+b);
    }
    public static void main(String[] args){
        swapno(5,6) ;
    }
}