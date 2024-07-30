#include<iostream>
using namespace std;
int add(int arr[], int n) {
    if(n <= 0) {
        return 0;
    }
    return add(arr, n-1) + arr[n-1];
}
int main() {
    cout<<"Enter the number of elements in the array: ";
    int n;
    cin>>n;
    int arr[n];
    for(int i = 0; i < n; i++) {
        cout<<"Enter the Element "<<i+1<<":";
        cin>>arr[i];
    }
    cout<<"The sum of the elements of the array is: "<<add(arr, n)<<endl;


    return 0;
}
