class gridwaysoptimized{


    public static int factorial(int n){
int fact = 1 ; 
        for(int i = 1 ; i<= n ; i++){
           fact *= i ; 
        }
        return fact ; 
    }


    public static int gridways(int n, int m , int i ,int j){
int x = factorial(n-1+m-1);
int y = factorial(n-1)*factorial(m-1) ; 
return x / y ; 
    }



     public static void main(String[] args){
        System.out.print(gridways(3,3,0,0)) ;
     }
}