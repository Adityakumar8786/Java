import java.util.Stack ; 
class Queue_using_two_stackk{
Stack<Integer>s1 = new Stack<Integer>() ; 
Stack<Integer>s2 = new Stack<Integer>() ; 

public void add(int data){
s1.add(data) ; 
}


public int remove(){
    while(!s1.empty()){
        s2.push(s1.pop());
    }
    int k = s2.pop() ; 

    while(!s2.empty()){
s1.push(s2.pop()) ; 
    }
    return k ; 
}



public boolean isEmpty(){
    return s1.isEmpty() ; 
}

public static void main(String[] args){
    Queue_using_two_stackk q = new Queue_using_two_stackk() ; 
    
    q.add(1);
q.add(2);
q.add(3);

while(!q.isEmpty()){
System.out.println(q.remove()) ; 
}


}
}