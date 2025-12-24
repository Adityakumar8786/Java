class mergesort{
    public static class node {
        int data ; 
        node next ; 
        public node(int data){
            this.data = data ; 
            this.next = null ; 
        }
    }

    public static class linkedlist {
        node head = null ; 
        node tail = null ; 
        
   public node mid(node head){
    node slow = head ; 
    node fast = head.next ; 

    while( fast != null && fast.next!= null){
slow = slow.next ; 
fast = fast.next.next ; 
    }
    return slow ; 
   }     


   public node mergesort(node head){
    if(head == null || head.next==null){ 
        return head; 
    }

    node mid = mid(head) ; 

    node righthalf = mid.next ; 
    mid.next = null ; 
    
   node newleft = mergesort(head) ; 
   node newright = mergesort(righthalf) ; 

    return merge(newleft,newright) ; 
   }

   public node merge(node head1 , node head2){
    node mergedll = new node(-1) ; 
    node temp = mergedll ; 

    while(head1 != null && head2 != null){
        if(head1.data < head2.data){
temp.next = head1; 
head1 = head1.next ; 
            temp = temp.next ; 

        }else{
            temp.next = head2 ; 
            head2 = head2.next ; 
            temp = temp.next ; 
        }
    }

    while(head1 != null){
        temp.next = head1; 
head1 = head1.next ; 
            temp = temp.next ; 

    }

   while(head2 != null){
    temp.next =  head2 ; 
    head2 = head2.next ; 
    temp = temp.next ; 
   } 


   return mergedll.next ; 
   }


   void addFirst(int n){
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
            ll.addFirst(1);
            ll.addFirst(2);
            ll.addFirst(3);
            ll.addFirst(4);
            ll.addFirst(5);
ll.print();
ll.head = ll.mergesort(ll.head);
ll.print();

        }
}