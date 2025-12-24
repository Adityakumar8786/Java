import java.util.Stack;
class reversestack{

    public static void pushatback(Stack<Integer> s,int data){
       if (s.isEmpty()){
            s.push(data) ; 
            return ; 
        }

        int top = s.pop() ; 
        pushatback(s,data) ; 
s.push(top) ;
    }

    public static void reverse(Stack<Integer> s){
if(s.isEmpty()) return ; 
int top = s.pop() ;
reverse(s) ; 
pushatback(s,top) ; 
    }

    public static void main(String[] args){
        Stack<Integer> s = new Stack<>() ; 
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        reverse(s) ; 

        while(!s.isEmpty()){
            System.out.println(s.peek()) ; 
            s.pop() ; 
        }
    }
}