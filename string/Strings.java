import java.util.*;
class Strings {
    public static void main(String [] args){
        String str = "Aditya Kumar Pradhan";
        System.out.println(str);
        //string is imuttable 
        Scanner sc = new Scanner(System.in);
        String firstname =  sc.next();
        // sc.nextLine();
        System.out.println(firstname);

        String fullname =  sc.nextLine();
        System.out.println(fullname);
        System.out.println(fullname.length());
        System.out.println(firstname+" and "+fullname+" are good friends");//String concactenate 
        System.out.println(fullname.charAt(2));

sc.close();
    }
}
// next() only reads the first word (until a space) and leaves the newline character (\n) in the input buffer.
// nextLine() reads the rest of the line, but if next() was used before it, nextLine() will only read the remaining newline (\n), 
// making fullname an empty string.