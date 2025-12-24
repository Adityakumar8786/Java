class constructor{
    public static void main(String[] args){
Student s1= new Student();
Student s3= new Student(123);



Student s2= new Student("Aditya");
s2.rollno = 629 ; 
s2.marks[0] = 50 ; 
s2.marks[1] = 60 ; 
s2.marks[2] = 70 ; 


Student s4 = new Student(s2);
for(int i = 0 ; i < 3 ; i++){
    System.out.println(s2.marks[i]);
}



s2.marks[2] = 80 ; 

    System.out.println("marks after change");

for(int i = 0 ; i < 3 ; i++){
    System.out.println(s2.marks[i]);
}



    }
}

class Student{
    String name ;
    int rollno ; 
 int [] marks= new int [3];

    Student(){// non parameterized constructor
System.out.println("Constructor was called");
    }



    Student(String name ){//parameterized concstructor 
this.name = name ;
System.out.println(name);
    }
    Student(int rollno ){
this.rollno = rollno ;
System.out.println(rollno);
    }

Student(Student obj){
    int [] marks= new int [3];
    this.name = obj.name ; 
    this.rollno = obj.rollno ;
    this.marks = obj.marks ; 
}

    
}

//this is known as shallow copy as we didnot create another array for student s4 
// but we just copy the reference of the marks array of the s2 
// so when we changed in s2 marks in the s4 is also changed this is known as shallow copy 