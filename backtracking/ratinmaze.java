class ratinmaze{
    public static void findpath(int board[][] , int row , int col , String path){
        int n = board.length ; 

if(row>=n || col>=n || row<0 || col<0 || board[row][col] == 0 || board[row][col] ==-1){
    return ; 
}

if(row ==n-1  &&col ==n-1){
        System.out.println(path) ; 
return ; 
}

board[row][col] = -1 ; 
        findpath(board,row,col+1,path+"R") ;
        findpath(board,row,col-1,path+"L") ;
        findpath(board,row+1,col,path+"D") ;
        findpath(board,row-1,col,path+"U") ; 
        board[row][col] = 1 ; 

    }


    public static void main(String [] args){
        int maze[][] = {{ 1, 0, 0, 0 },{ 1, 1, 0, 1 },{ 1, 1, 0, 0 },{ 0, 1, 1, 1 } };
findpath(maze,0,0,"") ; 
    }
}
