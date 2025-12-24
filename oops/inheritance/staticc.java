class staticc {
public static void main(String [] args){
    Student s1 = new Student(); 
    s1.name = "Aditya";
    s1.Schoolname = "Netaji";

    Student s2 = new Student(); 
    s2.name = "sonu" ;
    System.out.println(s2.Schoolname);
}
}

class Student{
    String name ; 
    static String Schoolname ; 
}

//static key word are created once in the class and memory 
// when we make the s1 student have school name netaji then automaticaly the school name of s2 become netaji 