class deepcopy{
    public static void main(String args[]){
Student s1 = new Student();
s1.marks[0] = 1 ; 
s1.marks[1] = 2 ; 
s1.marks[2] = 3 ; 

Student s2 = new Student(s1);
for(int i = 0 ; i < 3 ; i++){
System.out.println(s2.marks[i]);
}



s1.marks[2] = 4; 
System.out.println("deep copy");
for(int i = 0 ; i < 3 ; i++){
System.out.println(s2.marks[i]);
}


    }
}

class Student{
    int [] marks = new int [3];//this line is neccessary for deep copy in shallow copy we may not allocate the memory 
                            //but in deep copy we must allocate memory 


    Student(){};

    Student(Student obj){
int [] marks = new int[3];
for(int i = 0 ; i < 3 ; i++){
    this.marks[i] = obj.marks[i] ; 
}
    }

}