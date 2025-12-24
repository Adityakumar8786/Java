class circularqueue{
    public static class Queue{
        static int arr[] ; 
        static int size ;
        static int rear = -1 ; 
        static int front = -1 ; 

 Queue(int n){
arr= new int[n] ; 
size = n ; 
 }
 public static boolean isEmpty(){
    return rear ==-1 ; 
}

 public static boolean isfull(){
    return (rear+1)%size==front ; 
}



public static void add(int data){
    if(isfull()){
        System.out.println("The Queue is already full" ) ; 
        return ; 
    }

    if(front ==-1){
        front = 0 ; 
    }

    rear = (rear+1)%size ; 
arr[rear] = data ; 
}



public static void remove(){
    if(isEmpty()){
        System.out.println("The Queue is Empty") ;
        return ;
    }

    if(front == rear){
        front = rear = -1 ; 
    }

    front = (front+1)%size ;
}

public static void peek(){
    if(isEmpty()){
System.out.println("The Queue is Empty");
return ; 
    }
    System.out.println(arr[front]) ; 
}



    }

    public static void main(String[] args){
        Queue q = new Queue(3) ; 
        q.add(1);
        q.add(2);
        q.add(3);
        q.remove() ;
        q.add(4) ; 
        while(!q.isEmpty()){
            q.peek() ; 
            q.remove() ; 
        }
    }
}