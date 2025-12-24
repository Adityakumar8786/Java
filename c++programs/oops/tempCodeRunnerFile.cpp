#include<iostream>
using namespace std ; 

class a{
    public :
   virtual  void show(){
        cout<<"base class";
    }
};

class b : public a{
    public:
    void show(){
        cout<<"derived class";;
    }
};

int main(){
    a * c ;
    b  e ;
c = &e ;
c->show();
    return 0 ;
}