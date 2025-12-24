#include<iostream>
#include<list>
using namespace std ;

int main(){
    list<int> l ={2,4,5,6,7,8,9,0}; 

for(int i : l){
    cout<<i<<endl;
}

list<int> n(5,100);//5 times 100 
for(int i : n){
    cout<<i<<endl;
}
return 0 ;
}
