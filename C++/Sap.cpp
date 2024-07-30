//program to swap 2 numbers with call by reference and call by value using classes
#include<iostream>
using namespace std;
class Swapping{
	public:
          
void callbyref(int *c,int *d){
  cout<<"Enter the value of c and d"<<endl;
  cin>>*c>>*d;
  cout<<"Before swapping(ref)"<<endl;
  cout<<"c="<<*c<<" d="<<*d<<endl;
  int temp;
  temp=*c;
  *c=*d;
  *d=temp;
  cout<<"After swapping(ref)"<<endl;
  cout<<"c="<<*c<<" d="<<*d<<endl;
}
void callbyvalue(int c,int d){
  cout<<"Enter the value of c and d"<<endl;
  cin>>c>>d;
  cout<<"Before swapping(val)"<<endl;
  cout<<"c="<<c<<" d="<<d<<endl;
  int temp;
  temp=c;
  c=d;
  d=temp;
  cout<<"After swapping(val)"<<endl;
  cout<<"c="<<c<<" d="<<d<<endl;
}
};

     


  

int main() {
	Swapping s;
	int c,d;
	s.callbyref(&c,&d);
	s.callbyvalue(c,d);
	return 0;
}

   
       
