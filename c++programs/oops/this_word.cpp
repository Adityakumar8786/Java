#include<iostream>
using namespace std ; 
class cricketer{
    public :
string name ;
int runs ; 
// cricketer (string name , int runs ){
// name = name ;//can't be same name it will show garbage value can't identify 
// runs = runs ; 
// }
cricketer (string name , int runs ){
this->name = name ;
this->runs = runs ; 
}
};

int main(){
    cricketer test("virat kohli",1000);
}