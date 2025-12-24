#include<iostream>
using namespace std ;
int main(){
    int a = 10 ; 
    int b ; 
    int c = 10 ;
    int d ;
    b = ++a ; 
    d = c++ ;
    cout << a<<endl;
    cout << b<<endl;
    cout << c<<endl;
    cout << d<<endl;

    // int i = 1 ;
    // i = i++ + ++i ;// 1 + 3 
    // cout << i;

    int i = 1;
    int j = 2 ;
    int k = i+j+i++ + j++ + ++i + ++j ; //1+2+1+2+3+4
    cout <<k<<endl ; 
    cout<<i <<endl;


i = i++ - --i  + ++i - i-- ; // 3-3+4-4=0--=0 
cout<<i<<endl;


int l = 5 ;//101 left shift 1010
int g = l << 1 ;
int s = l>>1 ; // 101 right shift 010
cout<<g;
cout<<s<<endl;
//a<<n a*2^n 
//a>>n a/2^n 


int z = (2,1,4,3);//z will be 3 returns the last value
cout<<z;
    return 0 ;
}