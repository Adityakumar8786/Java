#include<iostream>
#include<array>
using  namespace std ;
int main(){
    array <int,4> a = {1,2,3,4};
    cout<<a.size()<<endl;
    for(int i = 0 ; i < a.size(); i++){
        cout<<a[i]<<endl;
    }

    cout<<"the second element "<<a.at(1)<<endl;
    cout<<"empty or not"<<a.empty()<<endl;
    cout<<"1st element "<<a.front()<<endl;
    cout<<"last element "<<a.back()<<endl;
    return 0 ; 
}