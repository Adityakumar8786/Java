import java.util.*;

public class linearsearch{
    public static int linear(int array[],int key){
        for(int i = 0 ; i< array.length ; i++){
if (array[i] == key){
    return i ;
}
        }
return -1 ; 

    }

    public static void main(String [] args){

Scanner sc = new Scanner(System.in);

int key = sc.nextInt();
int[] number = new int[5];
for(int i = 0 ; i <5 ; i++){
     number[i] = sc.nextInt();
}
if(linear(number,key)==-1){
    System.out.print("The Key is not Present");
}else{
System.out.println("The number is present in "+linear(number,key)+" th position");

    }
    }
}