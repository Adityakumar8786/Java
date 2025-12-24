import java.util.* ; 

public class IndianCoin {
    public static void main(String args[]){
        ArrayList<Integer>ans = new ArrayList<>() ;
        int denomination[] = {1,2,5,10,20,50,100} ; 
        int value = 145 ; 

        for(int i= denomination.length-1; i >=0 ; i-- ){
            while(denomination[i] <= value){
value -= denomination[i] ; 
ans.add(denomination[i]) ; 
        }
        }

        for(int i = 0 ; i< ans.size() ; i++){

            System.out.print(ans.get(i)+" ");
        }
    }
}
