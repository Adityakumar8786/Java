public class ThreeDimensionalDP{




    public static int recursion(int i , int j1 , int j2 , int m , int n , int[][] grid){


        if(j1<0 || j1 >=n || j2<0 || j2>=n){
return -1;
        }

        if(i == m-1){
if(j1==j2){
    return grid[i][j1];
}else{
return grid[i][j1] + grid[i][j2] ; 
}
        }

  int max = Integer.MIN_VALUE ; 
  int cherries = (j1==j2)?grid[i][j1] : grid[i][j1] + grid[i][j2] ; 
  

  for(int dj1 = -1 ; dj1<= 1; dj1++){
    for(int dj2 = -1 ; dj2<=1 ; dj2++){
int next = recursion(i+1,j1+dj1,j2+dj2,m,n,grid);

max = Math.max(max,cherries+next);
    }
  }

  return max ; 
    }


public static void main(String[]args){

int[][] grid ={{3,1,1},{2,5,1},{1,5,5},{2,1,1}} ; 
System.out.println(recursion(0,0,2,4,3,grid));
}
}