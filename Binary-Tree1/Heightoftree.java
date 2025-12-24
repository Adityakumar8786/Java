 

public class Heightoftree {

   


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

static int idx = -1 ; 

public static Node buildbinarytree(int nodes[]){
    idx ++ ; 
    if(nodes[idx] == -1){
        return null ; 
    }

    Node newNode = new Node(nodes[idx]); 
newNode.leftNode = buildbinarytree(nodes) ; 
newNode.rightNode = buildbinarytree(nodes) ; 
    return newNode ; 
}


public static int height(Node root){
   
    int height ; 
  if(root == null){
    return 0 ; 
  }

  int left_height = height(root.leftNode) ; 
  int right_height = height(root.leftNode) ; 

  height = Math.max(left_height, right_height) + 1 ; 
return height ; 
}


public static void main(String[] args){

    int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};


    Node root = buildbinarytree(nodes) ; 

   int Heightofthetree = height(root); 
   System.out.println(Heightofthetree);


}
}