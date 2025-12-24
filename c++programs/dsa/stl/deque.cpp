#include<iostream>
#include<deque>
using  namespace std ;
int main()
{
deque<int> d ;
d.push_back(1);
d.push_front(2);

for(int i : d){
    cout<<i<<endl;
}

    cout<<endl ;

d.pop_back();
for(int i :d){
    cout<<i<<endl ;
}
    cout<<endl ;

d.push_back(1);
d.pop_front();
for(int i :d){
    cout<<i<<endl ;
}


d.push_front(2);
cout<<"the 1st element is "<<d.at(0)<<endl;

cout<<d.front()<<endl;
cout<<d.back()<<endl;
cout<<d.empty()<<endl;
d.erase(d.begin(),d.begin()+1);
//starts from d.begin and erase 1 element 
cout<<endl;
for(int i :d){
    cout<<i<<endl ;
}
    return 0 ;
}