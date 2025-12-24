public class sizeofLargestBstinBinaryTree {

   static class Node {
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

    public static Node buildBinarytree(int nodes[]){
idx ++ ; 


if(idx >= nodes.length ||nodes[idx] == -1){
    return null ; 
}

Node newNode = new Node(nodes[idx]) ; 
newNode.leftNode = buildBinarytree(nodes) ; 
newNode.rightNode = buildBinarytree(nodes) ; 

return newNode ; 
    }

    static class information{
        int size ; 
        int min ; 
        int max ; 
        boolean isBst ; 

        public information (int size , int min , int max , boolean isBst){
this.size = size ; 
this.min = min ; 
this.max = max ; 
this.isBst = isBst ; 
        }
    }

    static int maxBst = Integer.MIN_VALUE; 

public static information LargestBst(Node root){

    if(root == null){
        return new information(0,Integer.MAX_VALUE,Integer.MIN_VALUE,true) ; 
    }

    information leftInfo = LargestBst(root.leftNode) ; 
    information rightInfo = LargestBst(root.rightNode) ; 

    int size = leftInfo.size + rightInfo.size + 1 ; 

    int min = Math.min(Math.min(root.data , leftInfo.min) , rightInfo.min) ;  

    int max = Math.max(Math.max(root.data , leftInfo.max) , rightInfo.max) ; 

    if(leftInfo.isBst && rightInfo.isBst && root.data > leftInfo.max && root.data < rightInfo.min){

        maxBst = Math.max(maxBst , size) ; 
        return new information(size, min, max, true) ; 
    }

    return new information(size, min, max, false) ; 
}

public static void main(String[] args){
    int nodes[] = {50, 30, 5, -1, -1, 20, -1, -1, 60, 45, -1, -1, 70, -1, 80} ; 

    Node root = buildBinarytree(nodes) ; 

    LargestBst(root) ; 


    System.out.println(maxBst) ; 
}
}