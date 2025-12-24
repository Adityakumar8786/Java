#include<iostream>
#include<vector>
using namespace std ;
int main(){
    int n,m ; 
int arr[n]; //s.c = O(n)
for(int i = 0 ; i<n ; i++){ // this has no effect in s.c but t.c is also O(n)
    cout<<"hello world";
}

int c = 5 ; // this is called constant space complexity O(1);
int arr[10]; ; // this is called constant space complexity O(1);


vector<int> a ; // now sc is zero because nothing size is given
vector<int> b ;

for(int i = 0 ; i <n ; i++){
    for(int j = 0 ; j <m ; j++){
    a.push_back(i);
    b.push_back(i);
}
}
//now the s.c will m*n for a and again m*n for b so s.c will O(2nm) = O(nm)
// t.c is O(nm)


//s.c for arr of same size 
//int a[n]; int b[n]; int c[n];
//O(3n) = O(n)

int s[n][n/2]; //s.c will O(n*n/2)
for(int i = 0 ; i <n ; i *=2){
    for(int j = 0 ; i <n/2 ; j++){
    s[i][j]++;
}
}
//t.c will O(log n *n/2)

for(int i = 0 ; i <n ; i +=i){
cout<<"hello world";
}
//i +=i  same as i *= 2 ; t.c is O(log n )

for(int i = 1 ; i*i<n; i += i){
    for(int j = 1 ; j<i ; j++){
cout<<"hello world";
    }
}
//i = 1   j = 0  1 times 
//i = 4   j = 0   4times 
//i = 8   j = 0   8times 
//i = 16   j = 0   16times 
//i = root n    j = 0   root n times 

// total times of execution will be 1+4+8+16.......rootn times that will be log root n approx 
return 0 ; 
}