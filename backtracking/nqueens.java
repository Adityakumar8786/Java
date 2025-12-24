class nqueens{
public static boolean issafe(char board[][],int row ,int col){
   int n =  board.length ;  

for(int i = row-1 ; i>=0 ; i--){
    if(board[i][col] == 'Q'){
        return false ; 
    }
}
    
    for(int i = row+1 ; i<n ; i++){
        if(board[i][col] == 'Q'){
            return false ; 
        }
    }

    for(int i = row-1, j =col-1; i>=0 && j>=0; i-- ,j--){
        if(board[i][j] == 'Q'){
            return false ; 
        }
    }

    for(int i = row+1, j =col+1; i<n && j<n; i++ ,j++){
        if(board[i][j] == 'Q'){
            return false ; 
        }
    }


    for(int i = row-1, j =col+1; i>=0 && j<n; i-- ,j++){
        if(board[i][j] == 'Q'){
            return false ; 
        }
    }


    

for(int i = row+1 ,  j = col-1 ; i<n && j>=0 ;i++,j--){
    if(board[i][j] == 'Q'){
            return false ; 
        }
}

return true ; 
}



    public static void nqueens(char board[][] , int row){

if(row == board.length) {
    print(board) ;
    return ; 
}



        for(int col = 0 ; col<board.length ; col++){
            if(issafe(board,row,col)){
board[row][col]  = 'Q' ; 
nqueens(board ,row+1) ;
board[row][col]  = 'x' ; 
}
     
        }
    }







public static void print(char board[][]){
System.out.println(">>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<") ; 
    for(int i= 0 ; i<board.length ; i++){
        for(int j= 0 ; j<board.length ; j++){
            System.out.print(board[i][j]) ; 
        }
        System.out.println() ; 
    }
}





    public static void main(String[] args){
        int n = 4 ; 
    char board[][] = new char[n][n] ; 
for(int i =0; i< board.length ; i++){
for(int j =0; j< board.length ; j++){
    board[i][j] = 'x' ; 
}
}



nqueens(board,0);
    }



}