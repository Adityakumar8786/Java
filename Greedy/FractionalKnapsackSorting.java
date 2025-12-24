import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsackSorting {

    public static void main(String args[]){

 
        int weight[] = {10,20,30} ; 
        int values[] = {60,100,120} ; 

        int capacity = 50 ; 
        int totalvalue = 0 ; 
        int ratio[] = new int[weight.length] ; 
        int ans[][] = new int[weight.length][weight.length] ; 


        int sorted[][] = new int[weight.length][weight.length] ; 


        for(int i = 0 ; i < weight.length ; i++){
            sorted[i][0] = i ; 
            sorted[i][1] = weight[i] ; 
            sorted[i][2] = values[i] ; 
        }

Arrays.sort(sorted,Comparator.comparingDouble(o -> o[1]));

        int ansidx = 0 ;
        
        for(int i = 0 ; i < weight.length ; i++){
ratio[i] = sorted[i][2]/sorted[i][1] ; 
        }


        for(int i = 0 ; i < ratio.length ; i++){

if(capacity>sorted[i][1]){

    totalvalue += sorted[i][2] ; 
    capacity -= sorted[i][1] ; 
    ans[ansidx][0] =  i ;
    ans[ansidx][1] =  sorted[i][1] ;
}

else{

totalvalue += ratio[i] * capacity ; 
ans[ansidx][0] =  i ;
    ans[ansidx][1] =  capacity ;
    capacity = 0 ; 
}
ansidx ++ ; 
        }

System.out.println(totalvalue) ; 



for (int i = 0 ; i < ansidx ; i++){

System.out.println("indices " + ans[i][0] + " weights " + ans[i][1]) ; 
}


    }
}