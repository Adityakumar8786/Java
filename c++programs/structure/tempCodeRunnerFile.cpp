#include<iostream>
#include<climits>
using namespace std ;
int main(){
    int sonu[]={1,2,3,4,5,6,7,8,9};
    int n = sizeof(sonu)/sizeof(sonu[0]);
    int mx = INT_MIN;
    for(int i = 0 ; i<n; i++){
        if(mx<sonu[i]) mx = sonu[i];
        // mx = min(mx,sonu[i]);
    }
    int smx = INT_MIN;
    for(int i = 0 ; i<n; i++){
        if(smx<sonu[i] && sonu[i] != mx ) smx = sonu[i];
        // mx = min(mx,sonu[i]);
    }
    int tmx = INT_MIN;
    for(int i = 0 ; i<n; i++){
        if(tmx<sonu[i] && sonu[i] != mx && sonu[i] != smx ) tmx = sonu[i];
        // mx = min(mx,sonu[i]);
    }
    
    cout<<tmx ;
    return 0 ;
}