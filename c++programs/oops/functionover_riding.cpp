#include<iostream>
using namespace std ;

class scooty {//parent 
public :
int topSpeed ;
float mileage ;

void name(){
    cout<<"pleasure"<<endl;
}
virtual void tank(){
    cout<<"3 liter"<<endl;
}

};



class bikes: public scooty{//child
    public:
    int gears ;
    void name(){
    cout<<"hero splendour"<<endl;
}
    void tank(){
    cout<<"5 liters"<<endl;
}
};




int main(){
    bikes b1 ; 
    //scooty *s = new scooty();
//this is stored in heap 


    scooty *b = new bikes();
    b->name();
//the output will be pleasure beacause the compiler 
//1st go to scooty class then print scooties name 

// if we want to store bikes data by scooty variable then we have to add 
//add keyword virtual infront of function 

b->tank();
//the op will be 5 liters 
return 0 ;
}

// this is the example of run time polymorphisim