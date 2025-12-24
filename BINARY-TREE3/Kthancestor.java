public class Kthancestor {

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


   static class Binarytree{

    static int idx= -1 ; 

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


public static int Kthancestornode(Node root , int n , int k ){

    if(root == null){
        return -1;
    }

    if(root.data == n){
        return 0 ; 
    }

    int leftdistance = Kthancestornode(root.leftNode , n , k) ; 
    int rightdistance = Kthancestornode(root.rightNode , n , k) ; 


    if(leftdistance == -1 && rightdistance == -1){
        return -1 ; 
    }
    
    int max = Math.max(leftdistance , rightdistance) ; 

    if (max+1 == k){
        System.out.print(root.data);
    }

    return max+1 ; 

}



   public static void main(String[] args){

        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
    
        Node root = Binarytree.buildBinarytree(nodes) ; 


         Kthancestornode(root, 6, 1); 

   }
}