#include<iostream>
using namespace std;
 typedef struct pokemon {
    int hp ;
    int speed ;
    int attack ;
    char tier ;
    char name[15];
}pokemon;


void change (pokemon *p){
(*p).hp = 109;

}
int main(){
    pokemon pikachu ;
    pokemon *x = &pikachu ;
    pikachu.hp = 40 ; 
    cout<< x<<endl;
    cout<<&pikachu.hp<<endl;
    cout<<&pikachu.speed<<endl;
    cout<<&pikachu.attack<<endl;
    cout<<&pikachu.tier<<endl;
    cout<<&pikachu.name<<endl;

    //cout<< *x; invalid 
    // as it has so many variablea like int char string just like array the pointer stores its 1st index's adess in this also the pointer will store the adress of 1st variable i.e hp


    // (*x).hp = 70 ; 
    // cout<<pikachu.hp;

    change(x);
    cout<<pikachu.hp;
     return 0 ; 
} 



