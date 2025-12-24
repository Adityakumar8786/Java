class knightsmove {


    public static boolean issafe(int board[][] , int row , int col){
        int n = board.length ; 
        if(row >= n || col >=n || row<0 || col<0 || board[row][col] != -1){
            return false; 
        } 
        return true ; 
    }


    public static boolean knightsmove(int board[][] , int row , int col , int move ){
int n = board.length ;

if(move == n*n){
    print(board) ; 
    return true; 
}


int rowmoves[] = {2, 1, -1, -2, -2, -1, 1, 2} ; 
int colmoves[] = {1, 2, 2, 1, -1, -2, -2, -1} ;

for(int i = 0 ; i< 8 ; i++){
int newrow = row+rowmoves[i] ;
int newcol = col+colmoves[i] ;

if(issafe(board,newrow,newcol)){
board[newrow][newcol] = move ; 
if(knightsmove(board,newrow,newcol,move+1)){
    return true ; 
}
board[newrow][newcol] = -1 ; 
}
}
return false ; 
    }



public static void print(int board[][]){
    for(int i = 0 ; i < board.length ; i++){
    for(int j = 0 ; j < board.length ; j++){
System.out.print(board[i][j]+" ");
    }
    System.out.println() ; 
    }
}


    public static void main(String [] args){
        int board[][] = new int[8][8] ; 
        for(int i = 0 ; i< board.length ; i++){
            for(int j = 0 ; j < board.length ; j++){
board[i][j] = -1 ; 

    }
        }

         board[0][0] = 0;
knightsmove(board,0,0,1) ; 

    }
}