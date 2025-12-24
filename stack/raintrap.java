import java.util.Stack ; 
class raintrap {
    public static void raintrap(int[] height){
Stack<Integer> s = new Stack<>() ;
int trapwater = 0 ; 

for(int i = 0 ; i <height.length ; i++){
    while(!s.isEmpty() && height[i] > height[s.peek()]){
        int top = s.pop() ; 

if(s.isEmpty()) break ; 
        int distance = i-s.peek()-1 ; 
        int minheight = Math.min(height[s.peek()] , height[i]) - height[top] ; 

        trapwater += distance*minheight ; 
    }
    s.push(i) ; 
}
System.out.println(trapwater);
    }
    public static void main(String[] args){
        int height[] = {4,2,0,6,3,2,5} ;
        raintrap(height) ; 
    }
}