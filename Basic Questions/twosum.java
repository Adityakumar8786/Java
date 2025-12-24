class twosum {
public static void twoSum(int arr[]){
    for(int i =0 ; i< arr.length ; i++){
        for(int j = i+1 ; j< arr.length ; j++){
            if(arr[i] + arr[j] == 9){
System.out.println(i+","+j);

            }
        }
    }
}

public static void main(String []args){
    int []arr = {1,8,2,3,4,5,7};
twoSum(arr);
}
}