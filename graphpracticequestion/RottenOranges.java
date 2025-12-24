import java.util.* ; 

class RottenOranges {

    public int orangesRotting(int[][] grid) {
        
        int[][] direction = {{-1,0},{1,0},{0,-1},{0,1}} ; 
        int rows = grid.length ; 
        int cols = grid[0].length ; 

        Queue<int[]> q = new LinkedList<>() ; 
        int minute = -1 ; 
        int freshorange = 0 ; 

        for(int i = 0 ; i< rows ; i++){
            for(int j = 0 ; j < cols ; j++){

                if(grid[i][j] == 2){
q.add(new int[]{i,j}) ; 
                }

                if(grid[i][j] == 1){
                    freshorange ++ ; 
                }

            }
        }


if(freshorange == 0 ){
    return 0 ; 
}

while(!q.isEmpty()){

int size = q.size() ; 
minute ++ ; 


for(int i = 0 ; i < size ; i++){

int current[] = q.poll() ; 

int row = current[0] ; 
int col = current[1] ;

for(int j = 0 ; j < direction.length ; j++){

int newrow = row + direction[j][0] ; 
int newcol = col + direction[j][1] ; 



if(newrow >= 0 && newrow<rows && newcol >= 0 && newcol<cols && grid[newrow][newcol] == 1 ){
grid[newrow][newcol] = 2 ; 
q.add(new int[]{newrow,newcol});
freshorange -- ; 
}
}

}

}

return freshorange == 0 ? minute : -1 ; 
    }

    public static void main(String[] args) {
    RottenOranges obj = new RottenOranges();
    int[][] grid = {
        {2,1,1},
        {1,1,0},
        {0,1,1}
    };
    System.out.println(obj.orangesRotting(grid));
}

}