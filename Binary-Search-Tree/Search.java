public class Search {

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

    public static Node buildBst(Node root , int value){

if(root == null){
  root = new Node(value) ;
  return root ;
}

if(root.data > value){
root.rightNode = buildBst(root.rightNode, value) ; 
}else{
root.leftNode = buildBst(root.leftNode, value) ; 
}

return root ; 
    }



public static boolean search(Node root , int key){

    if(root == null){
        return false ; 
    }

    
    if(root.data == key){
return true ; 
    }

if(key < root.data){
    return search(root.leftNode, key);
}else{
    return search(root.rightNode, key);
}

}
    public static void main(String[] args){
        int nodes[] = {5,1,3,4,2,7} ; 


        Node root = null ; 

        for(int i = 0 ; i < nodes.length ; i++){
           root = buildBst(root, nodes[i]) ; 
        }

        System.out.print(search(root,5));  
    }
}