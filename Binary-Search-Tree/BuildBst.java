public class BuildBst{

   static class Node {
int data ; 
Node leftNode ; 
Node rightNode ; 

Node(int data){
this.data = data ; 
leftNode = null ; 
rightNode = null ;
}

    } 


    public static Node buildbst(Node root , int val){

if(root==null){
    root = new Node(val) ; 
    return root ; 
}


 if(root.data > val){
    root.leftNode = buildbst(root.leftNode, val) ; 
 }else{
    root.rightNode = buildbst(root.rightNode, val) ; 
 }

return root ; 

    }


    public static void inorder(Node root){


        if(root == null){
            return ;
        }
inorder(root.leftNode);
System.out.print(root.data) ; 
inorder(root.rightNode);
    }


    public static void main(String[] args){
        int values[] ={5,1,3,4,2,7} ;

        Node root = null ; 

        for(int i = 0 ; i < values.length ; i++){
            root = buildbst(root, values[i]) ;
        }

        inorder(root);
    }
}
