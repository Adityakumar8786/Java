#include<iostream>
using namespace std ;

class scooty {//parent 
public :
int topSpeed ;
float mileage ;

private :
int diki ; 
};

class bike : public scooty{//child
    public:
int geras;
};

int main(){
    bike b1 ;
    b1.geras = 4 ;
    b1.mileage = 20 ;
    b1.topSpeed = 140 ;

return 0 ;
}