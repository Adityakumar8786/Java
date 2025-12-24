public class stock {
    public static void stock(int arr[]){
        int buyprice = Integer.MAX_VALUE ; 
        int maxprofit = 0 ; 
        for(int i = 0 ; i < arr.length; i++){
           
            if(buyprice<arr[i]){
maxprofit = Math.max(maxprofit,arr[i]);
            }else{
                buyprice=arr[i];
            }
        }
        System.out.print(maxprofit);
    }
    public static void main(String [] args){
        int [] arr = {7,1,5,3,6,4};
stock(arr);

    }
}