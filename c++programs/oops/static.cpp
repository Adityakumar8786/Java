#include<iostream>
using namespace std ;

void fun(){
    int x =0;
    cout<<x<<endl;
    x = x+1 ;
}
 void fun1(){
    static int y=0 ;
    cout <<y <<endl; 
    y++;
}


int main(){
fun();
fun();
fun();

//expected op is 0 1 2 after increament 
//op will be 0 0 0 because once x=0 created and then deleted and then again created in memory adress

fun1();
fun1();
fun1();
//op will be 0 1 2 here y is created differently 
}