#include<iostream>
#include<queue>
using namespace std ;
int main(){

priority_queue<int,vector <int> ,greater<int> > p ;
p.push(5);
p.push(0);
p.push(4);
p.push(1);

int n = p.size();
for(int i = 0 ; i < n ; i++){
cout<<p.top()<<endl;
p.pop();
}
cout<<p.empty();

    return 0 ;
}