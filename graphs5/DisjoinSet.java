public class DisjoinSet {

    static int num = 7 ; 
static int[] parent = new int[num] ; 
static int[] rank = new int[num] ; 


public static void intializtion(){
    for(int i = 0 ; i < parent.length ; i++){
parent[i] = i ;
rank[i] = 0 ;
}

}


public static int find(int x ){

    if(parent[x] == x){
        return x ; 
    }
return parent[x]=find(parent[x]) ; 
}


public static void union(int a , int b){

    int parA = find(a) ; 
    int parB = find(b) ;

    if(rank[parA] == rank[parB]){

        parent[parB] = parA ; 
        rank[parA] ++ ; 

    }

    else if(rank[parA] > rank[parB]){
parent[parB] = parA ; 
    }else{
        parent[parA] = parB ; 

    }
}

public static void main(String[] args){

    intializtion();

    union(1,3);
    System.out.println(find(3));
    union(2,4);
    union(3,6);
    union(1,4);
    System.out.println(find(3));
    union(1,5);

}
}