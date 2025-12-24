class quicksort{
    public static void quicksort(int arr[] , int si , int ei){
        if(si >= ei){
            return ; 
        }

        int currentpivotidx = partition(arr , si , ei) ; 

        quicksort(arr,si,currentpivotidx-1);
        quicksort(arr,currentpivotidx+1,ei) ;

        
    }

    public static int partition(int arr[] , int si , int ei){
        int pivot = arr[ei] ; 
        int i = si-1 ; 
        for(int j = si ; j < ei ; j++){
if(arr[j] < pivot){
    i++ ; 
    int temp = arr[j] ;
     arr[j] = arr[i] ; 
    arr[i] = temp ; 
}



        }

        i++ ; 
    int temp = pivot ;
     pivot = arr[i] ; 
    arr[i] = temp ; 
        return i ; 

    }

    public static void main(String[] args){
        int [] arr ={1,5,3,4,2};
        quicksort(arr,0,arr.length-1);
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}