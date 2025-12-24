import java.util.* ; 

public class revofno{
    public static void main(String args[]){
        Scanner a = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = a.nextInt();

        while(n>0){
            int lastdigit = n%10 ; 
            System.out.print(lastdigit);
            n /= 10 ;
        }
    }
}