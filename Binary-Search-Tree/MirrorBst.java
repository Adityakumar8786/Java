import java.util.LinkedList;
import java.util.Queue;

public class MirrorBst {

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

public static Node buildBst(Node root , int value){

    if(root == null){
        Node newNode = new Node(value) ; 
        return newNode ; 
    }

    if(root.data > value ){
root.leftNode = buildBst(root.leftNode, value) ; 
    }else{
root.rightNode = buildBst(root.rightNode, value) ; 
    }

    return root ;
}



    public static Node Mirror(Node root){

        if(root == null){
            return null; 
        }

        // root.rightNode = Mirror(root.leftNode);
        // root.leftNode = Mirror(root.rightNode);
        //this is wrong because root.rightnode changed in 1st line 
        // in second line when we called mirror function for rightnode it is not original right node 
        // but the updated one(in the first line)

// Node rightNodemirror = Mirror(root.leftNode);
//     Node leftNodemirror = Mirror(root.rightNode);


    Mirror(root.leftNode);
		Mirror(root.rightNode);

    Node temp = root.leftNode;
        root.leftNode = root.rightNode;
        root.rightNode = temp;


        return root ; 
    }



    public static void levelOrder(Node root){

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
            }

            else{

                System.out.print(currNode.data+" ") ; 
                if(currNode.leftNode != null){
q.add(currNode.leftNode) ; 
                }

                if(currNode.rightNode != null){
q.add(currNode.rightNode) ; 
                }
            }
        }
    }


    public static void inOrder(Node root){
    if (root == null) return;
    inOrder(root.leftNode);
    System.out.print(root.data + " ");
    inOrder(root.rightNode);
}



public static void main(String[] args){

    int values[] = {5, 1, 3, 4, 2, 7, 8} ; 

    Node root = null ; 

    for(int i = 0 ; i < values.length ; i++){
        root = buildBst(root, values[i]) ;
    }

    inOrder(root);

    root = Mirror(root) ; 

    inOrder(root);
}

}