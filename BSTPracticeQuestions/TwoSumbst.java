import java.util.ArrayList ; 
public class TwoSumbst {

    static class Node{
        int data ; 
        Node leftNode ; 
        Node rightNode ; 
        public Node(int data) {
            this.data = data ; 
this.leftNode = null ; 
this.rightNode = null ; 
        }
    }

    public static Node buildBst(Node root , int val){

        if(root == null){
            Node newNode = new Node(val) ; 
            return newNode ; 
        }


        if(root.data > val){
            root.leftNode = buildBst(root.leftNode, val) ; 
        }

        if(root.data < val){
            root.rightNode = buildBst(root.rightNode, val) ; 
        }

        return root ; 
    }


    public static void inOrder (Node root , ArrayList<Integer> path){

        if(root == null){
            return ; 
        }

        inOrder(root.leftNode, path);
path.add(root.data) ;
        inOrder(root.rightNode, path);

    }


    public static boolean findsumnodes(Node root , int target){

        ArrayList<Integer> path = new ArrayList<>() ; 

        inOrder(root , path) ;

        int left = 0 ; 
        int right = path.size()-1 ; 

        while(left < right){

            int currentsum = path.get(left) + path.get(right) ; 

            if(currentsum == target){
                return true ; 
            }

            if(currentsum < target){
                left ++ ; 
            }

            if(currentsum > target){
                right -- ; 
            }
        }
        
        return false ; 
    }

    public static void main(String[] args){


        int nodes[] = {11,2,7,1,29,15,40,35} ; 
Node root = null ;

        for(int i = 0 ; i < nodes.length ; i++){
             root = buildBst(root, nodes[i]) ; 
        }

       System.out.print (findsumnodes(root, 10)) ; 
    }
}