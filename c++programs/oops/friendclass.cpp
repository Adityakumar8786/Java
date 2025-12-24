#include<iostream>
using namespace std ; 
class myclass1{
friend class myclass2 ; 
private :
int x ; 
public :
myclass1(int x){
    this->x = x ; 
}
};


class myclass2{
    public:
void showdata (myclass1 obj){
    cout<<"the value of x is "<<obj.x ;
}

};

int main(){
    myclass1 obj1(2); 
    myclass2 obj2 ; 
    obj2.showdata(obj1);

}