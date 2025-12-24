
import java.util.Stack ; 
class nextgreater{
    long startTime = System.nanoTime();
public static void nextgreaterr(int[] numbers , int nextgreater[]){
Stack<Integer> s = new Stack<>() ;

for(int i=numbers.length-1 ; i>=0 ; i--){

while(!s.isEmpty() && numbers[i] > s.peek()){
s.pop() ; 
}
if(s.isEmpty()){
    nextgreater[i] = -1 ; 
}else{
    nextgreater[i] = s.peek() ; 
}

s.push(numbers[i]) ; 
}

for(int i= 0 ;i<nextgreater.length; i++){
    System.out.print(nextgreater[i]+" ") ; 
}

}

    public static void main(String[] args){
int numbers[] = {6,8,0,1,3} ; 
int nextgreater [] = new int[numbers.length] ; 

nextgreaterr(numbers , nextgreater) ; 

    }

}