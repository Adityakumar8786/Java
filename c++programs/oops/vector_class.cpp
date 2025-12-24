#include<iostream>
using namespace std ;
class vector{
    public:
    int size ;
    int capacity ;
    int* arr ;
    vector(){
        size = 0 ; //intialization in only in default constructor 
        capacity = 1;
        arr = new int[1];//dynamic array in default constructor
    }
    
    void add(int element){
    if(size == capacity){
      capacity = capacity*2;
      int * arr2 = new int[capacity];
      for(int i = 0 ; i < size ; i++){
        arr2[i] = arr[i];
      }
      arr = arr2 ; 
    }
    
     arr[size] = element ;
size ++ ;
    
    
    
    } 
    void print(){
        for(int i = 0 ; i<size ; i++){
            cout<<arr[i]<<" ";
        }
        cout<<endl;
    }
    ~vector(){
        delete[] arr ;
    }
  void  remove(){
    if(size == 0 ){
cout<<"array is empty";
    }
size -- ;
    }
};
int main(){
    vector v1;
    v1.add(5);
    v1.print();
    v1.add(6);
    v1.print();
    v1.add(7);
    v1.print();
    v1.add(8);
    v1.print();
    v1.remove();
    v1.print();
    return 0 ; 
}
