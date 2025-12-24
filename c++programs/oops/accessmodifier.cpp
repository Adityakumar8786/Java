#include<iostream>
using namespace std ;
class student{
    public:
    int marks ;
    int rollno ;
    
    student(){

    }
    
    student(int m , int r ,char c){
        marks = m ;
        rollno  = r ;
        section = c ;
    }
    void display(){
cout<<section ; 
    }
    private:
    char section ;
};
int main(){
    // student s1 ;
    // s1.section = 'a';
    //cant be print because private member cant be accesed in outside code 

    student s1(99,29,'a'); // section can be accesed because constructor is inside member 
    //as constructor is a inside function 
  
  //  cout<<s1.section
  //still cant be output 
//we can make a inside function by which we can op the section as the function will be in inside member 

s1.display();
return 0 ; 
}