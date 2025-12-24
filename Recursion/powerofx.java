class powerofx{
    public static int powerofx(int x ,int n){
        if(n==1) return 1 ; 
        return x*powerofx(x,n-1) ; 
    }



    public static int optimizedpowerofx(int x ,int n){
        if(n==0) return 1 ; 
    

    if(n%2==0){
        int y = optimizedpowerofx(x,n/2);
        return y*y ; 
    }else{
        int y = optimizedpowerofx(x,n/2);
        return x*y*y ; 
    }
    }
    public static void main(String [] args){
        System.out.println(powerofx(5,5));
        System.out.println(optimizedpowerofx(5,5));
    }
}