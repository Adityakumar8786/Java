class maxAreaOfIsland {
        public int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}} ;

    public int maxAreaOfIslandd(int[][] grid) {
        

        int rows = grid.length ; 
        int cols = grid[0].length ; 

        boolean[][] visited = new boolean[rows][cols] ; 

        int maxregion = 0 ; 

        for(int i = 0 ; i< rows ; i++){
            for(int j = 0 ; j < cols ; j++){

                if(grid[i][j] == 1 && !visited[i][j]){
                    int size = dfs(grid,visited,i,j);
                    maxregion = Math.max(size,maxregion) ; 
                }
            }
        }


        return maxregion ; 
    }


    public int dfs(int[][] grid , boolean[][] visited , int row , int col){


if(row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || visited[row][col] || grid[row][col] == 0 ){
return 0 ; 
}

visited[row][col] = true ; 
int size = 1 ; 

for(int i = 0 ; i<directions.length ; i++){
    int newrow = row + directions[i][0] ; 
    int newcol = col + directions[i][1] ; 

size += dfs(grid,visited,newrow,newcol);
}

return size ; 
    }

    public static void main(String[] args) {
    maxAreaOfIsland obj = new maxAreaOfIsland();
    int[][] grid = {
        {0,0,1,0,0},
        {0,1,1,1,0},
        {0,0,0,0,0},
        {1,1,0,0,1}
    };
    System.out.println(obj.maxAreaOfIslandd(grid));
}

}