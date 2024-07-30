#include<iostream>
using namespace std;
class Base{
  int a;
  public:
  virtual void getData();
  
  void display();
  class derived public Base{
    int b;
    public:
    void readData();
    void showData();
  };
  int main(){
    derived d;
    d.getData(2);
    d.display();
    derived *ptr;
    ptr = &d;
    ptr->readData(3);
    ptr->showData();
    return 0;
  }
};


