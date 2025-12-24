#include<iostream>
using namespace std ; 
class num{

public:

num(){
    cout<<"this is constructor\n";
}

~num(){
    cout<<"this is destructor\n";
}
};

int main(){
    {
        cout<<"entering to block"<<endl;
        num n1 ;
        cout<<"existing the block"<<endl;
    }
    return 0 ; 
}


//An implicit call happens automatically when:

// Constructor: An object is created using the default syntax (ClassName objectName;).
// Destructor: An object goes out of scope or is deleted for dynamic memory.

// An explicit call is when the constructor or destructor is called manually,
// which is rarely done but can occur in certain scenarios.

//ex 
// num obj ;
//obj.num() // explict call 
//

// num obj ;
//op - this is a constructor // implict call 
