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
 
};

void print (car* c){
    //(*c).name="fortuner";
    c->name = "fortuner";//same 
}

int main(){
    car c1 ("swift","type",2,5) ;

    car* c2 = &c1 ;
    cout<<(*c2).name<<endl;
    print(c2);
    cout<<(*c2).name<<endl;
    cout<<c2->name<<endl;

    return 0 ; 
}