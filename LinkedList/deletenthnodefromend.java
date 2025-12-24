class deletenthnodefromend{
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


int size(){
    int count = 0 ; 
    node temp = head ; 
    while(temp != null){
       temp = temp.next ; 
        count ++ ; 
    }
    return count ; 
}
        void find_delete_nth_node_from_end(int idx){
            node temp = head ; 
for(int i = 0 ; i <(size()-idx+1)-1; i++){
temp = temp.next ; 
}
temp.next = temp.next.next ; 
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

    linkedlist ll = new linkedlist() ; 

    ll.
}