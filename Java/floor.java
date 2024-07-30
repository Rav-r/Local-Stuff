import java.lang.*;
import java.util.*;

// To tell how much time in secs a person spends on the elevator,going from their floor to floor 0
// Each stop adds 2 seconds , going down each floor takes 3 secs , 2 secs for person getting on floor


public class floor {
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		// taking input for initial floor
	

		System.out.print("Enter the number of Floor person is on: ");
		int F= sc.nextInt();

		// taking input for no of stops

		System.out.print("Enter the number of stops you want between the floors: ");
		int N = sc.nextInt();

		// taking input for no of people on eack stop

        int time=0;


		for(int i=0;i<N;i++) {
			System.out.print("Enter the number of persons to get in for stop "+(i+1)+": ");
			int A = sc.nextInt();
			time+=A*2;
			time+=2;

		}


		//calculation of time

        
		for(;F>0;F--){
			time+=3;
		}



	    System.out.print("Person waited "+time+" seconds on the elevator");
	}
}

