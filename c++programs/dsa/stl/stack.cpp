#include<iostream>
#include<stack>
using namespace std ;

int main(){
    stack<string> s ;

    s.push("sonu");
    s.push("sipun");
    s.push("adityaa");


    cout<<s.top()<<endl;
    s.pop();
    cout<<s.top()<<endl;

    cout<<s.size()<<endl;
    cout<<s.empty()<<endl;
    return 0 ; 
}