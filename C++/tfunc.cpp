#include<iostream>
using namespace std;
template <class T>
void swap(T a, T b){
  T Temp = a;
  a = b;
  b = Temp;
};
int main(){
    cout<<"Enter 2 integer values"<<endl;
    int a, b;
    cin>>a;
    cin>>b;
    cout<<"Enter 2 float values"<<endl;
    float m, n;
    cin>>m;
    cin>>n;
    cout<<"Before swap values are: a ="<<a<<" b="<<b<<" m="<<m<<" n="<<n<<endl;
    swap(a,b);
    swap(m,n);

    cout<<"After swap values are: a ="<<a<<" b="<<b<<" m="<<m<<" n="<<n<<endl;
}

