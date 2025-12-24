public class UnivaluedBinaryTree {

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
    newNode.leftNode = buildBinarytree(nodes) ; 
    newNode.rightNode = buildBinarytree(nodes); 

    return newNode ; 
}
}


public static boolean Univalued(Node root){

    if(root == null){
return true ; 
    }


    if(root.leftNode != null && root.leftNode.data == root.data){
        return true ; 
    }


    if(root.rightNode != null && root.rightNode.data == root.data){
        return true ; 
    }

return Univalued(root.leftNode) && Univalued(root.rightNode) ; 
}
    


    public static void main(String[] args){

        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1} ; 

        Node root = BinaryTree.buildBinarytree(nodes) ; 

        System.out.println(Univalued(root)); 
    }
}