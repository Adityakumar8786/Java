import java.util.Collections;
import java.util.Arrays;
public class ChocolaProblem {
 
    public static void main(String args[]){

        Integer costVertical[] ={2,1,3,1,4} ;  
        Integer costHorizontal[] ={4,1,2} ;  

        Arrays.sort(costVertical , Collections.reverseOrder()) ; 
        Arrays.sort(costHorizontal , Collections.reverseOrder()) ; 

        int horizontalPices = 1 ; 
        int verticalPices = 1 ; 


        int h = 0 ; 
        int v = 0 ; 
        int totalCost = 0 ; 

while (h < costHorizontal.length && v <costVertical.length ){

    if(costHorizontal[h] >= costVertical[v]){
      totalCost += costHorizontal[h]*verticalPices ; 
        h++ ; 
        horizontalPices ++ ; 
    }else{ 
        totalCost += costVertical[v]*horizontalPices ; 
        v++ ; 
        verticalPices ++ ;         
    }

}

while(h < costHorizontal.length){
    totalCost += costHorizontal[h]*verticalPices ; 
        h++ ; 
        horizontalPices ++ ; 
}


while(v < costVertical.length){
totalCost += costVertical[h]*horizontalPices ; 
        v++ ; 
        verticalPices ++ ;     
}


System.out.println(totalCost);
    }

}
