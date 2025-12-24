#include<iostream>
using namespace std ;

class scooty {//parent 
public :
int topSpeed ;
float mileage ;

void getdata(){
    cin>>diki;
}
void show(){
    cout<< diki ;
}
 
int diki ; 
};

class bike : public scooty{//child
    public:
int geras;

// void display(){
//     show();
// }
};

int main(){
    bike b1 ;
    b1.geras = 4 ;
    b1.mileage = 20 ;
    b1.topSpeed = 140 ;
b1.diki=90;
    b1.show();
return 0 ;
}