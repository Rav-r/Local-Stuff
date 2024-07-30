#include<iostream>
using namespace std;
class Student{
  string name;
  double fees;
  int rollno;
  string branch;
  public:
  Student(string n, double f, int r, string b){
    name = n;
    fees = f;
    rollno = r;
    branch = b;
  }
  void student_validator(){
    if(fees < 0){
      cout<<"Invalid fees"<<endl;
    }
    else{
      cout<<"Valid fees"<<endl;
    }
  }
  void display(){
    cout<<"Name of the Student "<<Student.s<<" is : "<< name<<endl;
    cout<<"Fees need to be submmited for student "<<a<<" is : "<<fees<<endl;
    cout<<"Rollno of student "<<a<<" is : "<<rollno<<endl;
    cout<<"Branch of a student "<<a<<" is : "<<branch;
  }
};
int main(){
  Student ab("Darth",30000.89,001,"C.E");
  ab.display(ab);
}

