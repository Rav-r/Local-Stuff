#include<iostream>
using namespace std;
class complexi{
  int real;
  int img;
  public:
  complexi(int a, int h){
    real = a;
    img = h;
  }
  complexi(complexi k, complexi l){
    real = k.real + l.real;
    img = k.img + l.img;
  }
  void display(){
    cout<<real<<" + "<<img<<"i";
  }
};
int main(){
  int t,y,u,i;
  cout<<"Enter the real and imaginary value of number 1";
  cin>>t>>y;
  cout<<"Enter the real and imaginary value of number 2";
  cin>>u>>i;
  complexi c(t,y);
  complexi n(u,i);
  complexi b(c,n);
  b.display();
  return 0;
}
