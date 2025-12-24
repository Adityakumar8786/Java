#include<iostream>
using namespace std ;

class vehicle {//parent 
public :
int topSpeed ;
float mileage ;


};

class twowheeler: public vehicle{//child
    public:
int geras;
};

class bikes: public twowheeler{//child
    
};
class scooty: public twowheeler{//child
    
};



int main(){
    bikes b1 ;
    b1.geras = 4 ;
    b1.mileage = 20 ;
    b1.topSpeed = 140 ;

return 0 ;
}