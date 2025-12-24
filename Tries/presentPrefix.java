public class presentPrefix {

    static class Node{

        Node children[] = new Node[26] ; 
        boolean eow ; 

public Node(){

    for(int i = 0 ; i< children.length; i++){
children[i] = null ;
    }

}
    }

    static Node root = new Node () ; 

    public static void insert(String word){

Node currentNode = root ; 

for(int i = 0 ; i< word.length() ; i++){

    int idx = word.charAt(i) -'a';

    if(currentNode.children[idx] == null){
currentNode.children[idx] = new Node() ;
    }

    currentNode = currentNode.children[idx] ;
}

currentNode.eow = true ;
    }


    public static boolean ispresentPrefix(String pref){

        Node currNode = root ; 

        for(int i = 0 ; i < pref.length() ; i++){
            int idx = pref.charAt(i) - 'a' ;

            if(currNode.children[idx] == null){
                return false ; 
            }

            currNode = currNode.children[idx] ;
        }

        return true ; 
    }


    public static void main(String[] args){

        String str[] = {"apple","app","mango","man","woman"} ;

        String prefix1 = "app" ;
        String prefix2 = "man" ; 
        String prefix3 = "go" ; 

        for(int i = 0 ; i < str.length ; i++){
            insert(str[i]);
        }

        System.out.println(ispresentPrefix(prefix1));
        System.out.println(ispresentPrefix(prefix2));
        System.out.println(ispresentPrefix(prefix3));

    }
}