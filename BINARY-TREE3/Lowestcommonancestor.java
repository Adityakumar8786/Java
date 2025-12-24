import java.util.ArrayList; 

public class Lowestcommonancestor {

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



   public static void Lca (Node root , int n1 , int n2){

    ArrayList<Node> path1 = new ArrayList<>(); 
    ArrayList<Node> path2 = new ArrayList<>(); 

    int i = 0 ; 

   
   getpath(root , n1 , path1);
   getpath(root , n2 , path2);

    for(; i < path1.size() && i < path2.size() ; i++){

        if(path1.get(i) != path2.get(i)){
            break ;
        }

    }

Node lca = path1.get(i-1) ; 
System.out.println(lca.data) ; 
   }



public static boolean getpath(Node root , int n1 , ArrayList<Node>path){

    if (root == null) {
        return false;
    }

if(root.data == n1){
    return true; 
}

path.add(root) ; 



if (getpath(root.leftNode, n1, path) || getpath(root.rightNode, n1, path)) {
            return true;
        }


        path.remove(path.size() - 1);
        return false;


}

public static void main(String[] args){
    int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = Binarytree.buildBinarytree(nodes);

        Lca(root, 4, 6);
}
}