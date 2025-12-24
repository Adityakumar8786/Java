public class findClosestNode {

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


    public static Node buildBst(Node root , int val){
        if(root == null){
            Node newNode = new Node(val) ; 
            return newNode ; 
        }

        if(root.data < val){
            root.rightNode = buildBst(root.rightNode, val);
        }
        else{
           root.leftNode = buildBst(root.leftNode, val);

        }
        return root ;
    } 

static int min = Integer.MAX_VALUE ; 

static int closest  ; 
    public static void closestNode(Node root , int k ){

        if(root == null){
            return; 
        }

        int diff = Math.abs(root.data - k) ; 

if(diff < min){
    min = diff ; 
    closest = root.data ; 
}

if(k < root.data ){
    closestNode(root.leftNode, k);
}
else if(root.data == k){
closest = root.data  ; 
}else{
    closestNode(root.rightNode, k);
}
    }


    public static void main(String[] args){

        int nodes[]=  {8,5,11,3,6,20} ; 
        Node root = null ; 

        for(int i = 0 ; i < nodes.length ; i++){
            root = buildBst(root, nodes[i]) ; 
        }

        closestNode(root, 17 );

        System.out.print(closest) ; 
    }
}