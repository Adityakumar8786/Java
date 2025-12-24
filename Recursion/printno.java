class printno {
    public static void printnumber(int n){
        System.out.print(n+" ");
        if(n==1) return ; 
        printnumber(n-1);
    }

public static void main(String[] args){
    printnumber(10);
}
}