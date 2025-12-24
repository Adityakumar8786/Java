

public class DeleteLeafNodes {

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


public static Node deleteleafs(Node root , int x){

    if(root == null){
        return null ; 
    }


     root.leftNode = deleteleafs(root.leftNode , x ) ; 
     root.rightNode = deleteleafs(root.rightNode, x) ; 

    if(root.data == x && root.leftNode == null && root.rightNode == null){
        return null ; 
    }

    return root ; 
}
    

public static void main(String[] args){

    int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1} ;

    Node root = BinaryTree.buildBinarytree(nodes) ; 

    System.out.print(root.leftNode.leftNode.data);

    deleteleafs(root, 4) ; 

    System.out.print(root.leftNode.leftNode);

}
}