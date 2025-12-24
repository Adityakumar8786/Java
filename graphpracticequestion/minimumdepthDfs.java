

class minimumdepthDfs {

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

      if(root == null){
return 0 ; 
      }

      if(root.leftNode == null){
        return 1+minDepthofabinarytree(root.rightNode) ; 
      }

      if(root.rightNode == null){
        return 1+minDepthofabinarytree(root.leftNode) ; 
      }

      return 1+Math.min(minDepthofabinarytree(root.leftNode) , minDepthofabinarytree(root.rightNode));
}




    public static void main(String[] args){

        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1} ; 

        Node root = buildBinaryTree(nodes) ;

     System.out.println(minDepthofabinarytree(root) );
    }
}