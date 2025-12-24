import java.util.ArrayList;
public class Lowestdistance {
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


   public static Node CommonAncestor(Node root , int n1 , int n2){

    ArrayList<Node> path1 = new ArrayList<>() ; 
    ArrayList<Node> path2 = new ArrayList<>() ; 



if (!getpath(root , n1 , path1) || !getpath(root , n2 , path2)) {
        return null;  
    }

int i = 0 ; 

for(; i < path1.size() && i<path2.size(); i++){
    if(path1.get(i) != path2.get(i)) {
    break ; 

    }
}

Node lca = path1.get(i-1) ; 

return lca ; 
   }
    

   public static boolean getpath(Node root , int n , ArrayList<Node> path){

    if(root == null){
        return false ; 
    }

    path.add(root) ; 

    if(root.data == n){
        return true ; 
    }


    if(getpath(root.leftNode, n, path) || getpath(root.rightNode, n, path)){
        return true ; 
    }

    path.remove(path.size() - 1);
    return false ; 
   }


   public static int lcadistance(Node root , int n){

    if(root == null ){
return -1 ; 
    }

    if(root.data == n){
return 0 ; 
    }


     int leftdistance = lcadistance(root.leftNode, n) ; 
     int rightdistance = lcadistance(root.rightNode, n) ; 


     if(leftdistance == -1 && rightdistance == -1){
        return -1 ; 
     }

     if (leftdistance == -1 ) {
        return rightdistance+1 ; 
     }


    else {
        return leftdistance +1 ;
    }
   }


   public static int lowestdistance(Node root , int n1 , int n2){

    

    Node temp = CommonAncestor(root,n1,n2) ; 

if (temp == null) {
        return -1; 
    }

    int dist1 = lcadistance(temp, n1) ; 
    int dist2 = lcadistance(temp, n2) ; 

    return dist1 +dist2 ;

   }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = Binarytree.buildBinarytree(nodes);

        System.out.println("Distance between 4 and 5: " + lowestdistance(root, 4, 5)); // Output: 2
        System.out.println("Distance between 4 and 6: " + lowestdistance(root, 4, 6)); // Output: 4
        System.out.println("Distance between 3 and 6: " + lowestdistance(root, 3, 6)); // Output: 1
    }
}