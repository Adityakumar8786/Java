// import java.util.Comparator;
import java.util.PriorityQueue ;

public class nearestCar {


static class car implements Comparable <car>{
    int x ; 
    int y ; 
    int distancesq ; 

    public car(int x , int y , int distancesq){
this.x = x ; 
this.y = y ; 
this.distancesq = distancesq ; 
    }

    @Override
    public int compareTo(car c2){
return this.distancesq - c2.distancesq ; 
    }
}



    public static void main(String[] args){

        int cordinates[][] = {{3,3},{5,-1},{-2,4}} ; 

        int k = 2 ; 


        PriorityQueue<car> pq = new PriorityQueue<>() ; 

        for(int i = 0 ; i<cordinates.length ; i++){
int distance = cordinates[i][0]*cordinates[i][0] + cordinates[i][1]*cordinates[i][1] ;
pq.add(new car(cordinates[i][0] , cordinates[i][1] , distance)) ; 
        }


        for(int i = 0 ; i< k ; i++ ){
            System.out.println(pq.peek().x+" "+pq.peek().y); 
            pq.remove(); 
        }
    }
}