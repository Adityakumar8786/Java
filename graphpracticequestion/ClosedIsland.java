public class ClosedIsland {

    static int[]dx = {-1,1,0,0};
    static int[]dy = {-1,1,0,0};

    public static void totalClosedIsland(int[][] matrics){

        int m = matrics.length ;
        int n = matrics[0].length ; 
boolean[][] visited = new boolean[m][n] ; 
int count = 0 ; 

for(int i = 0 ; i < m ; i++){
    for(int j = 0 ; j < n ; j++){

        if(dfs(i,j,m,n,matrics,visited)){

            count ++ ; 
        }
    }
}

    }

    pubic static 
}