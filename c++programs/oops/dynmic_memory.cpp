#include<iostream>
using namespace std ; 
class cricketer{
    public :
string name ;
int runs ; 

cricketer (string name , int runs ){
this->name = name ;
this->runs = runs ; 
}
};

int main(){
    cricketer test("virat kohli",1000);
    cricketer *oneday = new cricketer("rohit sharma",3000);

    // int x1 = 5 ;
    // int*x2 = new int(6);//similar to this 
    cout<<(*oneday).name<<endl ;
}