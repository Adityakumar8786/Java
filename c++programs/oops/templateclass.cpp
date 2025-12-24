#include<iostream>
using namespace std ; 

template <typename T>
class x {//template class
    public : 
    T count;
    x(T count){
        this->count=count;
    }
    
    T show(){//template function 
        return count;
    }
};
int main(){
    x<int> obj(10);
   cout<< obj.show();
}

//A template class allows you to create a class to work with any data type.
//It provides the ability to define a class without specifying the data type in advance, 
