import java.util.Arrays; 
import java.util.Comparator; 
import java.util.ArrayList; 
public class DisplayMaxlengthChain {
    public static void main(String args[]){
 int pairs[][] = {{5,24},{39,60},{5,28},{27,40},{50,90}} ; 
 int [][]sortedpair = new int[pairs.length][3]; 

ArrayList<Integer> ans = new ArrayList<>() ; 

 for(int i = 0 ; i < pairs.length ; i++){
sortedpair[i][0] = i ; 
sortedpair[i][1] = pairs[i][0] ; 
sortedpair[i][2] = pairs[i][1] ; 

 }

 Arrays.sort(sortedpair,Comparator.comparingDouble(o->o[2])) ; 

 int chainlength = 1 ; 
ans.add(sortedpair[0][0]); 

int endchain = sortedpair[0][2] ; 


for(int i = 1 ; i < sortedpair.length ; i++){

while(sortedpair[i][1] > endchain){
endchain = sortedpair[i][2] ; 
chainlength ++ ; 
ans.add(sortedpair[i][0]) ;
}
}

System.out.println(chainlength) ; 


for(int i = 0 ; i < ans.size() ; i++){
System.out.println(ans.get(i)) ; 
}


    }
}
