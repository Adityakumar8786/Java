#include<iostream>
#include<set>
using namespace std ;
int main(){

    //set is stl in which objects are added systematically 
    //only unique elements are present 
    set<int> s ;
    s.insert(5);
    s.insert(5);
    s.insert(9);
    s.insert(9);
    s.insert(2);
    s.insert(2);
    s.insert(1);
    s.insert(0);

    for(auto i : s){ 
        cout<<i;
    }

    //auto is a keyword that allows the compiler to automatically deduce the type of a variable 
    //from set 
    cout<<endl;
    cout<<"5 is present or not "<<s.count(5)<<endl;

    set<int> :: iterator it = s.begin();
    //iterator is used to intialize the element here it starts from s.begin()
    //not only in set but also in every where 


    s.erase(it);
    for(auto i : s){ 
        cout<<i;
    }
    return 0 ; 
}
