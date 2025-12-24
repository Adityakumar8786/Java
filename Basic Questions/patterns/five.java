import java.util.*
;
public class five{
    public static void hollowrectangle(int rows ,int cols){
        for (int i = 1 ; i <= rows ; i++){
            for(int j= 1 ; j <= cols ; j++){
if(i==1 || j==cols || i==rows || j==1){
    System.out.print("*");
}else{
    System.out.print(" ");
}
            }
    System.out.println();
        }
    }


public static void main(String args[]){
    Scanner sc = new Scanner (System.in);
    int rows = sc.nextInt();
    int cols = sc.nextInt();

    hollowrectangle(rows,cols);
}
}