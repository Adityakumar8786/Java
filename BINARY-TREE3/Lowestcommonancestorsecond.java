public class Lowestcommonancestorsecond {

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



   public static Node lca2(Node root , int n1 , int n2){

    if(root == null){
        return null ; 
    }

    if(root.data == n1 || root.data == n2){
        return root ; 
    }


Node leftlca = lca2(root.leftNode, n1, n2);
Node rightlca = lca2(root.rightNode, n1, n2); 


if(leftlca == null){
    return rightlca ; 
}

if(rightlca == null){
    return leftlca ; 
}

if (leftlca != null && rightlca != null) {
            return root; 
        }
        return root ; 
}

public static void main(String[] args){
    int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = Binarytree.buildBinarytree(nodes);

        System.out.print(lca2(root, 4, 6).data);
}
}