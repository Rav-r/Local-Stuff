#include <iostream>
using namespace std;

class items {
public:
    void factorial() {
        int n;
        cout << "Enter the number you want me to calculate factorial of: ";
        cin >> n;
        long long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        cout << "The factorial of " << n << " is " << fact << endl;
    }

    void EvenorOdd() {
        int n;
        cout << "Enter the number you want to check is even or odd: ";
        cin >> n;
        if (n % 2 == 0) {
            cout << n << " is even" << endl;
        } else {
            cout << n << " is odd" << endl;
        }
    }

    void isprime() {
        int n;
        cout << "Enter the number you want to check is prime or not: ";
        cin >> n;
        bool prime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        if (prime) {
            cout << n << " is a prime number" << endl;
        } else {
            cout << n << " is not a prime number" << endl;
        }
    }

    void reverse() {
        int n;
        cout << "Enter the number you want to reverse: ";
        cin >> n;
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        cout << "The reverse of the number is " << rev << endl;
    }

    void fibonacci() {
        int n;
        cout << "Enter the number of terms you want in fibonacci series: ";
        cin >> n;
        int a = 0, b = 1, c;
        cout << a << " " << b << " ";
        for (int i = 2; i < n; i++) {
            c = a + b;
            cout << c << " ";
            a = b;
            b = c;
       }
        cout << endl;
    }
	void feesbus() {
		int n;
		cout << "Enter the number to play feesbus if number divisible by 3 then print fees and if divisible by 5 then print bus and if divisible by 3 and 5 then print feesbus: ";
		cin >> n;
		if (n%3==0){
			cout << "fees" << endl;
		}
		else if (n%5==0){
			cout << "bus" << endl;
		}
		else if(n%3==0 && n%5==0){
			cout << "feesbus" << endl;
		}
		else{
			cout << "Check your number " << n << endl;
		}
	}

};

int main() {
    items obj;
    int ch;
    do {
        cout << "1. Factorial" << endl;
        cout << "2. Even or Odd" << endl;
        cout << "3. Prime or not" << endl;
        cout << "4. Reverse of a number" << endl;
        cout << "5. Fibonacci series" << endl;
		    cout << "6. Feesbus" << endl;
        cout << "7. Exit" << endl;
        cout << "Enter your choice: ";
        cin >> ch;
        switch (ch) {
            case 1: obj.factorial(); break;
            case 2: obj.EvenorOdd(); break;
            case 3: obj.isprime(); break;
            case 4: obj.reverse(); break;
            case 5: obj.fibonacci(); break;
            case 6: obj.feesbus(); break;
            case 7: exit(0);
            default: cout << "Invalid choice" << endl;
        }
    } while (ch != 7);
    return 0;
}
