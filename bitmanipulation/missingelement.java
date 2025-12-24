class missingelement{
    public static int findmissingelement(int arr[]){
        int a = 0 ; 
        int b = 0 ; 
    for(int i = 0 ; i<arr.length ; i++){
a ^= arr[i];
    }

    for(int i = 1 ; i<=arr.length+1 ; i++){
b ^= i;
    }


return a^b ; 
    }

    public static void main(String [] args){
       int [] arr = {1,2,3,5};
        System.out.println(findmissingelement(arr));
    }
}