public class subarray
{

static int maxsum = Integer.MIN_VALUE;
static int minsum = Integer.MAX_VALUE;
    public static void subarray
    (int arr[]){
        for(int i = 0 ; i<arr.length ; i++){
            for(int j = i; j < arr.length ; j++){
                int sum = 0 ; 
for(int k = i ; k <=j ; k++){
    System.out.print(arr[k]+" ");
    sum += arr[k] ; 
}

            System.out.print("sum is "+sum);
            System.out.println();
if(minsum>sum){
    minsum = sum ;
}


if(maxsum<sum){
    maxsum = sum ;
}

            }
            System.out.println();
        }
            System.out.println("The minimum sum is "+minsum);
            System.out.println("The maximum sum is "+maxsum);

    }

    public static void main(String [] args){

int[] arr ={1,2,3,4,5};
subarray
(arr);
    }
    }