#include<iostream>
using namespace std ; 
int main(){
    int n , m; 
    for (int i = 0 ; i < n ; i++){
        cout<<"i will"<<endl;
    }
    // the loop will execute n times so no of operations n 
   // time complexity is O(n)

for (int i = 0 ; i < n ; i+= 2){
        cout<<"i will"<<endl;
    }
//i = 0,2,4,6,8,10     
// the loop will execute n/2 times so no of operations n/2 
//T.C = O(n/2) which is similar to O(n)
// because O(k*n) = O(n); where k is a constant 
//O(2n) = O(n)   O(n/10) =O(n);


for (int i = 0 ; i < n+100; i+= 2){
        cout<<"i will"<<endl;
    }

//no of operation is n+100
//T.C is O(n+100) = O(n);
//O(n+K) = O(n);

//O(n^3) != O(n) *** 
//O(n^2+n/2) = O(n^2+n)because 2 was const so removed
//now O(n^2+n) = O(n^2) because n has lower power than n square so n is removed 
//O(n^3+100n) = O(n^3) 
//O(n^1/2 + n^1/4) = O(n^1/2);

for (int i = 1 ; i < n+100; i++){
        cout<<"i will"<<endl;
        i--;
    }

//the loop will executed infinity times because i will always one
//this is called the time limit exceed error (TLE)

for (int i = 1 ; i <= n; i*=2){
        cout<<"i will"<<endl;
    }
//i will 1 2 4 8 16 i.e 2^x but it should not limit of n 
//2^x <= n 
//  terms willl be 2^0,2^1,2^2,2^3,2^4,2^5 ....2^x = x+1 terms 
//T.c is O(x+1) = O(x);
//2^x <= n taking log both sides x is log n base 2 (base 2 can be removed)
// x is logn / log 2 so t.c O(logn/log2) = O(logn)****

for (int i = 1 ; i <= n; i++){
    for (int j = i+1 ; i <= m; j++){
        cout<<"i will"<<endl;
    }
    }
    // i = 0    j = 1,2,3,4.......m
    // i = 1    j = 2,3,4.......m
    // i = 2   j = 3,4.......m
    // i = 3    j = 4,5.......m
    // i = n    j = n+1 , .... m 
    // total execution m+(m-1)+(m-2)+(m-3)+(m-4).......+(m-n+1)
    // total execution m+(m-1)+(m-2)+(m-3)+(m-4).......+(m-n) + 1
    // total execution mn - n(n+1)/2 +1 
    // then calculate 
}