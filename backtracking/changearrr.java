 class changearrr{
    public static void changearr(int arr[] , int i , int value){
        if(i== arr.length){
            return ; 
        }

        arr[i] = value ; 
changearr(arr,i+1,value+1) ;
arr[i] -= 2 ; 
    }


    public static void main(String[] args){
        int arr[] = new int[5] ; 
        changearr(arr,0,1) ;
        for(int i = 0 ; i<5 ; i++){
            System.out.print(arr[i]+" ") ; 
        }
    }
 }