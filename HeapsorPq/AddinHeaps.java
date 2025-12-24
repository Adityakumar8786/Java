
import java.util.ArrayList ; 
public class AddinHeaps {

    static class Heap{

ArrayList<Integer> arr = new ArrayList<>() ; 

public void add(int data){

    arr.add(data) ; 

    int child = arr.size()- 1 ; // idx of child 

    int parent = (child-1)/2 ; 

    while(child > 0 && arr.get(child) < arr.get(parent) ){ //O(logn)

        int temp = arr.get(child) ; 
        arr.set(child,  arr.get(parent)) ; 
        arr.set(parent , temp) ; 
    }

    child = parent ; 
    parent = (child-1)/2 ; 
}


public int peek(){
    return arr.get(0); 
}


private void heapify(int i){

int left = 2*i + 1 ; 
int right = 2*i +2 ; 
int minidx = i ; 

if(left < arr.size() && arr.get(minidx) > arr.get(left)){
    minidx = left ; 
}


if(right<arr.size() && arr.get(minidx) > arr.get(right)){
    minidx = right ; 
}


if(minidx != i ){
    int temp = arr.get(i) ; 
    arr.set(i,arr.get(minidx)) ; 
    arr.set(minidx,temp) ; 


    heapify(minidx);
}


}

public int remove(){
    int data = arr.get(0) ;

    int temp = arr.get(0) ; 
    arr.set(0,arr.get(arr.size()-1)) ; 
    arr.set(arr.size()-1 , temp) ; 

    arr.remove(arr.size()-1) ; 


    heapify(0) ; 
    return data ;
}


public boolean isEmpty(){
    return arr.size() ==0;
}
    }


    public static void main(String[] args){

        Heap heap = new Heap() ; 

        heap.add(1);
        heap.add(2);
        heap.add(3);
        heap.add(4);
        heap.add(5);


        while(!heap.isEmpty()){
            System.out.println(heap.peek()); 
            heap.remove() ; 
        }
    }
}