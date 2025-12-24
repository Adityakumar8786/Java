#include<iostream>
using namespace std ;

class cricketer {//parent 
public :
int runs ;
int wickets ;
int matches ;
};
class engineer {//parent 
public :
int  experience;
int  language;
};

class player: public engineer, public cricketer{//child
    public:
    string name ;
};

int main(){
   player sourav ;
   sourav.experience;
   sourav.language;
   sourav.matches;
   sourav.name;
   sourav.wickets;
   sourav.runs;
return 0 ;
}

//compile time error examples serror caught during compile timing 
//ex semicolon missing syntax error 

// run time error examples can't caught during compiling but caught during run time 
//ex some number divided by zero etc or float instead of integer