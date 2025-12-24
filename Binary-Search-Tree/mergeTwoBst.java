import java.util.ArrayList; 
public class mergeTwoBst {


    static class Node{
        int data ; 
        Node leftNode ; 
        Node rightNode ; 

        public Node (int data){
this.data = data ; 
this.leftNode = null ; 
this.rightNode = null ; 
        }
    }

public static void getinOrder(Node root , ArrayList<Integer> arr){

    if(root == null){
        return ; 
    }

    getinOrder(root.leftNode, arr); 
    arr.add(root.data) ; 
    getinOrder(root.rightNode, arr); 
}

public static void inOrder(Node root){

if(root == null){
        return ; 
    }

    inOrder(root.leftNode); 
    System.out.print(root.data+" ") ; 
    inOrder(root.rightNode);
}

public static Node createBst(ArrayList<Integer>arr , int low , int high){

if(low > high){
    return null ; 
}

int mid = (low + high) / 2 ; 

Node root = new Node(arr.get(mid)) ; 

root.leftNode = createBst(arr, low, mid-1) ; 
root.rightNode = createBst(arr, mid+1, high) ; 

return root ; 
}


public static Node Merge(Node root1 , Node root2 ){

    ArrayList<Integer> path1 = new ArrayList<>() ; 
    ArrayList<Integer> path2 = new ArrayList<>() ; 
    ArrayList<Integer> finalPath = new ArrayList<>() ; 

    getinOrder(root2, path2);
    getinOrder(root1, path1); 

    int i =0 ; 
    int j = 0 ; 

    while(i < path1.size() && j < path2.size()){
        if(path1.get(i) < path2.get(j)){
finalPath.add(path1.get(i)) ; 
i++ ; 
        }else{
finalPath.add(path2.get(j)) ; 
j++ ; 
        }
    }


    while(i < path1.size()){
finalPath.add(path1.get(i)) ; 
        i++ ; 
    }

    while(j < path2.size()){
finalPath.add(path2.get(j)) ; 
        j++ ; 
    }

    Node newNode = createBst(finalPath, 0, finalPath.size()-1) ; 
    return newNode ;
}

public static void main(String[] args){

    Node root1 = new Node(2) ;  
    root1.leftNode = new Node(1) ; 
    root1.rightNode = new Node(4) ; 

    Node root2 = new Node(9) ; 
    root2.leftNode = new Node(3) ; 
    root2.rightNode = new Node(12) ; 

    Node newNode = Merge(root1 , root2) ;  

inOrder(newNode);
}
}