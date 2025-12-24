import java.util.Queue; 
import java.util.LinkedList ; 


public class bstintoGreatersumtree {

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

    if(root == null){
        Node newNode = new Node(val) ; 
        return newNode ; 
    }

    if(root.data < val){
        root.rightNode = buildBst(root.rightNode, val) ; 
    }else{
        root.leftNode = buildBst(root.leftNode, val) ;
    }

    return root ; 
}
    static int sum = 0 ; 

    public static int greatersumtree(Node root){

        if(root == null){
             return 0 ;
        }

        greatersumtree(root.rightNode) ; 

        int copy = root.data ; 

        root.data = sum ; 
        sum += copy ; 

        greatersumtree(root.leftNode) ; 

        return sum ; 
        
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
    }else{

        System.out.print(currNode.data+" ") ; 

        if(currNode.leftNode != null){
            q.add(currNode.leftNode) ; 
        }

        if(currNode.rightNode != null){
            q.add(currNode.rightNode) ; 
        }
    }
}
}

    public static void main(String[] args){

        int nodes[] = {11,2,7,1,29,15,40,35} ; 
Node root = null ;

        for(int i = 0 ; i < nodes.length ; i++){
             root = buildBst(root, nodes[i]) ; 
        }

levelOrder(root);


System.out.println() ;
greatersumtree(root) ; 

levelOrder(root);


}
}