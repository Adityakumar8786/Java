import java.util.Stack ; 
class Queue_using_two_stack{

    Stack<Integer> s1 = new Stack<Integer>() ; 
    Stack<Integer> s2 = new Stack<Integer>() ; 



    public void add(int data){
while(!s1.isEmpty()){
    s2.push(s1.pop()) ; 
}

    s1.push(data) ;
    while(!s2.isEmpty()){
        s1.push(s2.pop());
    } 

    }



    public void remove(){
        if(s1.isEmpty()){
System.out.println("Queue is empty");
        }else{
             s1.pop();
        }
    }


public int peek(){
    if(s1.isEmpty()){
        return -1 ;
    }else{
        return s1.peek() ; 
    }
}

public boolean isEmpty(){
    return s1.isEmpty() ; 
}

    public static void main(String[] args){
Queue_using_two_stack q = new Queue_using_two_stack() ; 

q.add(1);
q.add(2);
q.add(3);

while(!q.isEmpty()){
System.out.println(q.peek()) ; 
q.remove() ; 
}

    }
}

// push O(n) 
// pop O(1) ; 