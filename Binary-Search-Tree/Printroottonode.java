
import java.util.ArrayList;
public class Printroottonode {

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

    public static Node buildBst(Node root,int val){

    if(root == null){
        Node newNode = new Node(val) ; 
        return newNode ; 
    }

    if(root.data > val){
       root.leftNode = buildBst(root.leftNode , val) ; 
    }
    
   else{
        root.rightNode = buildBst(root.rightNode , val) ; 

    }

    return root ; 
}


public static void Printroottoleaf(Node root , ArrayList<Integer> path){

if ( root == null){
    return ; 
}

path.add(root.data) ; 

if(root.leftNode == null && root.rightNode == null){
PrintPath(path) ; 
System.out.println();
}

Printroottoleaf(root.leftNode,path) ; 
Printroottoleaf(root.rightNode,path) ; 

path.remove(path.size()-1) ; 
}

public static void PrintPath(ArrayList<Integer> path){

for(int i = 0 ; i < path.size() ; i++){
System.out.print(path.get(i)+" "); 
}

}

public static void main(String[] args){
     int values[] = {10, 5, 15, 3, 7, 12, 18, 1, 4, 6, 8, 11, 13, 16, 20};
        Node root = null; 


        for(int i = 0 ; i < values.length ; i++){
            root = buildBst(root, values[i]) ; 
        }


        ArrayList<Integer> path = new ArrayList<>() ; 
Printroottoleaf(root,path) ; 
    }
}