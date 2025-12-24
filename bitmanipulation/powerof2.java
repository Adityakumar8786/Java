class powerof2{
    public static void checkpowerof2(int n){
        if((n & (n-1)) ==0){
            System.out.println("The no is power of 2");
        }else{
            System.out.println("The no is not a power of 2");
        }
    }
    public static void main(String [] args){
        checkpowerof2(5);
    }
}