import java.util.PriorityQueue ; 

public class weakestSoldier {

  static class Soldier implements Comparable <Soldier>{
    int count ; 
    int idx ; 

    public Soldier(int count , int idx ){
this.count = count ; 
this.idx  = idx ; 
    }

@Override
public int compareTo(Soldier s2){
    if(this.count == s2.count){
        return this.idx - s2.idx ; 
    }else{
        return this.count - s2.count ; 
    }
}
  }  


  public static void main(String[] args){

    int Soldiers[][] ={{1,0,0,0},
{1,1,1,1} , {1,0,0,0} , {1,0,0,0}} ; 

int k = 2 ; 


PriorityQueue<Soldier> pq = new PriorityQueue<>() ;
for(int i = 0 ; i < Soldiers.length; i++){

        int count = 0 ; 

    for(int j = 0 ; j < Soldiers[0].length ; j++){

        if(Soldiers[i][j] == 1 ){
            count += 1 ; 
        }else{
            count += 0 ; 
        }
    }

pq.add(new Soldier(count, i)) ;
}


for(int i = 0 ; i < k ; i++){
System.out.print("R"+pq.remove().idx+" ") ; 
}
  }
}