#include<iostream>
using namespace std ; 

class Student {
    public : 
string name ; 
int rollno ; 

void getdata(){
    cin>>name ; 
    cin>>rollno ;
}

void display(){
     
    cout<<name ; 
    cout<<rollno ; 
}
};

int main(){
    Student students[2];
    for(int i = 0 ; i<2 ; i++){
students[i].getdata();
    }
    for(int i = 0 ; i<2 ; i++){
students[i].display();
    }
}