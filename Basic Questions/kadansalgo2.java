import java.util.*;

public class kadansalgo2{

    public static void kadan(int arr[]){
        int currentsum = 0 ; 
        int maxsum = Integer.MIN_VALUE ; 
        boolean isallnegative = true ; 
        for(int i = 0 ; i < arr.length ; i ++){

if(arr[i]>0){
isallnegative = false ; 
}




if(isallnegative == true){
currentsum += arr[i];
if(currentsum>maxsum){
    maxsum = currentsum ; 
}
    }






    else{
if(arr[i]<0){
    arr[i] = 0 ; 
}
currentsum += arr[i];
if(currentsum>maxsum){
    maxsum = currentsum ; 
}
    }








System.out.println(currentsum);

        }
System.out.println("The maximum sum is"+maxsum);
    }

public static void main(String[] args){
int[] numbers = {-1,-2,-3,-4,-5};
kadan(numbers);


}
}