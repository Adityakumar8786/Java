import java.util.* ; 
public class sumofsubarrayprefix{

    public static void sumofsubarray(int arr[]){
        int [] prefix = new int[arr.length];
prefix[0] = arr[0];
for(int i = 1 ; i < arr.length ; i++){
    prefix[i] = prefix[i-1]+arr[i] ; 
}

for(int i = 0 ; i < arr.length ; i++){
    for(int j = i ; j< arr.length ; j++){

int start = i ; 
int end = j ; 
int currentsum = 0 ; 
currentsum = start == 0 ?prefix[end]: prefix[end] - prefix[start-1]; 
System.out.println(arr[start]+"to"+arr[end]+"="+currentsum);
    }
}

    }
    public static void main(String [] args){
int [] arr = {1,2,3,4,5};
sumofsubarray(arr);
    }
}