import java.util.Scanner;

public class StockbuyandsellSingletransaction {

    public static int maxprofit(int arr[]){
int maximum_profit = 0 ; 
int size = arr.length ; 

int minPrice = arr[0] ; 

for(int i = 1 ; i< size ; i++){

if(arr[i] < minPrice){
minPrice = arr[i] ;
}else{
    int current_profit = arr[i]-minPrice ; 
    maximum_profit = Math.max(maximum_profit, current_profit) ;
}
}

        return maximum_profit ;
    }

    public static void main(String[] args){

     int size ; 

Scanner scanner = new Scanner(System.in) ; 

System.out.println("Enter the size") ; 
size = scanner.nextInt();


int arr[] = new int[size] ; 


System.out.println("Enter the stocks Array") ; 

for(int i = 0 ; i<size ; i++ ){
    arr[i] = scanner.nextInt() ; 
}

System.out.println(maxprofit(arr)) ; 

scanner.close(); 

    }
}