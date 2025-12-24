class linkedlist{
    public static class node{
        int data ; 
        node next ; 
        node(int data){
            this.data = data ; 
            this.next = null ;
        }
    }

    public static class Queue{
        public static node head ; 
        public static node tail ; 


public static boolean isEmpty(){
    return head == null ; 
}
        public static void add(int n){
            node temp = new node(n) ; 
            if(head == null) {
                 head = tail = temp ; 
                return ; 
            }
            tail.next = temp ; 
           tail = temp ; 
        }

        public static void remove(){
            if(head == null){
                System.out.println("Queue is Empty") ;
                return ; 
            }
            if(head == tail){
                head = tail = null ; 
                return ; 
            }
            head = head.next ; 
        }

        public static void peek(){
            if(head == null){
                System.out.println("Queue is Empty") ;
                return ; 
            }
            System.out.println(head.data) ; 
        }
    }
    public static void main(String[] args){
        Queue q = new Queue() ; 
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        q.remove() ; 
        q.remove() ; 

        while(!q.isEmpty()){
            q.peek();
            q.remove() ; 
        }
    }
}