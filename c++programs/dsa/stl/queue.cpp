#include<iostream>
#include<queue>

using namespace std ;
int main(){
    queue<string> q; 
    q.push("bhai");
    q.push("bhauni");
    q.push("kaha");

 //   cout<<q.top();   applicable only on stack this is invalid in queue 
    cout<<q.front()<<endl;
    cout<<q.size()<<endl;
    cout<<q.empty()<<endl;
    
}
