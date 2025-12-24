class Byarray{
    public static class Queue{
        static int arr[] ; 
        static int size ; 
        static int rear ; 
    Queue(int n){
        arr = new int[n] ; 
        size = n ; 
        rear = -1 ; 
    }

    public static boolean isEmpty(){
        return rear==-1 ; 
    }

    public static void add(int data){
        if(rear == size-1){
            System.out.print("The Queue is already full") ; 
            return ; 
        }
rear++ ; 
arr[rear] = data ; 
    }

    public static void remove(){
        if(isEmpty()){
            System.out.print("The Queue is already Already empty") ; 
            return ; 
        }
        for(int i = 1; i<=rear ; i++){
arr[i-1] = arr[i] ; 
        }
        rear-- ; 
    }

    public static void peek(){
        if(isEmpty()){
            System.out.print("The Queue is empty") ; 
            return ; 
        }
        System.out.println(arr[0]) ; 
    }
    }
    public static void main(String[] args){
        Queue q = new Queue(10) ; 
        q.add(1) ;
        q.add(2);
        q.add(3) ;
        while(!q.isEmpty()){
            q.peek(); 
            q.remove() ; 
        }
    }
}