public class SubtreeofAnotherTree {


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

    static int idx = -1; 

   
    public static Node buildbinarytree(int nodes[]){
idx ++ ; 

if (idx >= nodes.length || nodes[idx] == -1) {
            return null;
        }

Node newNode = new Node(nodes[idx]) ; 
newNode.leftNode =  buildbinarytree(nodes) ; 
newNode.rightNode =  buildbinarytree(nodes) ; 

return newNode ; 

    }
    public static boolean isIdentical(Node root , Node subroot){

if(root == null && subroot == null){
return true ; 
}

 if(root == null || subroot == null){
return false ; 
}

if(!isIdentical(root.leftNode, subroot.leftNode)){
    return false ; 
}

if(!isIdentical(root.rightNode, subroot.rightNode)){
    return false ; 
}

 if (root.data != subroot.data) return false;
return true ; 
    }





public static boolean isSubtree(Node root , Node subroot){
    if(subroot == null){
        return true ; 
    }
    if(root==null){
        return false; 
    }

    if(root.data == subroot.data){
        if(isIdentical(root,subroot)){
            return true ; 
        }
    }

    return isSubtree(root.leftNode, subroot) || isSubtree(root.rightNode, subroot) ; 
}




public static void main(String[] args){
int[] mainTreeNodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        int[] subTreeNodes = {2, 4, -1, -1, 5, -1, -1};

        idx = -1 ; 
        Node maintree = buildbinarytree(mainTreeNodes) ; 
        idx = -1 ; 
        Node subtree = buildbinarytree(subTreeNodes) ;  

        boolean result = isSubtree(maintree, subtree);
        System.out.println("Is subtree: " + result);
}
}