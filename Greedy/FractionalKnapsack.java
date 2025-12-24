public class FractionalKnapsack {

    public static void main(String args[]){

 
        int weight[] = {10,20,30} ; 
        int values[] = {60,100,120} ; 

        int capacity = 50 ; 
        int totalvalue = 0 ; 
        int ratio[] = new int[weight.length] ; 
        int ans[][] = new int[weight.length][weight.length] ; 
        int ansidx = 0 ;
        
        for(int i = 0 ; i < weight.length ; i++){
ratio[i] = values[i]/weight[i] ; 
        }


        for(int i = 0 ; i < ratio.length ; i++){

if(capacity>weight[i]){

    totalvalue += values[i] ; 
    capacity -= weight[i] ; 
    ans[ansidx][0] =  i ;
    ans[ansidx][1] =  weight[i] ;
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