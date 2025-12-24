import java.util.Queue;
import java.util.LinkedList;

public class LevelOrder {

static class Node {
    int data ; 
    Node leftNode ; 
    Node rightNode ; 
 
Node(int data){
    this.data = data ; 
    this.leftNode = null ; 
    this.rightNode = null ; 
}

}    

static int idx = -1 ; 

public static Node buildbinarytree(int nodes[]){
    idx ++ ; 
    if(nodes[idx] == -1){
        return null ; 
    }

    Node newNode = new Node(nodes[idx]); 
newNode.leftNode = buildbinarytree(nodes) ; 
newNode.rightNode = buildbinarytree(nodes) ; 
    return newNode ; 
}


public static void LevelOrderr(Node root){
   
    Queue<Node> q = new LinkedList<>(); 
    q.add(root) ; 
    q.add(null) ; 

    while( !q.isEmpty()){
        Node currentNode = q.remove();

        if(currentNode == null) {

            System.out.println() ; 
            if(q.isEmpty()){
            break ; 
        }else{
            q.add(null) ; 
        }   

        }
        
        else{
            System.out.print(currentNode.data+" ") ; 

            if(currentNode.leftNode != null){
                q.add(currentNode.leftNode) ; 
            }

            if(currentNode.rightNode != null){
                q.add(currentNode.rightNode) ; 
            }

        }
        
    }
}


public static void main(String[] args){

    int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};


    Node root = buildbinarytree(nodes) ; 

    LevelOrderr(root);
}
}