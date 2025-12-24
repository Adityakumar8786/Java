class LinkedList {
    public static class node{
        int data ; 
        node next; 
        public node(int data){
            this.data = data ; 
            this.next = null ;
        }
    }

public static class Stack{
    public static node head ; 
    public static node tail ; 

    void push(int n){
        node temp = new node(n) ; 
        if(head == null){
            head = tail = temp ; 
            return ; 
        }
        temp.next = head ;
        head = temp ; 
    }


void pop (){
    if(head== null) return ; 
    head = head.next ; 
}

void peek (){
    if(head== null) return ; 
   System.out.println(head.data) ;  
}
    void print(){
        node temp = head ; 
       
        while(temp != null){
            System.out.print(temp.data+"->") ; 
            temp = temp.next ;
        }
        System.out.println("null") ; 
    }

    }

public static void main(String[] args){
    Stack s = new Stack() ; 
    s.push(3) ; 
s.print() ; 
s.peek() ; 
s.pop();
s.peek() ; 
s.print() ; 

}
}