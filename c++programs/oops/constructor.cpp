#include<iostream>
using namespace std ;
class car {
public :
 string name;
 string type ; 
 int no ; 
 int seat ;

 car(string s , string t , int n , int S){//this is a construcor having same name as class similar to function
   name = s ;                             //without return type ; 
   type = t ;
   no = n ;
   seat = S ;
 }
 car(string s , string t , int n){// for car c3 made in main function 
    name = s ;       // seat can be declared again 
   type = t ;        // with calling default conc 
   no = n ;
 }

 car(){

 }
 //up is default constructer 

 // multiple constructer can be made 
};

void print (car c){
    cout<<"name"<<c.name<<endl;
    cout<<c.type<<endl;
    cout<<c.seat<<endl;
    cout<<c.no<<endl;
}


int main(){
    car c1 ("swift","type",2,5) ;
    c1.seat = 6 ; // it will over write the op will 6 
    
    car c3 ("swift","type",2) ;
    c3.seat = 6;
   
   
   //cannot be declared as below without calling default conc 
    car c2 ; 
    c2.name="fortuner";
    c2.no = 3 ;
    c2.seat = 5 ; 
    c2.type = "suv";

    print(c1);
    cout<<"break";
    print(c2);
    cout<<"break";
    print(c3);

car c4 = c3 ; 
c4.name = "innova";//deep copy 
print(c4);

car c5(c1);//copy constructor 
print(c5);
    return 0 ; 
}