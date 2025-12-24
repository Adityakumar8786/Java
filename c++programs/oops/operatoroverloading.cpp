#include<iostream>
using namespace std ;

class fraction {
    public:
    int num ;
    int den ;

    void display(){
        cout<<num<<"/"<<den<<endl;
    }

fraction (int n , int m){
    num = n ;
    den = m ;
}
    fraction operator+(fraction f){ //return type will be fraction same as class name
    int newNum = num*f.den + den*f.num ;
    int  newDen = den*f.den;
    fraction ans (newNum, newDen);
    return ans ;
    }
};

int main(){
    fraction f1 (1,2);
    fraction f2 (3,2);
    f1.display();
    f2.display();
    fraction f3 = f1 + f2 ;
    f3.display();
}

//polymorphisim is the ability of objects to take on differen forms or behave in differen 
//different ways depending on the contex in which they are used  

//same operaotor used in different types
//this is the example of compile time polymorphisim 
//function overloading ,constructor are also a example of compile time polymorphisim
