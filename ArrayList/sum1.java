import java.util.ArrayList;

class sum1 {
    public static void sum1(ArrayList<Integer> numbers , int target){
        int i = 0 ; 
        int j = numbers.size()-1 ; 

        while(i<=j){
            if(numbers.get(i) + numbers.get(j) == target) {
                System.out.print(numbers.get(i)+" "+numbers.get(j)) ; 
                i++ ; 
                j-- ; 
            System.out.println() ; 

            }
            else if(numbers.get(i) + numbers.get(j) < target) {
                i++ ; 
            }
            else{
                j-- ; 
            }
        }
    }

    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>() ; 
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);

        sum1(numbers,10) ; 
    }
}