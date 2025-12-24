public class binarysearch{
public static int binarysearch(int arr[],int key){
    int low = 0 ; 
    int high = arr.length-1 ; 

    while(low <= high){
        int mid = (low+high)/2;

        if(arr[mid]==key){
            return mid ; 
        }
        else if (arr[mid]>key){
            high = mid-1 ;
        }
        else{
            low = mid+1 ;
        }
    }
return -1 ; 
}

    public static void main(String []args){

int [] numbers = {1,2,3,4,5,6,7,8,9,10};
int key = 10 ; 

System.out.println("Your Desired element is found in "+binarysearch(numbers,key)+" position") ;
    }
}