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

    x operator+(x obj){
        return(v+obj.v);
    }

   
};
int main(){
    x obj1(2) ; 
    x obj2(3) ;
//x obj3 = obj1.plus(obj2);
x obj3 = obj1+obj2;
obj3.display();
return 0 ; 
}