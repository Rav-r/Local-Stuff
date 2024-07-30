// program to show use of static member function
#include <iostream>
using namespace std;
class A
{
    static int x;
    int y;
public:
    static void setX(int i)
    {
        x = i;
    }
    void setY(int i)
    {
        y = i;
    }
    void print()
    {
        cout << "x = " << x << " y = " << y << endl;
    }
};
int A::x;
int main()
{
    A a1, a2;
    a1.setX(10);
    a2.setY(20);
    a1.print();
    a2.print();
    return 0;
}



