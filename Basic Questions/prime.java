import java.util.* ; 

public class prime{

     static boolean checkprime (int a ){
        if( a<2) return false ; 
for(int i = 2; i< a ; i ++){

    if(a%2 == 0) return false;
      
      

}
        return true ; 

 }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 

       


        int n = sc.nextInt();
for (int i = 2 ; i<=n ; i++){
    if((checkprime(i))){
        System.out.println(i);
    }
}
    
        }
    }
