#include<iostream>
using namespace std;
class Distance{
  int km;
  int m;
  public:
  Distance(int k, int b){
    km = k;
    m = b;
  }
  Distance add(Distance other){
    Distance temp(0,0);
    temp.km = km + other.km;
    temp.m = m + other.m;
    if(temp.m>=1000){
      temp.km = temp.km + temp.m/1000;
      temp.m = temp.m%1000;
    }
    return temp;
  }
  void display(){
    cout<<"Total distance covered is "<<km<<" kilometers and "<<m<<" meters"<<endl;
  }
};
int main(){
  int k1, m1, k2, m2;
  cout<<"Enter the distance for first destination in km and m: ";
  cin>>k1>>m1;
  cout<<"Distance is "<<k1<<" kilometers and "<<m1<<" meters."<<endl;
  cout<<"Enter the distance for second destination in km and m: ";
  cin>>k2>>m2;

  cout<<"Distance is "<<k2<<" kilometers and "<<m2<<" meters."<<endl;
  Distance d1(k1, m1);
  Distance d2(k2, m2);
  Distance d3 = d1.add(d2);
  d3.display();
  return 0;
}

