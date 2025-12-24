import java.util.*;

public class largestArray{
    public static int Largest(int arr[]){

        int largest = Integer.MIN_VALUE ; 

        for(int i = 0 ; i<arr.length; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        return largest ; 
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
int [] number = new int[10];
for(int i = 0 ; i < number.length ; i++){
    number[i] = sc.nextInt(); 
}

System.out.println("The largest Number of the Array is"+Largest(number));
    }
}
