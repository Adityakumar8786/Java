class implementation {
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


void insertatend(int n){
    // node temp = new node(n) ;
    // tail.next = temp ; 
    // tail = temp ; 

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

void addatfirst(int n){
node temp = new node(n) ; 
if(head == null){
    head = temp ; 
    tail = temp ; 
}else{
temp.next = head ; 
head = temp ;  
size ++ ; 
}
}


 void insert_given_idx(int idx,int n){

    if(idx == size){
        insertatend(n) ; 
    }else if(idx == 0){
        addatfirst(n) ; 
    }
    
    else{
    node newnode = new node(n) ; 
    node temp = head ; 

    for(int i = 0 ; i < idx-1 ; i++){
        temp = temp.next ; 
    }

newnode.next = temp.next ; 
temp.next = newnode ;
size++ ; 
}
 }


 void get_element_by_idx(int idx){
    node temp = head ;
for(int i = 0 ; i<idx ; i++){
    temp = temp.next ; 
} 

System.out.println(temp.data) ; 
     }


// int size(){
//     int count = 0 ; 
//     node temp = head ; 
//     while(temp != null){
//        temp = temp.next ; 
//         count ++ ; 
//     }
//     return count ; 
// }





void delete(int idx){
    node temp = head ; 
    if(idx == 0 ){
head = head.next ; 
size -- ; 
return ; 
    }
    for(int i = 0 ; i<idx-1 ; i ++){
temp = temp.next ; 
    }

    temp.next = temp.next.next ; 

    if(temp.next == null ){
        tail = temp ; 
    }
    size -- ; 

}


int recursive_search(node head,int target){
if( head== null) {
    return -1 ; 
}

if (head.data == target) {
        return 0; 
    }

int result = recursive_search(head.next,target);

if(result == -1){
    return -1 ; 
}else{
    return result+1 ; 
}
}

void reverse(){
    node previous = null ; 
    node current = head ; 
    tail = current ; 
     node next ; 
     while(current != null){
        next = current.next ;
        current.next = previous ; 
        previous = current ; 
        current = current.next ; 
     }
     head = previous ; 
     
}



void find_delete_nth_node_from_end(int idx){
            
            if(idx == size ){
                head = head.next ; 
                size -- ; 
                return ; 
            }

            node temp = head ; 
for(int i = 0 ; i < (size-idx-1) -1; i++){
temp = temp.next ; 
}
temp.next = temp.next.next ; 

if (temp.next == null) {  
        tail = temp;  
    }
    size -- ; 
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
        linkedlist ll= new linkedlist() ;
ll.insertatend(5) ; 
 ll.print(); 
 ll.addatfirst(10) ; 
 ll.print(); 
ll.insert_given_idx(2,88) ; 
 ll.print(); 
System.out.println(ll.tail.data); 
System.out.println(ll.head.data); 
ll.get_element_by_idx(2) ; 
ll.delete(2) ; 
ll.insert_given_idx(2,45) ; 
ll.get_element_by_idx(2) ; 
System.out.println(ll.recursive_search(ll.head,45)) ; 
ll.print();
ll.reverse() ;
ll.print() ; 
ll.insert_given_idx(2,45) ; 
ll.insert_given_idx(3,33) ; 
ll.print() ; 
ll.find_delete_nth_node_from_end(2);
ll.print() ; 
System.out.println(ll.recursive_search(ll.head,10));
ll.reverse() ;
ll.print();
    }
}