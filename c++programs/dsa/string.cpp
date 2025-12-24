#include<iostream>
#include<string>
#include<algorithm>
using namespace std ;

int main(){
    string s1 = "aditya";
    string s2 = "kumar";

// s1.append(s2);
// cout<<s1;
//s2.clear();

cout<<s2.compare(s1); 
// The compare function in the string class is used to lexicographically compare the invoking string (s2) with the given string (s1). Here's how the comparison works:

// It compares the strings character by character using their ASCII values.
// It returns:
// 0 if both strings are equal.
// A negative value if the invoking string (s2) is lexicographically less than the given string (s1).
// A positive value if the invoking string (s2) is lexicographically greater than the given string (s1).
// Character-by-Character Comparison
// Let's compare the strings "kumar" (s2) and "aditya" (s1):

// Compare the first characters: 'k' (ASCII value 107) and 'a' (ASCII value 97). op will 107-97 = 10 
// Since 'k' > 'a', the comparison stops here.
// The result of s2.compare(s1) will be a positive value because 'k' is greater than 'a'.
// The exact value returned by compare is the difference between the ASCII values of the first non-matching characters. In this case:


if(s1.empty())
cout<<"string is empty";

s1.erase(0,3);//from 1st index 3 index will be cleared 

cout<<s2.find("mar");

s1.insert(0,"adi");
cout<<s1;


s1.substr(0,5);

string s = "234";
int x = stoi(s); 

s = to_string(x);

sort(s1.begin(),s1.end());
cout<<s1; 
return 0 ;

}