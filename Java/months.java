import java.lang.*;
import java.util.*;
public class months {
	public static void main(String args[]){

		// to find month for given day between 0 to 365 in a non leap year
		

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no of day you want to check month for: ");
		int n = sc.nextInt();

		String a[] = {"January","February","March","April","May","June","July", "August", "September","October","November","December"};
		int d[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		int i = 0;
		for(;n>0;i++){
			n-=d[i];
		}
		System.out.println(a[i-1]);
	}
}
			
