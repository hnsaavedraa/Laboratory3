#include <iostream>

using namespace std;

int main()
{   int x = 0;
    LOOP:
    x = x+1;

    cout << x <<" al cuadrado = "<<x*x<< endl;
    if(x>= 100){
        goto COMPLETE;
    }
    goto LOOP;
    COMPLETE:
    cout<<"Programa completado"<< endl;
    return 0;
}
