#include<iostream>
using namespace std ; 

class x {
    int *y ;
    public:
    x(){
        y = new int[3];
    }
    ~x(){
        delete []y ;
    }
};

// dynamic constructor and destructor 