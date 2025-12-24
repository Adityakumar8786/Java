import java.util.* ; 
class stockspanproblem{
    public static void stockspan(int stocks[] , int span[]){
        Stack<Integer> s = new Stack() ; 
span[0] = 1 ; 
s.push(0) ; 

for(int i = 1 ; i<stocks.length ; i++){
    int currentprice=stocks[i] ; 
while(!s.isEmpty() && currentprice > stocks[s.peek()]){
    s.pop() ; 
}


if(s.isEmpty()){
    span[i] = i+1 ; 
}else{
    int previoushigh = s.peek() ; 
    span[i] = i - previoushigh ; 
}
s.push(i) ; 

}

for(int i = 0 ; i<span.length ; i++){
    System.out.print(span[i]+" " );
}
System.out.println() ; 
    }
    public static void main(String[] args){
int [] stock = {100,80,60,70,60,85,100};
int [] span = new int[stock.length]; 
stockspan(stock,span) ; 
    }
}