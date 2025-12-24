#include<iostream>
#include<map>
using namespace std ;
int main(){
    map<int,string> m ;
    m[1] = "sonu";
    m[2] = "sipun";
    m[3] = "baba";
    m[4] = "mami";
    m.insert({5,"bheem"});
    for(auto i : m){
        cout<<i.first<<" "<<i.second<<endl;
    }

    cout<<"3 is present or not "<< m.count(1)<<endl;

auto it =  m.find(4);
    for(auto i = it ; i!= m.end(); i++ ){
        cout<<(*i).first<<endl;
    }
    return 0 ; 
}