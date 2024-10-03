#include <iostream>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    int mw, age;
    cin >> mw >> age;
    
    if (mw == 0) {
        if (age >= 19) {
            cout << "MAN";
    } else {
        cout << "BOY";
    }
    }
    else {
        if (age >= 19) {
            cout << "WOMAN";
        }
        else {
            cout << "GIRL";
        }
    }

    return 0;
}