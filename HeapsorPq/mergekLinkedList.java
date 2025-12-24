import java.util.PriorityQueue ; 
public class mergekLinkedList {

    static class linkedList implements Comparable <linkedList>{
int val ; 
linkedList next ; 

public linkedList(int val){
this.val = val ; 
this.next = null ; 
}

@Override 

public int compareTo(linkedList l2){
return this.val - l2.val ;
}
    }


    public static linkedList mergeKlinkedlist(linkedList[] list){

if(list == null || list.length == 0){
    return null ; 
}

PriorityQueue<linkedList> pq = new PriorityQueue<>() ; 

for(int i = 0 ; i < list.length ; i++){

    if(list[i] != null){
    pq.add(list[i]) ; 
    }
}

linkedList dummy = new linkedList(-1) ; 
linkedList current = dummy ; 

while(!pq.isEmpty()){

    linkedList minimum = pq.remove() ;
    current.next = minimum ; 
    current = current.next ; 


    if(minimum.next != null){
        pq.add(minimum.next) ; 
    }
}

return dummy.next ; 
    }


    public static linkedList createLinkedList(int arr[]){

if(arr.length == 0 || arr == null){
return null ;
}

linkedList dummy = new linkedList(-1) ; 
linkedList current = dummy ; 

for(int i = 0 ; i < arr.length ; i++){
    current.next = new linkedList(arr[i]) ; 
    current = current.next ; 
}

return dummy.next ;
    }

    public static void main(String[] args){

        linkedList list[] = new linkedList[3] ; 

        list[0] =  createLinkedList(new int[]{1,4,5}) ;
        list[1] =  createLinkedList(new int[]{1,3,4}) ;
        list[2] =  createLinkedList(new int[]{2,6}) ;

        linkedList result = mergeKlinkedlist(list) ; 


        while(result != null){
            System.out.print(result.val+"->") ; 
            result = result.next ;
        }
    }
}