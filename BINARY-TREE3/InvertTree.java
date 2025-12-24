import java.util.LinkedList;
import java.util.Queue;
public class InvertTree {


    static class Node{
        int data ; 
        Node leftNode ; 
        Node rightNode ; 

        Node(int data){
this.data = data ;
leftNode = null ; 
rightNode = null ; 
        }
    }


    static class BinaryTree{
static int idx = -1 ; 

public static Node buildBinarytree(int nodes[]){

    idx ++ ; 

    if(nodes[idx] == -1){
        return null ; 
    }

    Node newNode = new Node(nodes[idx]) ; 
    newNode.leftNode = buildBinarytree(nodes); 
    newNode.rightNode = buildBinarytree(nodes) ; 

    return newNode ; 
}
}


public static void Invert(Node root){

    if(root==null){
        return ; 
    }

    swap (root) ; 

    Invert(root.leftNode);
    Invert(root.rightNode); 

}
    

public static void swap(Node root){
    if (root == null) {
            return;
        }
        Node temp = root.leftNode;
        root.leftNode = root.rightNode;
        root.rightNode = temp; 
}



public static void levelOrder(Node root ){

    Queue<Node> q = new LinkedList<>() ; 
    q.add(root) ; 
    q.add(null) ; 


    while(!q.isEmpty()){
Node currNode = q.remove() ; 

if(currNode == null){
System.out.println();

if(q.isEmpty()){
break ; 
}else{
    q.add(null) ; 
}

}else{

    System.out.print(currNode.data+" "); 


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

        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1} ; 

        Node root = BinaryTree.buildBinarytree(nodes) ; 

        Invert(root); 

        levelOrder(root);
    }
}