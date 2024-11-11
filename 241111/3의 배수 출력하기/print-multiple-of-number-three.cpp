#include <iostream>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    int n;
    int i = 2; 
    int a = 3;
    cin >> n;
    
    while (a <= n) {
        cout << a << " ";
        a = 3 * i;
        i++;
    }
    return 0;
}