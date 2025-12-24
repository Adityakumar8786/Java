class basicnqueen{

    public static void nqueen(char board[][],int row){

if(row==board.length){
        System.out.println("..................") ;
    for(int i = 0 ; i<2 ; i++){
    for(int j = 0 ; j < 2 ; j++){
        System.out.print(board[i][j]+" ") ;
    }
    System.out.println() ;
}
    return ; 
}


            for(int j= 0 ; j<2 ; j++){
board[row][j] = '*' ; 
nqueen(board,row+1) ; 
board[row][j] = 'x' ; 
            }


        }


    
    public static void main(String[] args){
        char board[][] = new char [2][2] ; 
for(int i = 0 ; i < 2 ; i++){
for(int j = 0 ; j < 2 ; j++){
board[i][j] = 'x';
}
}
nqueen(board,0);

    }
}