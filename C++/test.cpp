#include<iostream>
using namespace std;
class Time{
    int h;
    int m;
    public:
    void getdata(int hour, int min){
        h = hour;
        m = min;

    }
    void display(){
        cout<<"Total time is "<<h<< " : "<<m<<endl;
    }
    void sum(Time x , Time y){
        h = x.h+y.h;
        m = x.m+y.m;
        h = h+m/60;
        m = m%60;
    }
};
int main(){
    Time t1 = Time();
    Time t2 = Time();
    Time t3 = Time();
    t1.getdata(3,25);
    t2.getdata(5,50);
    t3.sum(t1,t2);
    t3.display();
    return 0;
}
