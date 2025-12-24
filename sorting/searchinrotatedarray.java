class searchinrotatedarray{
    public static int search(int [] arr , int si , int ei , int target){

        //base case 
if(si > ei){
    return -1;
}



//kaam
int mid = si+(ei-si) /2 ; 

if(arr[mid] == target){
    return mid ; 
}





if (arr[si] <= arr[mid]){   //then line1


if(target <= arr[mid] && target>= arr[si]){
    return search(arr,si,mid-1,target) ; // search in left part 
}else{
    return search(arr,mid+1,ei,target) ; //else search in right part 
}


} 




if(arr[ei]>=arr[mid]){  //condition for line 2 
    if(target >= arr[mid] && arr[ei]>target){
        return search(arr,mid+1,ei,target) ;  //for right part 
    }else{
        return search(arr,si,mid-1,target) ; // for left part 
    }
}


return -1 ;
    }

public static void main(String[] args){
    int arr[] = {4,5,6,7,0,1,2} ; 
    System.out.println(search(arr,0,arr.length-1,0));
}
}