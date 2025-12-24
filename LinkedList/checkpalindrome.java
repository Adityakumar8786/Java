class checkpalindrome {

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
 node midnode(node head){
node slow = head ; 
node fast = head ; 

while(fast != null && fast.next!=null){
    slow = slow.next ; 
    fast = fast.next.next ; 
}
return slow ; 
    }

boolean check_palindrome(){
    if(head==null || head.next == null){
        return true ; 
    }

    node mid = midnode(head) ; 
    node reversedmid = reverse(mid) ; 

while(reversedmid!= null){
    if(head.data != reversedmid.data){
        return false ; 
    }
    head = head.next ; 
    reversedmid = reversedmid.next ; 
}
return true ; 
}


node reverse(node head){
    node next ; 
    node current = head ; 
    tail = current ; 
    node previous = null ; 

    while(current != null){
next = current.next ; 
current.next = previous ; 
previous = current ; 
current = next ; 
    }
return previous ; 
}




void insertatend(int n){
node temp = new node(n) ;
    if(head==null){
        head = temp ; 
tail = temp ; 

    }else{
        tail.next = temp ; 
tail = temp ; 

    }
    size++ ; 
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
linkedlist ll = new linkedlist(); 
ll.insertatend(1);
ll.insertatend(5);
ll.insertatend(5);
ll.insertatend(1);
ll.insertatend(1);
System.out.println(ll.check_palindrome()) ; 
}
}