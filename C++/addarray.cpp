#include<stdio.h>
using namespace std;
int main()
{
    int n;
    printf("Enter the size of the array: ");
    scanf("%d", &n);
    int arr[n];
    for(int i=0; i<n; i++)
    {
        printf("Enter the element %d: ", i+1);
        scanf("%d", &arr[i]);
    }
    int sum=0;
    for(int i=0; i<n; i++)
    {
        sum+=arr[i];
    }
    printf("The sum of the elements of the array is: %d\n", sum);
    return 0;
}
