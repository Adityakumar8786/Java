public class ValidateBst {

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

    if(root.data > val){
root.leftNode = buildBst(root.leftNode, val);
    }else{
root.rightNode = buildBst(root.rightNode, val);
    }

    return root ; 
}


public static boolean isValidate(Node root , Integer min, Integer max ){

if(root == null){
    return true ; 
}

if(min != null && root.data < min){
    return false ; 
}

if(max != null && root.data > max ){
    return false ; 
}
 return isValidate(root.leftNode, min, root.data) && isValidate(root.rightNode, root.data, max) ; 



}

public static void main(String[] args){

    int nodes[] = {5, 1, 3, 4, 2, 7,5,8} ; 
    Node root = null ; 

    for(int i = 0 ; i < nodes.length ; i++){
       root= buildBst(root, nodes[i]) ; 
    }


    System.out.println(isValidate(root, null, null)) ; 
}
}