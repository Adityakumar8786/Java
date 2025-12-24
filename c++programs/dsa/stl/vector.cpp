#include<iostream>
#include<vector>
using namespace std ;
int main(){
    vector<int>numbers;
    int value ; 
    for(int i = 0 ; i< 5 ; i++){
        cin>>value ;
        numbers.push_back(value);
    }
    for(int i = 0 ; i< 5 ; i++){
        cout<<numbers[i];
    }


    //vector<int>numbers1={1,2,3,4,5,6};



  //  vector<int>numbers1(10,5);//10 times 5 
    vector<int>numbers1(10);// same thing as up 
    fill(numbers1.begin(),numbers1.end(),5);
    for(int i = 0; i < numbers1.size();i++){
        cout<<numbers1[i]<<endl;
    }

    vector<int>numbers3 ;
    numbers3.push_back(1);//size 1 capacity 1 
    numbers3.push_back(2);//size 2 capacity 2
    numbers3.push_back(3);//size 3 capacity 4 doubles its capacity 4 num can be stored
    numbers3.push_back(4);//size 4 capcity  4 as there previously capcity 4 its not increase its capacity
    numbers3.push_back(5);//size 5 capcity  8 again doubles as there previously capcity 4 its not increase its capacity
//next size 6 cap 8 till size 8 cap 8 and then 
//size 9 cap 18 doubles its capcity 
numbers3.pop_back();//op will be size 4 capacity 8 
//size will decrease but capacity not once created 

cout<<"size"<<numbers3.size()<<endl;
cout<<"capacity"<<numbers3.capacity()<<endl;
    return 0 ; 

}