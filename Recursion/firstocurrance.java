class firstocurrance {


    public static void firstocurrance(int arr[], int i ,int key){
if(arr[i] == key ){
System.out.println(i);
return ; 
} 

if(i == arr.length) {
System.out.print("key is not found");
return ; 
}

firstocurrance(arr,i+1,key);


    }



// public static int lastoccurance(int arr[] , int i , int key){
//     if(i == arr.length) return -1; 
//     int isfound = lastoccurance(arr,i+1,key);
//     if(isfound==-1 && arr[i] == key) return i ;
//     return lastoccurance(arr,i+1,key);
// }



public static void lastoccurance(int arr[] , int i , int key){
    if(i < 0) {
    System.out.println("Key is not found");
        return ; 
        }

        if(arr[i] == key){
    System.out.println(i);
    return ; 
}

lastoccurance(arr,i-1,key) ;

    
}


    public static void main(String [] args){
        int [] arr = {1,2,3,4,5,3};
        firstocurrance(arr,0,5);
        // System.out.println(lastoccurance(arr,0,3));
        lastoccurance(arr,arr.length-1,3);
    }

}