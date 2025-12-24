#include<iostream>
#include<queue>

using namespace std ;
int main(){
    priority_queue<int> q; //it is the que in which 1st element is always greatest 
    q.push(4);
    q.push(2);
    q.push(5);

    int n = q.size();
for(int i = 0 ; i < n ; i++){
    cout<<q.top();
    q.pop();
}
cout<<endl;
    cout<<q.size()<<endl;
    cout<<q.empty()<<endl;//it will show empty becuse we poped out all element 
    
}
