 import java.util.ArrayList ; 

class witharrlist{
    public static class Stack {
static ArrayList<Integer> list = new ArrayList() ; 

public static boolean isempty(){
    if(list.size() == 0){
        return true ; 
    }
    return false ; 
}
public static void push(int n ){
list.add(n) ; 
}

public static int pop(){
    int top = list.get(list.size()-1) ; 
    list.remove(list.size()-1) ; 
    return top ; 
}

public static void peek(){
    int top = list.get(list.size()-1) ; 
System.out.println(top) ; 
}

@Override
        public String toString() {
            return list.toString();
        }
    }

    public static void main(String[] args){
        Stack s = new Stack () ; 
        s.push(1);
        s.push(2) ; 
        s.push(3) ; 

        System.out.println(s); 

        while(!s.isempty()){
            s.peek() ; 
            s.pop() ;
        }
    }
    
}