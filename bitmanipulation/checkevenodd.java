class checkevenodd{
    public static void check(int n){
        if((n & 1)==1){
            System.out.println("The Number is odd");
        }
        if((n&1)==0){
            System.out.println("The Number is even");
        }
    }

    public static void main(String[] args){
        check(3);
        check(6);
    }
}