import java.util.* ; 

class maxtwonum{


    public static void  maxmultiplication(int arr[]){
        int max = Integer.MIN_VALUE ; 
        int max2 = Integer.MIN_VALUE ; 

        for(int i = 0 ; i <arr.length ; i++){
if(arr[i] > max ){
    max2 = max ; 
    max = arr[i] ; 
}else if (arr[i] > max2 && arr[i] != max){
    max2 = arr[i] ; 
}
        }

        System.out.println("The Largest Element in the array is "+ max +" and the second largest is " + max2); 
    }




    public static void maxnos(int arr[]){
Arrays.sort(arr) ; 
        System.out.println("The Largest Element in the array is "+ arr[arr.length-1] +" and the second largest is " + arr[arr.length-2]); 
    }



public static void main(String [] args){
    int arr[] ={22,4,6,88,45,32};
maxmultiplication(arr) ;
maxnos(arr) ; 
}
}