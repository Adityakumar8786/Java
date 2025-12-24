public class KthlevelRecursively {

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


   class Binarytree{

    static int idx= 1 ; 

    public static Node buildBinarytree(int nodes[]){
idx ++ ; 

if(nodes[idx] == -1){
    return null ; 
}

Node newNode = new Node(nodes[idx]) ; 
newNode.leftNode = buildBinarytree(nodes) ; 
newNode.rightNode = buildBinarytree(nodes) ; 

return newNode ; 

    }

   }



   public static void KthLevel(Node root , int currentlevel ,int k){

if(root == null){
    return ; 
}

if(currentlevel == k){
System.out.print(root.data+" ") ; 
    return ; 
}

KthLevel(root.leftNode, currentlevel+1, k);
KthLevel(root.rightNode, currentlevel+1, k);
   }



   public static void main(String[] args){

    int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1}; 

    Binarytree.idx = -1 ; 
       Node root = Binarytree.buildBinarytree(nodes);  

        KthLevel(root,0,2);
   }
}