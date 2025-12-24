import java.util.Queue; 
import java.util.LinkedList;

public class Kthleveliteratively {
    

    static class Node{

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
static int idx;

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

} 

public static void Kthlevel(Node root , int k ){

    int level = 1 ; 
    Queue<Node> q = new LinkedList<>() ; 

    q.add(root) ; 
    q.add(null) ; 


    while(!q.isEmpty()){

        Node currNode = q.remove();


        if(currNode == null){

level++ ; 

            if(q.isEmpty()){
            break ; 
            }
            
            else{
q.add(null) ; 
            }

        }
        
        else{


            if(level == k){
                System.out.print(currNode.data + " ");
while (q.peek() != null) {
    Node tempNode = q.poll();
    System.out.print(tempNode.data + " ");
}


                return ; 

            }

            else{

                if(currNode.leftNode != null ){
                    q.add(currNode.leftNode) ; 
                }

                if(currNode.rightNode != null ){
                    q.add(currNode.rightNode) ; 
                }


            }

        }
    }

}


public static void main(String[] args){

        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1}; 

        Binarytree.idx = -1 ; 
       Node root = Binarytree.buildbinarytree(nodes);  

        Kthlevel(root,2);

}


}
