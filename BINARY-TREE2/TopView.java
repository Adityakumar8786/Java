import java.util.LinkedList; 
import java.util.HashMap; 
import java.util.Queue; 

public class TopView {

    static class Node{

        int data ; 
        Node leftNode ; 
        Node rightNode ; 


        public Node(int data){
            this.data = data ; 
            leftNode = null ; 
            rightNode = null ; 

        }

    }


static int idx = 0 ; 

    public static Node buildbinarytree(int nodes[]){

        idx++ ; 
if(idx > nodes.length || nodes[idx] == -1){
    return null ; 
}
        Node newNode = new Node(nodes[idx]) ; 
        newNode.leftNode = buildbinarytree(nodes) ; 
        newNode.rightNode = buildbinarytree(nodes) ; 
        return newNode ;  
    }


    static class Info{
        Node node ; 
        int hd ; 


        public Info(Node node , int hd){
            this.node = node ; 
            this.hd = hd ; 
        }

    }


    public static void TopVieww(Node root){

        Queue<Info> q= new LinkedList<>();  
HashMap<Integer,Node> map = new HashMap<>(); 

int min = 0 ; 
int max = 0 ; 

q.add(new Info(root,0)) ; 
q.add(null) ;


while(!q.isEmpty()){

Info currNode = q.remove() ; 


if(currNode== null){

    if(q.isEmpty()){
        break ; 
    }else{
        q.add(null) ; 
    }
}
else{

if(!map.containsKey(currNode.hd)){
    map.put(currNode.hd, currNode.node) ; 
}


if(currNode.node.leftNode != null){
q.add(new Info(currNode.node.leftNode, currNode.hd-1)) ; 
min = Math.min(min , currNode.hd-1) ; 
}


if(currNode.node.rightNode != null){
q.add(new Info(currNode.node.rightNode,currNode.hd+1));
max = Math.max(max,currNode.hd+1) ;
}
}
}

for(int i = min ; i<= max ; i++){
System.out.print(map.get(i).data+" ") ; 
}

    }


    public static void main(String [] args){

        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1} ; 
idx = -1 ; 
        Node root = buildbinarytree(nodes) ; 

        TopVieww(root); 
    }
}
