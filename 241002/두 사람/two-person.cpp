#include <iostream>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    int a1;
    char a2;
    int b1; 
    char b2;

    cin >> a1 >> a2 >> b1 >> b2;

    if ((a1 >= 19 && b1 >= 19) || (a2 == 'M' && b2 == 'M')) {
        cout << 1;
    }
    else {
        cout << 0;
    }
    return 0;
}