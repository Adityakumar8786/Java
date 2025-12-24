#include<iostream>
#include<vector>
#include<algorithm>
using namespace std ;
int main(){

vector <int> v ;
v.push_back(1);
v.push_back(7);
v.push_back(8);
v.push_back(9);
v.push_back(4);

int a , b ;
cout<<max(a,b);
cout<<min(a,b);

swap(a,b);


string s = "sonu";
reverse(s.begin(),s.end());
cout<<s ;

rotate(v.begin(),v.begin()+1,v.end());
for(auto i :v){
    cout<<i ; 
}cout<<endl;
//The element 2 (at v.begin() + 1) will be the new first element.
//The element 1 (at v.begin()) will be moved to the end of the vector.

rotate(v.begin(),v.begin()+2,v.end());
for(auto i :v){
    cout<<i ; 
}
// The elements 3, 4, 5 (starting from v.begin() + 2) will become the first elements of the vector.
// The elements 1, 2 (the elements before v.begin() + 2) will be moved to the end.
return 0 ; 
}