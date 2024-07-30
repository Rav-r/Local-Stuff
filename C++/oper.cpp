#include <iostream>
using namespace std;

class Complex {
private:
    float real;
    float img;

public:
    Complex(float r, float i){
      real = r;
      img = i;
    }
    Complex() {
    }
    void display() {
        cout << real << " + " << img << "i";
    }

    Complex operator+(Complex& other) {
        Complex result;
        result.real = this->real + other.real;
        result.img = this->img + other.img;
        return result;
    }
};

int main() {
    Complex c1(2, 3);
    Complex c2(4, 5);
    Complex sum = c1 + c2;

    cout << "Sum of ";
    c1.display();
    cout << " and ";
    c2.display();
    cout << " is ";
    sum.display();
    cout << endl;

    return 0;
}

