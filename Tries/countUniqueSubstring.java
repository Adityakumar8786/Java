public class countUniqueSubstring {

    public static class Node{
        Node children[] = new Node[26] ; 
        boolean eow = false ; 

        public Node(){

            for(int i = 0  ; i < 26 ;i++){
children[i] = null ; 
            }

        }
    }

   static Node root = new Node() ; 

    public static void insert(String word){

        Node currentNode = root ;

        for(int i = 0 ; i < word.length() ; i++){

            int idx = word.charAt(i)-'a' ;

            if(currentNode.children[idx] == null){
                currentNode.children[idx]=new Node();
            }

            currentNode = currentNode.children[idx] ; 
        }
currentNode.eow = true ; 
    }


    public static int countNodes(Node root){

        int count = 1 ; 
        if(root == null){
            return 0 ; 
        }


        for(int i = 0 ; i < 26 ; i++){

            if(root.children[i] != null){
                count += countNodes(root.children[i]) ;
            }
        }

        return count ;
    }

    public static void main(String[] args){

        String str = "ababa" ; 

        for(int i = 0 ; i < str.length() ; i++){
insert(str.substring(i));
        }

        System.out.println(countNodes(root)) ;
    }
}