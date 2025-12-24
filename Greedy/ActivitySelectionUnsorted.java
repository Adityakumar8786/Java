import java.util.ArrayList ;
import java.util.Arrays;
import java.util.Comparator;
public class ActivitySelectionUnsorted {
    public static void main(){
        int start[] = {1,3,0,5,8,5} ; 
        int end[] = {2,4,6,7,9,9} ; 

    int activities[][] = new int[start.length][3]; 

    for(int i = 0 ; i < start.length ; i ++){

        activities[i][0] = i ; 
        activities[i][1] = start[i] ; 
        activities[i][2] = end[i] ; 
    }

    Arrays.sort(activities,Comparator.comparingDouble(o -> o[2]));

    int maxact = 0 ; 

ArrayList<Integer> ans = new ArrayList<>() ; 
ans.add(activities[0][0]) ;
maxact = 1 ; 

int lastend = activities[0][2] ; 

for(int i = 1 ; i < start.length ; i++){
while(activities[i][1] > lastend){
maxact ++ ; 
lastend = activities[i][2] ; 
ans.add(activities[i][0]) ;
}
}


System.out.println(maxact) ; 

for(int i = 0 ; i < ans.size() ; i++){
System.out.println("A"+ans.get(i)) ;
}


    }
}
