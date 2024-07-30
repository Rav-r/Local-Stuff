import java.lang.*;
class swapping {
	public static void main (String args[]){
		int a=5,b=10;
		System.out.println("Before Swapping(callbyvalue) numbers are :");
		System.out.println("a="+a+ ",b="+b);

		callbyvalue(a,b);
	/*	System.out.println("After Swapping numbers are :");
		System.out.println("a="+a+ ",b="+b);*/

		int numbers[] = {5,10};
		System.out.println("Before Swapping(callbyreference)  numbers are : ");
		System.out.println("number1="+numbers[0]+ ",number2="+numbers[1]);
		
	   	callbyreference(numbers);

		System.out.println("After Swapping numbers are : ");
		System.out.println("number1="+numbers[0]+",number2="+numbers[1]);
	}
	private static void callbyvalue(int a,int b){
		int temp = a;
		a=b;
		b=temp;
		System.out.println("After Swapping values are:");
		System.out.println("a="+a+",b="+b);
	}
	private static void callbyreference(int numbers[]){
		int temp = numbers[0];
		numbers[0] = numbers[1];
		numbers[1] = numbers[0];
        }
}
