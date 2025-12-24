class zigzag{
     public static class node {
        int data ; 
        node next ; 
        public node(int data){
            this.data = data ; 
            this.next = null ; 
        }
    }
public static class linkedlist {
    // find mid 
        node head = null ; 
        node tail = null ; 

        public void zigzag(){

            
    node slow = head ; 
    node fast = head.next ; 

    while( fast != null && fast.next!= null){
slow = slow.next ; 
fast = fast.next.next ; 

   }     

   node mid = slow ; 

// reverse 2nd half 

node current = mid.next ; 
node next ; 
node previous = null ; 
mid.next = null ; 
while(current != null){
   next = current.next ; 
   current.next = previous ; 
   previous = current ; 
   current = next ; 
}

node left = head ; 
node right = previous ; 
node nextL , nextR ; 

while(left != null && right !=null){
nextL = left.next ; 
left.next = right ; 

nextR = right.next ; 
right.next = nextL ; 

left = nextL ; 
right = nextR ; 

}
        }


        void addatfirst(int n){
node temp = new node(n) ; 
if(head == null){
    head = temp ; 
    tail = temp ; 
}else{
temp.next = head ; 
head = temp ;  
}
}


void print(){
    node temp = head ; 
    while(temp != null){
System.out.print(temp.data+" ") ; 
temp = temp.next ; 
    }
System.out.println();
}


}
public static void main(String[] args){
linkedlist ll = new linkedlist() ; 
ll.addatfirst(5) ;
ll.addatfirst(4) ; 
ll.addatfirst(3) ; 
ll.addatfirst(2) ; 
ll.addatfirst(1) ; 

ll.print(); 
ll.zigzag() ; 
ll.print(); 

}
}