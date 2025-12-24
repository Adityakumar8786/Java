class doubleLL{
    public static class node{
        int data ; 
        node next ; 
        node previous ; 

        public node(int data){
            this.data = data ; 
            next = null ; 
            previous = null ; 
        }
    }
public static node head ; 
public static node tail ; 
public static int size = 0 ; 

public void addfirst(int n){
    size++ ; 
    node temp = new node(n) ; 
    if(head == null){
        head = tail = temp ; 
        return ; 
    }
    temp.next = head ; 
    head.previous = temp ; 
    head = temp ; 
}

public void addend(int n){
    size ++ ; 
    node temp = new node(n) ; 
    if(head == null){
        head = tail = temp ; 
        return ; 
    }
    tail.next = temp ; 
    temp.previous = tail ; 
    tail = temp ; 
}


public void delete_from_first(){
    head = head.next ; 
}

public void delete_from_end(){
     if (tail == null) return; 
     if (tail == head) {  
        head = tail = null;
        return;
    }
    node temp = tail.previous ; 
    if (temp != null) { 
        temp.next = null;
    }
    tail = temp ; 
}
// If the list has only one node, tail.previous is null.
// Then node temp = tail.previous; makes temp = null.
// You try to set temp.next = null;, but temp is null, causing the NullPointerException.



public void reverse(){
    node previous = null ; 
    node temp = head ; 
    node next ; 
    while(temp != null){
        next = temp.next ; 
        temp.next = previous ; 
        temp.previous = next ; 
        previous = temp ; 
        temp = next ; 
    }
    head = previous ; 
}
public void print(){
    node temp = head ; 
    while(temp != null){
        System.out.print(temp.data+" "); 
        temp = temp.next ; 
    }
    System.out.println(); 
}

    public static void main(String[] args){
doubleLL dl = new doubleLL();
dl.addfirst(5) ; 
dl.addfirst(4) ; 
dl.addend(9) ; 
dl.print() ; 
dl.reverse();
dl.print() ; 
dl.delete_from_first();
dl.print() ; 
dl.delete_from_end(); 
dl.print() ; 

    }
}