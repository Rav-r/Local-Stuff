import java.lang.*;
import java.util.Scanner;
public class gcd {
	public static void main(String args[]){

		// program to find out greatest common divisor among 2 numbers

		Scanner sc = new Scanner(System.in);

	    System.out.print("Enter First number :");
		int x = sc.nextInt();

		System.out.print("Enter Second number :");
		int y = sc.nextInt();

		// to make program more flexible with input independency
        // declaring 2 variables for storing larger number 

        int a;
		int b;



		if(x>y){
			a = x;
			b = y;
		}
		else {
			a = y;
			b = x;
		}

		int g = findgcd(a,b);

		// after this part of code a will store the gcd which was larger number at first


		System.out.println(" Greatest common factor among these 2 integers is "+g);
	}

	public static int findgcd(int a , int b) {

		while(b!=0){
			int temp = b;
			b=a%b;
			a=temp;
		}
		return a;
	}

}


