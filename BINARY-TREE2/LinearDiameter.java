public class LinearDiameter {

    static class Node {
        int data ; 
        Node leftNode ; 
        Node rightNode ; 


       public  Node(int data){

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
    newNode.data = nodes[idx] ; 
newNode.leftNode = buildbinarytree(nodes) ; 
newNode.rightNode = buildbinarytree(nodes) ; 

return newNode ; 
}


    static class information{
int diameter ; 
int height ; 

public information(int diameter , int height){
this.diameter = diameter ; 
this.height = height ; 
}


    } 



    public static information diameter(Node root){


        if (root == null ){
            return new information(0,0) ; 
        }

        information rightinformation = diameter(root.rightNode) ;
        information leftinformation = diameter(root.leftNode) ;

        int totaldiameter = Math.max(Math.max(rightinformation.diameter , leftinformation.diameter) , rightinformation.height + leftinformation.height + 1 ); 
        int height = Math.max(rightinformation.height,leftinformation.height) + 1 ; 

        return new information(totaldiameter, height) ; 
    }



    public static void main(String[] args){

    int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

Node root = buildbinarytree(nodes) ; 

   information info = diameter(root); 
   System.out.println(info.diameter);



    }
}