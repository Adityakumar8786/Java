import java.util.Scanner; 
public class kthSmallestNode {

    static class Node{
        int data  ; 
        Node leftNode ; 
        Node rightNode ; 

        public Node(int data){
this.data = data ; 
this.leftNode = null ; 
this.rightNode = null ; 
        }
    }

    public static Node buildBst(Node root,int val){

        if(root == null){
           Node newNode = new Node(val)  ; 
           return newNode ; 
        }

        if(root.data > val){
           root.leftNode= buildBst(root.leftNode, val) ; 
        }

        if(root.data < val){
           root.rightNode= buildBst(root.rightNode, val) ; 
        }

        return root ; 
    }

static int counter = 0 ; 

    public static int findkthsmallest(Node root , int k){

        if(root == null){
            return -1 ; 
        }

        int leftresult = findkthsmallest(root.leftNode, k) ; 

if(leftresult != -1){
    return leftresult ; 
}

counter++ ; 
if(counter == k){
return root.data ; 
}


int rightresult = findkthsmallest(root.rightNode, k) ; 
if(rightresult != -1){
    return rightresult ; 
}

return -1 ;
    }

    public static void main(String[] args){

Scanner sc = new Scanner(System.in) ; 

        int nodes[] = {8,5,11,3,6,20} ; 
        Node root = null ; 


        for(int i = 0 ; i < nodes.length ; i++){
            root = buildBst(root, nodes[i]) ; 
        }

        int k = sc.nextInt() ; 
System.out.print(findkthsmallest(root, k));
sc.close(); 
    }
}