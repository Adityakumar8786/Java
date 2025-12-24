import java.util.Queue; 
import java.util.LinkedList ; 
public class SortedArraytoBst {

    static class Node{
        int data ; 
        Node leftNode ; 
        Node rightNode ; 

        public Node(int data){
this.data = data ; 
this.leftNode = null ; 
this.rightNode = null ; 
        }
    }



    public static Node buildBst(Node root , int val){

        if( root == null){
            Node newNode = new Node(val) ; 
            return newNode ; 
        }


        if(root.data > val){
            buildBst(root.leftNode , val) ; 
        }else{
            buildBst(root.rightNode , val) ; 
        }

        return root ; 
    }

public static Node ArraytoBst(int arr[] , int high , int low ){

    if(low > high){
        return null ; 
    }

    int mid = (low + high) / 2 ; 

    Node root = new Node(arr[mid]) ; 

    root.leftNode = ArraytoBst(arr, mid-1, low);
    root.rightNode = ArraytoBst(arr, high, mid+1);

    return root ; 
}


public static void levelOrder(Node root){
    Queue<Node> q = new LinkedList<>() ; 
q.add(root) ; 
q.add(null) ; 

while(!q.isEmpty()){

    Node currNode = q.remove() ; 

    if(currNode == null){
        System.out.println() ; 


        if(q.isEmpty()){
break ; 
        }else{
            q.add(null) ;
        }

    }

    else{

        System.out.print(currNode.data+" ") ; 

        if(currNode.leftNode != null ){
q.add(currNode.leftNode) ; 
        }

        if(currNode.rightNode != null ){
q.add(currNode.rightNode) ; 
        }
    }
}


}
public static void main(String[] args){
    int arr[] = {1,2,3,4,5,6,7,8,9,10} ; 

    Node root = ArraytoBst(arr, arr.length-1 , 0 ) ; 

levelOrder(root);


}
}