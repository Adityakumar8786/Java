#include<iostream>
using namespace std ;
int main(){

//     //reverse of a number
//     int n ;
//     cout<<"enter the number ";
//     cin>>n ; 
//     int reverse = 0 ;
//      while(n>0){
//         int lastdigit = n%10 ;
// reverse = reverse*10+lastdigit;
//    n=n/10;
//      }
//      cout<<reverse;

int n ; 
cin>>n;
int result = 0 ;
int originaln = n ;
while(n>0){
    int lastdigit = n%10 ;
    //result += lastdigit*lastdigit*lastdigit;
    result = result + lastdigit*lastdigit*lastdigit;
    n = n/10 ; 
}
cout<<result ;
if(result == originaln ){
    cout<<"the number is an amstrong number";
}
else{
    cout<<"the number is not an armstrong number";
}
}

