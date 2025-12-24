import java.util.*;
public class insertionsort{
    public static void insertionsort(int arr[]){
        for(int i = 1 ; i < arr.length ; i ++){
            int current = arr[i];
            int previous = i-1;
            while(previous >=0 && arr[previous]>current){
                arr[previous+1] = arr[previous] ; 
                previous--;
            }
             arr[previous+1] = current ; 
        }
    }
    public static void print(int arr[]){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String [] args){
        int [] array = {8,9,4,3,2,7,4,0};
int [] secondarray = {1,3,2,5,4,6,5,8};
Integer[] thirdarray = {1,2,3,4,5,6,7,8,9,0};



Arrays.sort(secondarray);
        print(secondarray);
        System.out.println();



Arrays.sort(thirdarray,Collections.reverseOrder());
        for(int i = 0 ; i < thirdarray.length ; i++){
        System.out.print(thirdarray[i]);

        }
        System.out.println();



        insertionsort(array);
        print(array);
    }
}