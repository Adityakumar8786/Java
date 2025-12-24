#include <iostream>
#include <vector>
#include <algorithm> // For lower_bound
using namespace std;

int main() {
    vector<int> v = {1, 3, 5, 7, 9};

    auto it = upper_bound(v.begin(), v.end(), 5);

    if (it != v.end()) {
        cout << "upper bound for 5 is at position: " << (it - v.begin()) << endl;
        cout << "Value: " << *it << endl;
    } else {
        cout << "5 is greater than all elements" << endl;
    }

    return 0;
}
//because 7 is the first element that is greater than 5.