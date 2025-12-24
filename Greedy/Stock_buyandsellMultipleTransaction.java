import java.util.Scanner;
public class Stock_buyandsellMultipleTransaction {

public static int maxprofit(int arr[]){
    int maximumprofit = 0 ; 
int n = arr.length ;

    for(int i = 1 ; i < n ; i++){
        if(arr[i] > arr[i-1]){
            maximumprofit += arr[i] - arr[i-1] ; 
        }
    }
    return maximumprofit ; 
}
    public static void main(String[] args) {

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
