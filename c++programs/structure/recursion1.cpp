#include <iostream>
using namespace std;
// factorial of number
//  int factorial (int n ){
//      if(n == 0 || n==1){
//          return 1 ;
//      }
//      else{
//      return n*factorial(n-1);
//      }
//  }

// print n to 1

void decreasing(int n)
{
    if (n > 1)
    {
        cout << n << endl;
        decreasing(n - 1);
    }
}

// print one to n
void increasing(int n)
{
    if (n >= 1)
    {
        increasing(n - 1);
        cout << n << endl;
    }
}

// print 1 to n before recursion
void anincreasing(int x, int n)
{
    if (x > n)
        return;
    cout << x << endl;
    anincreasing(x + 1, n);
}


//print the sum of 1 to n 
// int sum(int n){
//    if (n == 0 )return 0;
 
//  return n+sum(n-1);

// }


//print sum 1 to n parameterised
int summ(int n , int s ){
    if(n==0) return s ;
    
    return summ(n-1,s+n); 
}



int main()
{
    //  decreasing(7);
    //  increasing(7);
    // anincreasing(1,7);


    // int k =sum(5);
    // cout<<k;

    int k =summ(5,0);
    cout<<k ;
    return 0;
}