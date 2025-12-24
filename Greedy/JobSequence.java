import java.util.Collections;
import java.util.ArrayList;

public class JobSequence {
    
    static class Job {
    int deadline ; 
    int profit ; 
    int idx ;
        
    Job(int s , int p , int i){
        this.deadline = s ; 
        this.profit = p ; 
        this.idx = i ; 
    }

    }


    public static void main(String args[]){
        int jobinfo[][] = {{4,20},{1,10},{1,40},{1,30}} ;

ArrayList<Job>jobs = new ArrayList<>() ; 

for(int i = 0 ; i < jobinfo.length ; i++){
    jobs.add(new Job(jobinfo[i][0],jobinfo[i][1],i));
}

Collections.sort(jobs, (obj1 ,obj2)->obj2.profit-obj1.profit);

ArrayList<Integer>ans = new ArrayList<>() ; 
int time = 0 ; 

for(int i=0 ; i < jobs.size() ; i++){
    Job curr = jobs.get(i) ;

    if(curr.deadline > time){
        ans.add(curr.idx) ;
        time ++ ; 
    }
}


for(int i = 0 ; i < ans.size() ; i++){
System.out.print(ans.get(i)+" ");
}

 }
}
