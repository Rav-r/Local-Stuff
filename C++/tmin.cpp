#include<iostream>
using namespace std;
template<class T>
T min(T a[], int n){
    T m = a[0];
    for(int i=1;i<n;i++){
        if(m>a[i]){
            m = a[i];

        }

    }
    return m;
}
template<class T>
void display(T a[],int n){
    for(int i = 0;i<n;i++){
        cout<<a[i]<<" ";
    }
    cout<<endl;
}
int main(){
    int a[5] = {1,2,3,4,5};
    float b[6] = {1.2,3.4,5.6,7.8,9.8,6.7};
    char c[4] = {'f','d','t','u'};
    cout<<"Arrays are"<<endl;
    display(a,5);
    display(b,6);
    display(c,4);
    cout<<"Minimum elements in the arrays respectively are"<<endl;
    cout<<min(a,5)<<endl;

    cout<<min(b,6)<<endl;
    cout<<min(c,4)<<endl;


}
