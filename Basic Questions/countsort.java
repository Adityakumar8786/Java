public class countsort{

    public static void countsort(int arr[]){
        int max = Integer.MIN_VALUE ;
for(int i=0 ; i < arr.length ; i++){
max = math.max(max,arr[i]);
}


int [] count = new int[max+1];
for(int i=0 ; i < arr.length ; i++){
count[arr[i]]++ ;
}


int j = 0 ; 
for(int i=0 ; i < count.length  ; i++){
while(count[i]>0){
    arr[j]=i;
    j++;
    count[i]--
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