import java.util.LinkedList ; 
import java.util.Queue ; 
class interleavequeue{
    public static void interleavequeue(Queue<Integer> q){
Queue<Integer> q1 = new LinkedList<>() ; 
int sizee = q.size();
for(int i = 0 ; i < sizee/2 ; i++ ){
    q1.add(q.remove()) ; 
}

while (!q1.isEmpty()) {
    q.add(q1.remove());     
        if (!q.isEmpty()) {     
        q.add(q.remove());  
    }
}


while(!q.isEmpty()){
        System.out.print(q.remove()+" ") ;
}
    }
    public static void main(String[] args){

Queue<Integer> q = new LinkedList<>() ; 

for(int i=1 ; i < 11 ; i++){
q.add(i) ; 
}

interleavequeue(q) ; 
    }
}