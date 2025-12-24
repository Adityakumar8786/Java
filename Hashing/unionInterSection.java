import java.util.HashSet ; 
import java.util.Arrays; 


class unionInterSection {


    public static int[] intersection(int[] nums1, int[] nums2) {

HashSet<Integer> hs = new HashSet<>() ; 

int[]arr = new int[Math.min(nums1.length,nums2.length)]; 
 int idx = 0 ; 

 for(int i = 0 ; i<nums1.length ; i++){
    hs.add(nums1[i]) ; 
 }

 for(int i=0 ; i < nums2.length ; i++){

if(hs.contains(nums2[i])){
arr[idx++] = nums2[i] ; 
hs.remove(nums2[i]) ; 
}

 }

 return Arrays.copyOf(arr,idx) ; 
 }


 public static void union(int nums1[] , int nums2[]){
    
HashSet<Integer> hs  = new HashSet<>() ; 

for(int i = 0 ; i< nums1.length ; i++){
    hs.add(nums1[i]) ; 
}


for(int i = 0 ; i< nums2.length ; i++){
    hs.add(nums2[i]) ; 
}
 
System.out.print(hs) ; 
 }
 public static void main(String[] args){

    int nums1[]= {1,2,2,3} ;
    int nums2[] = {2,3,2} ; 

    int arr1[] = intersection(nums1,nums2) ;

    for(int i = 0 ; i < arr1.length ; i++){
        System.out.print(arr1[i] +" ") ; 
    }

    System.out.println();
    
    union(nums1, nums2);

 }
}
