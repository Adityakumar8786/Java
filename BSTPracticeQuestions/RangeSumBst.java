import java.util.Scanner ; 
public class RangeSumBst {

    static class Node {
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

        if(root.data > val){
            root.leftNode = buildBst(root.leftNode, val) ; 
        }else{
            root.rightNode = buildBst(root.rightNode, val) ; 
        }

        return root ; 
    }

    public static int rangesum(Node root,int l , int h){

        if(root == null){
            return 0 ; 
        }

        if(root.data > h){
            return rangesum(root.leftNode, l, h) ; 
        }

if(root.data < l){
            return rangesum(root.rightNode, l, h) ; 
}
       int leftsum = rangesum(root.leftNode , l , h) ; 
       int rightSum = rangesum(root.rightNode,l,h) ; 

       return root.data + leftsum + rightSum ; 
    }


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in) ; 

        int nodes[]= {8,5,11,3,6,20} ; 

        Node root = null ; 

        for(int i = 0 ; i < nodes.length ; i++){
            root = buildBst(root, nodes[i]) ; 
        }


        int l = sc.nextInt() ; 
        int h = sc.nextInt() ; 
        System.out.print(rangesum(root, l, h)) ; 
        sc.close(); 
    }
}