#include<iostream>
using namespace std ; 

void calculatearea(){
    auto square =[](int side){
return side * side ;
    };
    auto rectangle =[](int length , int breadth){
return length * breadth ;
    };

int side = 4 ;
int length = 5 ; int breadth = 6 ;

cout << "the area of the sqyare is"<<square(side)<<endl;
cout << "the area of the sqyare is"<<rectangle(length,breadth)<<endl;

}
int main(){
calculatearea();
return 0 ; 
}