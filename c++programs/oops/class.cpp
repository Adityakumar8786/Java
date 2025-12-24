#include<iostream>
using namespace std ;
class car {
public :
 string name;
 string type ; 
 int no ; 
 int seat ;
};

void print (car c){
    cout<<c.name<<endl;
    cout<<c.type<<endl;
    cout<<c.seat<<endl;
    cout<<c.no<<endl;
}
void change (car c){
 c.name = "honda city ";
}
void change2 (car& c){
 c.name = "honda city ";
}
int main(){
    car c1 ;
    c1.name="swift";
    c1.type="suv";
    c1.no=2;
    c1.seat=5;
    change(c1);//pass by value , shallow copy
    print(c1);
    change2(c1);//pass by reference deep copy 
    print(c1);
    return 0 ; 
}

//encapsulation is wrapping of data and member function in a single unit is called class 
//helps data hiding 