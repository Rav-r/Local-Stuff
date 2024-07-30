// program to implement bubble sort using function template
#include <iostream>
using namespace std;
class bubble
{
public:
    template <class T>
    void
    sort(T a[], int n)
    {
        for (int i = 0; i < n - 1; i++)
        {
            for (int j = 0; j < n - i - 1; j++)
            {
                if (a[j] > a[j + 1])
                {
                    T temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
    template <class T>
    void
    display(T a[], int n)
    {
        for (int i = 0; i < n; i++)
        {
            cout << a[i] << " ";
        }
        cout << endl;
    }
};
int main()
{
    bubble b;
    int a[] = {10, 50, 30, 40, 20};
    float b1[] = {10.5, 50.5, 30.5, 40.5, 20.5};
    char c[] = {'e', 'a', 'u', 'i', 'o'};
    b.sort(a, 5);
    b.display(a, 5);
    b.sort(b1, 5);
    b.display(b1, 5);
    b.sort(c, 5);
    b.display(c, 5);
    return 0;
}

