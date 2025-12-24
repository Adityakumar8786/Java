import java.util.LinkedList;
import java.util.Queue;

public class TransformofSumTree {

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


   public static int sumoftrees(Node root){

    if(root == null){
        return 0; 
    }

    int data = root.data ; 
    int left = sumoftrees(root.leftNode);
    int right = sumoftrees(root.rightNode);

root.data = left + right ; 

return data+left+right ; 
   }



public static void levelOrder(Node root){
Queue<Node> q = new LinkedList<>() ;
q.add(root) ; 
 q.add(null) ;


 while(!q.isEmpty()){

    Node currNode = q.remove() ; 

    if(currNode == null){
System.out.println() ; 
        if(q.isEmpty()){
break ; 
        }else{
q.add(null) ;
        }
    }else{

        System.out.print(currNode.data+" ") ; 
      
        if(currNode.leftNode != null) {
            q.add(currNode.leftNode) ; 
        }

        if(currNode.rightNode != null) {
            q.add(currNode.rightNode) ; 
        }
    }
 }

}   

   public static void main(String[] args){

    int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1,7,-1,-1};
    
        Node root = Binarytree.buildBinarytree(nodes) ; 


         sumoftrees(root); 
         levelOrder(root);

   }
} 