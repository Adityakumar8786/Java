import java.util.Arrays;
class anagramstring{
    public static void anagram(String str1 , String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
    

    if(str1.length() == str2.length()){
char[] newstr1 = str1.toCharArray();
char[] newstr2 = str2.toCharArray();

Arrays.sort(newstr1);
Arrays.sort(newstr2);

boolean array = Arrays.equals(newstr1,newstr2);
if(array){
    System.out.println("Strings are anagram");
}
else  {
    System.out.println("Strings are not anagram");
}
    }else{
    System.out.println("Strings are not anagram(length mismatched)");

    }
    }
    public static void main(String [] args){
        String str1 = "Aditya";
        String str2 = "sonu";

        anagram(str1,str2);

    }
}