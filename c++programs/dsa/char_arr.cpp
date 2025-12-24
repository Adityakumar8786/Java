#include<iostream>
using namespace std ; 

int main(){
    char arr[] = "apple";
    int i = 0 ; 
    while ( arr[i] != '\0'){
        cout<<arr[i]<<endl ; 
        i++; 
    }

for(int i = 0 ; i<sizeof(arr); i++){
    cout<<arr[i]<<endl;
    cout<<i<<endl; 
}


/// checking pallindome 


// int n ;
// cin>>n ;
// char name[n+1];
// cin>>name;

// bool check = 1 ; 

// for(int i =0 ; i<n ; i ++){
//     if(name[i] != name [n-1-i]){
//         check = 0 ;
//     }
// }

// if(check == true ){
//     cout<<"word is pallindrome"; 
// }




// A buffer is a temporary storage area in memory used to hold data 
// When you use cin to read input in C++, the data is first stored in a buffer before your program processes it
// cin then retrieves data from this buffer for processing.
// the buffer may still contain extra characters, like newline('\n'),cin.ignore() helps clear these extra characters from the buffer.





// checking the largest word in the sentence 



    return 0 ; 
}