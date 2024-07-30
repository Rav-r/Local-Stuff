import java.util.*;
import java.lang.*;
public class menu{
	public static void main(String args[]){
		items obj = new items();
		Scanner sc = new Scanner(System.in);
		int ch;
		do{
			System.out.println("1. Factorial");
			System.out.println("2. Even or Odd");
			System.out.println("3. Prime or not");
			System.out.println("4. Reverse of a number");
			System.out.println("5. Fibonacci series");
			System.out.println("6. Exit");
			System.out.print("Enter your choice: ");
			ch = sc.nextInt();
			switch(ch){
				case 1: obj.factorial();
						break;
				case 2: obj.EvenorOdd();
						break;
				case 3: obj.isprime();
						break;
				case 4: obj.reverse();
						break;
				case 5: obj.fibonacci();
						break;
				case 6: System.exit(0);
				default: System.out.println("Invalid choice");
			}
		}while(ch!=6);
	}
}
class items{
	void factorial(){
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number you want me to calculate factorial of: ");
		n = sc.nextInt();
		long fact = 1;
		for(int i = 1; i<=n; i++){
			fact*=i;
		}
		System.out.println("The factorial of "+n+ " is "+fact);
	}
	void EvenorOdd(){
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number you want to check is even or odd : ");
		n = sc.nextInt();
		if(n%2==0){
			System.out.println(n+" is even");
		}
		else{
			System.out.println(n+" is odd");
		}

	}
	void isprime(){
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter the number you want ot check is prime or not: ");
		n = sc.nextInt();
		boolean prime = true;
		for(int i = 2; i<n;i++){
			if(n%i==0){
				prime = false;
				break;
			}
		}
		if(prime){
			System.out.println(n+" is a prime number");
		}
		else{
			System.out.println(n+" is not a prime number");
		}
	}
	void reverse(){
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter the number you want to reverse: ");
		n = sc.nextInt();
		int rev = 0;
		while(n!=0){
			rev = rev*10 + n%10;
			n = n/10;
		}
		System.out.println("The reverse of the number is "+rev);
	}
	void fibonacci(){
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter the number of terms you want in fibonacci series: ");
		n = sc.nextInt();
		int a = 0, b = 1, c;
		System.out.print(a+" "+b+" ");
		for(int i=2; i<n; i++){
			c = a+b;
			System.out.println(c+" ");
			a=b;
			b=c;
		}
	}

}
