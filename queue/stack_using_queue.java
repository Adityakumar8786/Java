import java.util.LinkedList ;
import java.util.Queue; 

class stack_using_queue{
Queue<Integer> q1 = new LinkedList<>() ; 
Queue<Integer> q2 = new LinkedList<>() ; 

public void push(int data){
while(!q1.isEmpty()){
    q2.add(q1.remove()) ; 
}

q1.add(data) ; 

while(!q2.isEmpty()){
    q1.add(q2.remove()) ; 
}
}


public void pop(){
    if(q1.isEmpty()){
        System.out.println("Stack is allready empty") ; 
    }else{
        q1.remove() ; 
    }
}

public int peek(){
    return q1.peek() ; 
}
public boolean isEmpty(){
    return q1.isEmpty() ; 
}




public static void main(String[] args){
    stack_using_queue s = new stack_using_queue() ; 
    s.push(1); 
    s.push(2); 
    s.push(3); 

    while(!s.isEmpty()){
System.out.println(s.peek()) ; 
s.pop() ; 
}


}
}