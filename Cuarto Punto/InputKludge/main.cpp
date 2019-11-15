#include <iostream>

using namespace std;

int main()
{
    int a;
    int b[10];
    int c;
    for(int i = 0; i<10; i++){
    cout << "Ingrese el indice a modificar" << endl;
    cin>>a;
    cout << "Ingrese el valor a agregar" << endl;
    cin>>c;
    b[a] = c;
    }
    for(int i = 0; i<10; i++){
    cout << b[i] << endl;
    }
    return 0;
}
