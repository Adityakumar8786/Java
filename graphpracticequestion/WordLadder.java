import java.util.* ; 
class WordLadder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        
        HashSet<String> set = new HashSet<>(wordList) ; 
        int chainlength = 1 ; 
        Queue<String> q = new LinkedList<>() ; 

         if(!set.contains(endWord)){
            return 0  ; 
         }

         q.add(beginWord) ; 


while(!q.isEmpty()){

int size = q.size() ; 

for(int i = 0 ; i < size ; i++){

String word = q.poll() ; 


if(word.equals(endWord)){ 
    return chainlength ; 
}


char[] chararr = word.toCharArray() ; 


for(int j = 0 ; j < chararr.length ; j++){
char original = chararr[j] ; 

for(char c = 'a' ; c <= 'z' ; c++){

if(c == original) {
    continue ; 
}


chararr[j] = c ; 

String newWord = new String(chararr);

if(set.contains(newWord)){
q.add(newWord) ; 
set.remove(newWord) ; 
}

}
chararr[j] = original ; 

}

}
 chainlength ++; 

}

return 0 ; 
    }

    public static void main(String[] args) {
    WordLadder obj = new WordLadder();
    List<String> wordList = Arrays.asList("hot","dot","dog","lot","log","cog");
    String beginWord = "hit";
    String endWord = "cog";
    System.out.println(obj.ladderLength(beginWord, endWord, wordList));
}

}