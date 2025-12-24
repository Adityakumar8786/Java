import java.util.* ;
public class ActivitySelection{

public static void main(String args[]){

    int start[] = {1,3,0,5,8,5} ; 
    int end[] = {2,4,6,7,9,9} ; 
//end time already sorted 

int maxact = 0 ; 

ArrayList<Integer> ans = new ArrayList<>() ;

ans.add(0) ; 

maxact = 1 ; 


int lastend = end[0] ; 
for(int i = 1 ; i < start.length ; i++){
while (start[i]>=lastend){
    ans.add(i) ; 
    lastend = end[i] ; 
    maxact++ ; 
}
}


System.out.println(maxact) ; 

for(int i = 0 ; i < ans.size() ; i++){
System.out.print( "A" +ans.get(i) + ",") ; 
System.out.println() ; 

}

}
}