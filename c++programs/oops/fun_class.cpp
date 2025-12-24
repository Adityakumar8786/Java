#include<iostream>
using namespace std ;
class car {
public :
 string name;
 string type ; 
 int no ; 
 int seat ;

 car(string s , string t , int n , int S){
   name = s ;                             
   type = t ;
   no = n ;
   seat = S ;
 }
 
 void print (string name){
    cout<<this->name<<endl;//that is why this-> is used 
    cout<<this->type<<endl;// otherwise cout<<name will print parameterised name 
    cout<<this->seat<<endl;
    cout<<this->no<<endl;
    cout<<name;
}
};

int main(){
    car c1 ("swift","type",2,5) ;
    c1.print("sonu");
    return 0 ; 
}