public class MaxsumofBstinBt{
    static class Node{
        int data ; 
        Node leftNode = null ; 
        Node rightNode = null ; 

        public Node(int data){
            this.data = data ; 
            this.leftNode = null ; 
            this.rightNode = null ; 
        }

    }


    static int idx = -1 ; 
    static int maxsum = 0 ; 


    public static Node buildBinarytree(int nodes[]){
idx ++ ; 

if (idx >= nodes.length) {  
        return null;
    }
    
if(nodes[idx] == -1){
return null ; 
}


Node newNode = new Node(nodes[idx]) ; 
newNode.leftNode = buildBinarytree(nodes) ; 
newNode.rightNode =  buildBinarytree(nodes) ; 

return newNode ; 

    }


    static class info{
        boolean isbst ; 
        int min  ; 
        int max ; 
int sum  ; 

public info(boolean isbst , int min , int max , int sum){
    this.isbst = isbst ; 
    this.min = min ; 
    this.max = max ; 
    this.sum = sum ; 
}

    }

    public static info postOrder(Node root){


        if(root == null){
            return new info(true ,Integer.MAX_VALUE ,Integer.MIN_VALUE,0) ; 
        }

info leftresult = postOrder(root.leftNode) ; 
info rightresult = postOrder(root.rightNode) ; 

if(leftresult.isbst && rightresult.isbst && root.data > leftresult.max && root.data < rightresult.min){


    int currentsum = root.data + leftresult.sum + rightresult.sum ; 
    maxsum = Math.max(currentsum,maxsum) ;

int minval = Math.min(root.data,leftresult.min) ; 
int maxval = Math.max(root.data , rightresult.max) ; 

return new info(true , minval ,maxval ,currentsum) ; 

}

return new info (false , 0 , 0,0) ; 
    }


    public static void main(String[] args){

        int nodes[] = {5,9,6,8,-1,-1,7,-1,-1,2,-1,3,-1,-1} ; 

        Node root = buildBinarytree(nodes) ; 

postOrder(root); 

System.out.print(maxsum);
    }
}