#include<iostream>
using namespace std;
class base {
public:
    base() {
        cout << "Constructor of base class" << endl;
    }
    virtual void display() {
        cout << "Virtual function of base class" << endl;
    }
};
class derived : public base {
public:
    derived() {
        cout << "Constructor of derived class" << endl;
    }
    void display() {
        cout << "Virtual function of derived class" << endl;
    }
};
int main() {
    base* b;
    derived d;

    b = &d;
    b->display();
    return 0;
}

