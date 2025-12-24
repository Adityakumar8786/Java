public class reverseArray{
    public static void reverseArray(int arr[] , int start , int end){
while(start<end){
int temp = arr[start];
arr[start] = arr[end];
arr[end] = temp ; 

start++;
end--;
    }
    }

    public static void main(String [] args){
        int arr[] = {10,20,30,40,50};

reverseArray(arr,0,arr.length-1);

System.out.println("the reversed array is");

for(int i = 0 ; i< arr.length ; i++){
System.out.println(arr[i]);
}


    }
}