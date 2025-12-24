
public class PostOrderTraversal {

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


public static void PostOrder(Node root){
    if(root == null){
        System.out.print(-1+" ");
        return ; 
    }

    PostOrder(root.leftNode);
    PostOrder(root.rightNode);
    System.out.print(root.data+" ") ; 

}


public static void main(String[] args){

    int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};


    Node root = buildbinarytree(nodes) ; 

    PostOrder(root);
}
}