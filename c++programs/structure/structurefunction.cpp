#include<iostream>
#include<cstring>
using namespace std ;

typedef struct pokemon {
    int hp ;
    int speed ;
    int attack ;
    char tier ;
    char name[15];
}pokemon;


int fun(pokemon p){
    cout<<p.name;
    return 0 ;
}


void change(pokemon p ){
    p.attack=60;
    p.hp=70;
    p.speed=80;
    p.tier='c';
    strcpy(p.name,"sipun");
}

int main(){

pokemon pikachu;
//pokemon pikachu = {60,70,80,'a',"sonu"};         in order 


pikachu.attack=30;
pikachu.hp=40;
pikachu.speed=50;
pikachu.tier='a';
strcpy(pikachu.name,"sonu");
change(pikachu);
cout<<pikachu.attack<<endl;
cout<<pikachu.hp<<endl;
cout<<pikachu.name<<endl;
cout<<pikachu.tier<<endl;
cout<<pikachu.speed<<endl;
// structures are pass value 
//fun(pikachu);

}