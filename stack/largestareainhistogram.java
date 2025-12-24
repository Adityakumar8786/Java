import java.util.* ; 
class largestareainhistogram{
public static void largestarea(int[] histograms ,int[]nextsmallestinright , int[]nextsmallestinleft ){
    Stack<Integer> s = new Stack<>() ;
    for(int i = 0 ; i<histograms.length; i++){

    
    while(!s.isEmpty() && histograms[i] < histograms[s.peek()]){
        s.pop() ;
    }
if(s.isEmpty()){
nextsmallestinleft[i] = -1 ;
}else{
    nextsmallestinleft[i] = s.peek() ; 
}

s.push(i) ;
    }

    

    Stack<Integer> s1 = new Stack<>() ;
for(int i = histograms.length-1 ; i >= 0 ; i --){
    while(!s1.isEmpty() && histograms[i]<histograms[s1.peek()]){
        s1.pop() ; 
    }
    if(s1.isEmpty()){
nextsmallestinright[i] = -1 ; 
    }else{
nextsmallestinright[i] = s1.peek() ; 
    }
    s1.push(i) ; 
}

int max = Integer.MIN_VALUE; 
for(int i = 0 ; i < histograms.length ; i++){
    int width = nextsmallestinright[i]-1-nextsmallestinleft[i] ; 
    int height = histograms[i] ; 
    int area = height*width ; 
    max= Math.max(max,area) ; 
}

System.out.println(max) ; 
}


    public static void main(String[] args){
        int[] histograms = {2,1,5,6,2,3};
        int nextsmallestinright[] = new int[histograms.length] ; 
        int nextsmallestinleft[] = new int[histograms.length] ;
        largestarea(histograms,nextsmallestinright,nextsmallestinleft) ; 
    }
}