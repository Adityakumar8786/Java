import java.util.ArrayList; 
import java.util.LinkedList ; 
import java.util.Queue ; 
public class BsttoBalancedBst {

    static class Node{
        int data ; 
        Node leftNode ; 
        Node rightNode ; 
        public Node(int data){
this.data = data ; 
this.leftNode = null;
this.rightNode = null ;
        }
    }



    public static Node buildBst(Node root , int val){

        if(root == null){
            Node newNode = new Node(val) ; 
            return newNode ; 
        }

        if(root.data > val){
            root.leftNode = buildBst(root.leftNode, val) ; 
        }
        else{
            root.rightNode = buildBst(root.rightNode, val) ; 
        }

        return root ; 
    }



    public static void inOrder(Node root , ArrayList<Integer> sortedArr){

        if(root == null){
            return ; 
        }

        inOrder(root.leftNode, sortedArr);
        sortedArr.add(root.data) ; 
        inOrder(root.rightNode, sortedArr);
    }


public static Node arrtobst(ArrayList<Integer> arr , int low , int high){

    if(low > high){
        return null ; 
    }

    int mid = (low + high) /2 ; 
    Node root = new Node(arr.get(mid)) ; 

root.leftNode = arrtobst(arr, low, mid-1) ; 
root.rightNode = arrtobst(arr, mid+1, high) ; 
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
break;
        }else{
q.add(null) ; 
        }
    }

    else{
    
        System.out.print(currNode.data+" ") ; 

        if(currNode.leftNode != null ){
q.add(currNode.leftNode); 
        }

        if(currNode.rightNode != null){
q.add(currNode.rightNode); 
        }
    }
}

}
public static void main(String[] args){


    Node root = new Node(30) ; 
    root.leftNode = new Node (20) ; 
    root.leftNode.leftNode = new Node(10) ; 


    levelOrder(root);
    ArrayList<Integer> arr = new ArrayList<>() ; 
inOrder(root, arr); 

root = arrtobst(arr, 0, arr.size()-1) ; 

levelOrder(root);
}
}