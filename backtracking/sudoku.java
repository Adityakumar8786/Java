class sudoku{

public static boolean issafe(int board[][] , int row , int col,int digit){
    for(int i = 0 ; i <= 8 ; i++){
      if ( board[i][col] == digit ) {return false ; }
    }


    for(int j = 0 ; j <= 8 ; j++){
      if ( board[row][j] == digit ) {return false ; }
    }

    int sr = (row/3) * 3 ; 
    int sc = (col/3) * 3 ; 

    for(int i = sr ; i < sr+3 ; i++){
        for(int j = sc ; j < sc+3 ; j++){
            if(board[i][j] == digit){
                return false ; 
            }
        }
    }

    return true ; 
}




    public static boolean solvesudoku(int board[][] , int row , int col){
// base case

if(row == 9){
    return true ; 
}
if(col == 9){
    return solvesudoku(board,row+1,0) ; 
}




if(board[row][col] != 0){
    return solvesudoku(board,row,col+1) ;
}




for(int digit = 1 ; digit <= 9 ; digit ++){
if(issafe(board,row,col,digit)){
    board[row][col] = digit ; 

    if(solvesudoku(board,row,col+1)){
        return true ; 
    }

    board[row][col] = 0 ; 
}
}

return false ; 
    }

public static void print(int board[][]){
for(int i = 0 ; i<9; i++){
    for(int j = 0 ; j < 9; j++){
System.out.print(board[i][j]+" ") ; 
    }
    System.out.println() ; 
}
}

    public static void main(String[] args){
   
        int sudoku[][] = {
    {5, 3, 0, 0, 7, 0, 0, 0, 0},
    {6, 0, 0, 1, 9, 5, 0, 0, 0},
    {0, 9, 8, 0, 0, 0, 0, 6, 0},
    {8, 0, 0, 0, 6, 0, 0, 0, 3},
    {4, 0, 0, 8, 0, 3, 0, 0, 1},
    {7, 0, 0, 0, 2, 0, 0, 0, 6},
    {0, 6, 0, 0, 0, 0, 2, 8, 0},
    {0, 0, 0, 4, 1, 9, 0, 0, 5},
    {0, 0, 0, 0, 8, 0, 0, 7, 9}
};

if(solvesudoku(sudoku,0,0)){
    print(sudoku);
}  
    }
}
