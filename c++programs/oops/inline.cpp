#include<iostream>
using namespace std ; 

inline int function (int a,int b){
return a+b ; 
}

int main(){
    int s = function(1,2);
    cout<<s;
    return 0 ; 
}
//inline function 