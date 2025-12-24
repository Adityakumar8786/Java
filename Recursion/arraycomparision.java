class arraycomparision{
    public static void sortedarray(int arr[] ,int i ){
        if(i==arr.length-1){
            System.out.println("Array is sorted"); 
return ; 
}

        if(arr[i] > arr[i+1]){
            System.out.println("Array is not sorted"); 
            return ; 
        }
        sortedarray(arr,i+1);
    }


    public static void main(String [] args){
        int [] arr={1,2,3,5,4};
sortedarray(arr,0);
    }
}