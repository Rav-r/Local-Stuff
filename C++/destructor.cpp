#include <iostream>

using namespace std;

class Student {
  int rollNumber;
  string name;
  
  public:
  Student(int rn, string n) {
    rollNumber = rn;
    name = n;
    cout << name << " has been constructed." << endl;
  }

  ~Student() {
    cout << name << " has been destroyed." << endl;
  }

  void display() {
    cout << name << "'s roll number is " << rollNumber << "." << endl;
  }
};

int main() {
  Student vks = Student(39, "Vidhu Kant Sharma");

  vks.display();

  return 0;
}
