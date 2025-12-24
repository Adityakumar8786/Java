public class DeleteNode {

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

    public static Node buildBST(Node root , int val){

        if(root == null){
            Node newNode = new Node(val) ; 
            return newNode ; 
        }

if(root.data < val){
root.rightNode = buildBST(root.rightNode, val) ; 
}

if(root.data > val){
root.leftNode = buildBST(root.leftNode, val) ; 
}

return root ; 
    }


    public static Node deleteNode(Node root , int key){

if(root == null) {
    return null ; 
}


if(key<root.data){
     root.leftNode = deleteNode(root.leftNode, key);
}
else if(key>root.data){
    root.rightNode = deleteNode(root.rightNode, key) ;
}


else{


    if(root.leftNode == null && root.rightNode == null){
        return null ;
    }

    if(root.leftNode == null){
        return root.rightNode ;
    }

    if(root.rightNode == null){
        return root.leftNode ;
    }

    Node inOrderSuccessor = findInOrderSuccessor(root.rightNode) ; 
    root.data = inOrderSuccessor.data ; 
    root.rightNode = deleteNode(root.rightNode, inOrderSuccessor.data) ; 
    
}

return root ; 

    }

    public static Node findInOrderSuccessor(Node root){
    Node currNode = root ; 

    while(currNode != null && currNode.leftNode !=null){
        currNode = currNode.leftNode ; 
    }

    return currNode ; 
}


public static void inorder(Node root){


    if(root == null){
return ;
    }

   inorder(root.leftNode);
   System.out.print(root.data+" ") ; 
   inorder(root.rightNode);
}


public static void main(String[] args){
int values[] = {5, 1, 3, 4, 2, 7};
        Node root = null;


        for(int i = 0 ; i < values.length ; i++){
           root= buildBST(root, values[i]) ; 
        }

inorder(root);

System.out.println() ; 
        root= deleteNode(root, 5) ; 

        inorder(root);
}
}