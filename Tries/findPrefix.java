public class findPrefix {

    public static class Node{
        Node children[] = new Node[26] ;
        boolean eow ; 
int freq ; 

public Node(){

    for(int i = 0 ; i< 26 ; i++){
        children[i] = null ; 
    } 

    freq = 1 ;
}


    }

    static Node root = new Node() ; 

public static void insert (String word){

    Node current = root ; 

    for(int i = 0 ; i<word.length() ; i++){

        int idx = word.charAt(i) -'a' ;

        if(current.children[idx] == null){

            current.children[idx] = new Node() ;
        }else{
            current.children[idx].freq++ ;
        }

        current = current.children[idx] ;
    }

    
current.eow = true ; 
}

public static void prefix(Node root , String ans){

if(root== null){
    return ;
}
    if(root.freq == 1){
        System.out.println(ans);
        return ;
    }
    for(int i = 0 ; i< 26 ; i++){
        if(root.children[i] != null){
            prefix(root.children[i], ans+(char)(i+'a'));
        }
    }
}
    

    public static void main(String[] args){
        String arr[] = {"zebra","dog","duck","dove"} ; 

        for(int i = 0 ; i < arr.length ; i++){
            insert(arr[i]) ;
        }

        root.freq = -1 ; 

        prefix(root, "");
    }
}