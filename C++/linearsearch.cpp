#include<iostream>
using namespace std;
int main()
{
    int n, key;
    cout<<"Enter the number of elements in the array: ";
    cin>>n;
    int arr[n];
    for(int i=0; i<n; i++)
    {
        cout<<"Enter element "<<i+1<<": ";
        cin>>arr[i];
    }
    cout<<"Enter the element to be searched: ";
    cin>>key;
    int i;
    for(i=0; i<n; i++)
    {
        if(arr[i]==key)
        {
            cout<<"Element found at index "<<i<<endl;
            break;
        }
    }
    if(i==n)
    {
        cout<<"Element not found in the array"<<endl;
    }
    return 0;
}
