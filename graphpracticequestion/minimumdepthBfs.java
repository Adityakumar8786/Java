import java.util.Queue;
import java.util.LinkedList ; 

class minimumdepthBfs {

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

    static int idx = -1 ; 

public static Node buildBinaryTree(int[] nodes){

    idx ++ ; 

    if(nodes[idx] == -1){
        return null ; 
    }

    Node newNode = new Node(nodes[idx])  ; 
    newNode.leftNode = buildBinaryTree(nodes) ; 
    newNode.rightNode = buildBinaryTree(nodes) ; 

    return newNode ;
}


    public static int minDepthofabinarytree(Node root) {

        Queue<Node> q = new LinkedList<>() ; 
    q.add(root) ;
     int depth = 1 ;  

     while(!q.isEmpty()){

int size = q.size() ; 

for(int i = 0 ; i< size ; i++){

Node current = q.poll() ; 

if(current.leftNode == null && current.rightNode == null){
    return depth ; 
}


if(current.leftNode != null ){
    q.add(current.leftNode) ; 
}


if(current.rightNode !=null){
q.add(current.rightNode) ; 
}

}

depth ++ ; 
     }

return depth ; 
    }


    public static void main(String[] args){

        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1} ; 

        Node root = buildBinaryTree(nodes) ;

     System.out.println(minDepthofabinarytree(root) );
    }
}