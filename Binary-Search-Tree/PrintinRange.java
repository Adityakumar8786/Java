public class PrintinRange {

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

    public static Node buildBst(Node root , int val){

if(root == null){
  Node newNode = new Node(val); 
  return newNode ; 
}


if(val > root.data){
    root.rightNode = buildBst(root.rightNode, val) ; 
}

if(val < root.data){
    root.leftNode = buildBst(root.leftNode, val) ; 
}

return root ; 
    }


    public static void printinrange(Node root , int low , int high){

        if(root == null){
            return ; 
        }

        if(root.data <= high && root.data >= low){
            printinrange(root.leftNode, low, high);
            System.out.print(root.data+" ");
            printinrange(root.rightNode, low, high);

        }
        else if(root.data > high){

            printinrange(root.leftNode, low, high);
        }
        

        else{
            printinrange(root.rightNode, low, high);

        }
    }

public static void main(String[] args){
    int values[] = {10, 5, 15, 3, 7, 12, 18, 1, 4, 6, 8, 11, 13, 16, 20};
        Node root = null; 


        for(int i = 0 ; i < values.length ; i++){
            root = buildBst(root, values[i]) ; 
        }

printinrange(root, 2, 5);
}
}