#include <iostream>
#include <vector>
#include <algorithm> // For lower_bound
using namespace std;

int main() {
    vector<int> v = {1, 3, 6, 5, 7, 9};

    auto it = lower_bound(v.begin(), v.end(), 5);

    if (it != v.end()) {
        cout << "Lower bound for 5 is at position: " << (it - v.begin()) << endl;
        cout << "Value: " << *it << endl;
    } else {
        cout << "5 is greater than all elements" << endl;
    }

    return 0;
}

//op will 6 as the 6 is greater than 5 and it comes 1st in the vector 