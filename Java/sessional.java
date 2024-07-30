import java.util.*;
public class sessional {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the marks for your sessional");
		int s = sc.nextInt();
		System.out.print("Enter the marks of your class performance");
		int cp = sc.nextInt();
		System.out.print("Enter the marks of your attendence");
		int at = sc.nextInt();

		modify m = new modify(s);
		
		int total;

		if(s>=10){
			total = s + cp + at;
			System.out.println("Your total marks in Internals are :" + total);
		}
		else{
			total = m.increasemarks()+cp+at;
			System.out.println("Your total marks in Internals are :" + total);
		}

		
	


	}
}
class modify{
	private int s;
	modify(int s){
		this.s = s;
	}
	public int increasemarks(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the marks of your assignment :");
		int a = sc.nextInt();
		System.out.print("Enter the marks of your vivas :");
		int v = sc.nextInt();
		int s=this.s + a + v;
		return s;
	}
}

