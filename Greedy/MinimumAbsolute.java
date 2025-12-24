import java.util.Arrays;

public class MinimumAbsolute {
    
     static int A[] = {1,2,3};
    static int B[] = {2,1,4};

    static int Minabsolutevalue = 0 ; 

    public static void main(String args[]){
        Arrays.sort(A);
        Arrays.sort(B); 

        for(int i = 0 ; i < A.length ; i++){
Minabsolutevalue = Math.abs(A[i] - B[i] ); 
        }

        System.out.print(Minabsolutevalue);
    }
}
