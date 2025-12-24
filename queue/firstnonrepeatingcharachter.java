import java.util.LinkedList ; 
import java.util.Queue ; 
class firstnonrepeatingcharachter{
    public static void firstnonrepeatingcharachter(String str){
int[] freq = new int[26] ; 
Queue<Character> q = new LinkedList<>() ; 

for(int i = 0 ; i < str.length() ; i++){
char ch = str.charAt(i) ; 
freq[ch-'a']++ ; 
q.add(ch) ; 

while(!q.isEmpty() && freq[q.peek() - 'a'] > 1){
q.remove();
}
if(!q.isEmpty()){
     System.out.println(q.peek());
}else{
    System.out.println("-1");
}
}



    }

    public static void main(String[] args){
        String str ="aabccxb" ; 
        firstnonrepeatingcharachter(str) ; 
    }
}