//program to implement pure virtual function with 4 multilevel inheritance
#include <iostream>
using namespace std;
class A
{
public:
    virtual void show() = 0;
};
class B : public A
{
public:
    void show()
    {
        cout << "B" << endl;
    }
};
class C : public B
{
public:
    void show()
    {
        cout << "C" << endl;
    }
};
class D : public C
{
public:
    void show()
    {
        cout << "D" << endl;
    }
};
int main()
{
    D d;
    d.show();
    return 0;
}

