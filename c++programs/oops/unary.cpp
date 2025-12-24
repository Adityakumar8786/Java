#include<iostream>
using namespace std ; 

class x {
    int v ; 
    public : 
    x(int v){
        this->v=v ;
    }
    void display(){
        cout<<v ;
    }

    x operator-(){
        return(-v);
    }

   
};
int main(){
    x obj(2) ; 
    obj.display();

    x obj2 = -obj;
    obj2.display(); 
}