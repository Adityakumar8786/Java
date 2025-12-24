import java.util.ArrayList;

class sum2 {
    public static void sum1(ArrayList<Integer> numbers , int target){
        int bp = -1 ; 
        int n = numbers.size() ; 

        for(int i = 0 ; i < n-1 ; i++){
            if(numbers.get(i)>numbers.get(i+1)){
                bp = i ; 
    break ;             
            }
        }

        int si = bp+1 ; 
        int ei = bp; 

        while (si!=ei){
            if(numbers.get(si) + numbers.get(ei) == target) {
                System.out.print(numbers.get(si)+" "+numbers.get(ei)) ; 
si = (si+1)%n ; 
               ei = (n+ei-1) % n ; 
                
            System.out.println() ; 

            }
            else if(numbers.get(si) + numbers.get(ei) < target) {
si = (si+1)%n ; 
            }
            else{
               ei = (n+ei-1) % n ; 
            }
        }
    }

    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>() ; 
        numbers.add(11);
        numbers.add(15);
        numbers.add(6);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        

        sum1(numbers,17) ; 
    }
}