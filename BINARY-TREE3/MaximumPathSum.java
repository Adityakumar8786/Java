public class MaximumPathSum {

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



static class MaxHolder{
int max = Integer.MIN_VALUE ; 
}


public static int maxpath(Node root , MaxHolder max ){

    if(root == null){
        return 0 ; 
    }


    int leftsum = maxpath(root.leftNode,max) ; 
    int rightsum = maxpath(root.rightNode,max) ; 

    max.max = Math.max(max.max,leftsum+rightsum+root.data) ; 
    return  Math.max(leftsum , rightsum)+root.data; 
}


public static void main(String[] args){

        int nodes[] = {-10,-23,4,-1,-1,5,-1,-1,3,-1,6,-1,-1} ; 

        Node root = BinaryTree.buildBinarytree(nodes) ; 

        MaxHolder max = new MaxHolder() ; 
        maxpath(root,max); 
        System.out.print(max.max) ; 
    }

}

