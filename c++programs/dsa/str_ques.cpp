#include<iostream>
#include<algorithm>
#include<string>
#include<cctype>

using namespace std ; 
int main(){
    //converting to lower case 
    string str = "afhSfbkk";
    cout<<'a'-'A';//32;

    for(int i = 0 ; i < sizeof(str) ; i++){
        if(str[i] >='a' && str[i] <= 'z')
        
        str[i] -= 32;
    }
    cout<<str; 

    //converting to uppercase 
    for(int i = 0 ; i < sizeof(str) ; i++){
        if(str[i] >='A' && str[i] <= 'Z')
        
        str[i] += 32;
    }
    cout<<str<<endl; 

    transform(str.begin(),str.end(),str.begin(),::toupper);//pasiing full string str.begin(),str.end() and telling the postion where to convert uppercase 
    cout<<str<<endl;


    //forming a largest number from a numeric string 
    string num = "234";
    sort(num.begin(),num.end() , greater<int>());
    cout<<num;

    
    return 0 ; 
}