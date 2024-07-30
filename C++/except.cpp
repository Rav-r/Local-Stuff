#include<iostream>
using namespace std;
int main(){
  cout<<"Enter values  of a and b"<<endl;
  int a,b;
  cout<<"a =";
  cin>>a;
  cout<<"b=";
  cin>>b;
  int c = a/b;
  try{
      if(b!=0){
          cout<< "c is"<<c<<endl;
      }
      else{
          throw b;
      }

  }
  catch(int b){
      cout<<"Exception occured invalid input";
  }
}

  
