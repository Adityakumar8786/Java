class inversioncount{
    public static int mergesort(int arr[] , int si , int ei){
        if (si>=ei) return 0 ; 

        int mid = si+(ei-si) / 2 ;

int noof_inversion = 0 ; 

        int leftcount = mergesort(arr,si,mid) ; 
        int rightcount = mergesort(arr,mid+1,ei) ; 
        int mergecount = merge(arr,si,mid,ei)  ; 

        noof_inversion = leftcount + rightcount + mergecount ; 
        return noof_inversion ; 
    }



public static int merge(int arr[] , int si , int mid , int ei){

int i = si ; 
int j = mid+1 ; 
int k = 0 ; 
int inversions = 0 ;  


int temp[] = new int[ei-si+1] ; 

while(i<=mid && j<=ei){
    if(arr[i] <= arr[j]){
temp[k++] = arr[i++] ; 
    }else{
temp[k++] = arr[j++] ; 
inversions += (mid-i+1) ;

    }
}

while(i<=mid){
temp[k++] = arr[i++] ; 
}
while(j<=ei){
temp[k++] = arr[j++] ; 
}


System.arraycopy(temp,0,arr,si,temp.length) ; 
return inversions ; 
}


public static void main(String[] args){
    int arr[] = {2,4,1,3,5} ; 
    System.out.println(mergesort(arr,0,arr.length-1));
}
}