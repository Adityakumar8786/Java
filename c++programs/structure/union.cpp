#include<iostream>
using namespace std ;
 union pokemon {
    int hp ;
    int no ;
    float roll ;
 };
 int main (){
    union pokemon pikachu ;
    pikachu.hp=1;
    pikachu.no=2;
    pikachu.roll=3; 
     cout<<pikachu.hp<<endl;
     cout<<pikachu.no<<endl;
     cout<<pikachu.roll;
return 0 ;
 }

// at a time only one variable can be accessed other wise same as structure 
//in the uppercode 1st 2 will be garbage value and then it will show 3 
//heighest priority will be taken as 1st 




