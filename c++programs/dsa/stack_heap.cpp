#include<iostream>
using namespace std ; 
int main(){
    int a = 5 ; //stord memeory in stack
    int *p = new int();//stored in heap 
    *p = 10 ; // allocates memory in heap 
    delete(p);
    p = NULL ; 
//deallocates memory     
    

p = new int[4]; // array stored in heap 

delete[]p;
p = NULL; 
return 0 ; 
}