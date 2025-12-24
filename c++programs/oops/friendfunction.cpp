#include<iostream>
using namespace std ; 

class box{
int length ; 
public :

box(int l ){
    length = l ; 
}

friend void volume(box b);

};

void volume (box b ){

    cout<<"the value of volume is "<<b.length*b.length*b.length ; 
}

int main(){
    box b1(2) ; 
    volume(b1);
    return 0 ; 
}