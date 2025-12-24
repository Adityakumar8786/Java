class cycle{
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
        int size = 0 ;

         boolean detect_cycle(){
            node slow = head ; 
            node fast = head ; 

            while(fast!=null && fast.next != null){
                slow = slow.next ; 
                fast = fast.next.next ; 

                if(slow == fast){
                return true ; 
            }

            }
            
            return false ; 
        }

        void remove_cycle(){
            node slow = head ; 
            node fast = head ; 
            boolean cycle = false ; 
            while(fast!=null && fast.next != null){
                slow = slow.next ; 
                fast = fast.next.next ; 

                if(slow == fast){
               cycle = true ; 
                break ; 
            }

            }

            if(!cycle){
                return ; 
            }


            slow = head ; 
            node previous = null ;
            while(slow != fast){
                previous = fast ; 
                slow = slow.next ; 
                fast = fast.next ; 
            }

            previous.next = null ; 
        }
}
public static void main(String[] args){
 linkedlist ll = new linkedlist() ; 
 ll.head = new node(1) ; 
 node b = new node(2) ; 
 node c = new node(3) ; 
 node d = new node(4) ; 
 node e = new node(5) ; 
 node f = new node(6) ; 
 node g = new node(7) ; 

        ll.head.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = b; 

System.out.println(ll.detect_cycle()) ; 
ll.remove_cycle() ;
System.out.println(ll.detect_cycle()) ; 
}
}