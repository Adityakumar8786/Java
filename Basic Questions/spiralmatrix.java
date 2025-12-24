class spiralmatrix{
    public static void spiraamatrix(int arr[][]){
        int stcol = 0 ; 
        int strow = 0 ; 
        int endrow = arr.length-1 ;
        int endcol = arr[0].length-1 ; 
        while(stcol<=endcol && strow <= endrow){

            //top 
for(int i = stcol ; i<endcol; i++ ){
    System.out.print(arr[strow][i]+" ");
}
//right 
for(int i = strow ; i< endrow; i++){
    System.out.print(arr[i][endcol]+" ");
}
//buttom
for(int i = endcol ; i>stcol ; i--){
    System.out.print(arr[endrow][i]+" ");
}
//left
for(int i = endrow ; i > strow ; i--){
    System.out.print(arr[i][stcol]+" ");
}
stcol++;
strow++;
endcol--;
endrow-- ; 
        }
    }


public static void main(String [] args){
    int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    spiraamatrix(matrix);
}
}