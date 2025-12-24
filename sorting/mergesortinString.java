class mergesortinString {
    public static void mergesort(String [] arr , int si , int ei){
        if(si>=ei) return ; 

        int mid = si+(ei-si) / 2 ; 

        mergesort(arr,si,mid);
        mergesort(arr,mid+1,ei);

        merge(arr,si,mid,ei) ;
    }

    public static void merge(String [] arr, int si , int mid , int ei ) {
        int i = si ; 
        int j = mid+1 ; 
        int k = 0 ; 

        String [] str = new String[ei-si+1]; 

        while(i<=mid && j <= ei){
if( compare(arr[i],arr[j]) ){
str[k] = arr[i] ; 
i++ ; 
k++ ;
}else{
    str[k] = arr[j] ; 
j++ ; 
k++ ;
}
        }

        while(i<=mid){
          str[k] = arr[i] ; 
i++ ; 
k++  ;
        }

        while(j<=ei){
          str[k] = arr[j] ; 
j++ ; 
k++;  
        }



for(int x = 0 , y = si ; x < str.length ; x++ , y++){
    arr[y] = str[x] ;
}

    }


public static boolean compare(String str1 , String str2){
    if(str1.compareTo(str2) < 0 ){
        return true ; 
    }else{
        return false ; 
    }
}



public static void main(String [] args){
    String [] str = {"Aditya","sonu","sipun"} ;
    mergesort(str,0,2);
    for(int i = 0 ; i < str.length ; i++){
System.out.print(str[i]+" ") ; 
    }
}
}