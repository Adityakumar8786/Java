public class bubblesort{
    public static void bubblesort(int arr[]){
        for(int turns = 1 ; turns <arr.length ; turns++ ){
for(int noofswaps = 0 ; noofswaps<arr.length-turns; noofswaps++){
    if(arr[noofswaps]>arr[noofswaps+1]){
        int temp = arr[noofswaps] ; 
        arr[noofswaps] = arr[noofswaps+1];
        arr[noofswaps+1] = temp ; 
    }

}
        }
    }

    

    public static void main(String [] args){
    int [] arr = {1,5,4,2,3};
    bubblesort(arr);
    for(int i = 0 ; i < arr.length ; i++){
        System.out.print(arr[i]+" ");
    }
    }
}