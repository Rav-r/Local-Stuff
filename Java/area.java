import java.util.*;
class area {
	public static void main(String args[]){
		double s, l, b, h;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the area you want me to calculate");
		System.out.println("1. Square");
		System.out.println("2. Rectangle");
		System.out.println("3. Cuboid");
		System.out.print("Here : ");
		int c = sc.nextInt();
		if(c == 1){
			System.out.print("Enter the side of the square : ");
			s = sc.nextDouble();
			calcarea obj = new calcarea(s);
			obj.display();
		}
		else if(c==2){
			System.out.print("Enter the length of the rectangle : ");
			l = sc.nextDouble();
			System.out.print("Enter the breadth of the rectangle : ");
			b = sc.nextDouble();
			calcarea obj = new calcarea(l, b);
			obj.display();
		}
		else if(c == 3){
			System.out.print("Enter the length of the cuboid : ");
			l = sc.nextDouble();
			System.out.print("Enter the breadth of the cuboid : ");
			b = sc.nextDouble();
			System.out.print("Enter the height of the cuboid : ");
			h = sc.nextDouble();
			calcarea obj = new calcarea(l, b, h);
			obj.display();
		}
		else{
			System.out.println("Invalid choice");
		}
	}
}
class calcarea {
	private double s, l, b, h;
	calcarea(double s){
		this.s = s;
	}
	calcarea(double l, double b){
		this.l = l;
		this.b = b;
	}
	calcarea(double l, double b, double h){
		this.l = l;
		this.b = b;
		this.h = h;
	}
	void display(){
		if(s!=0){
			System.out.println("The area of the square is : "+(s*s));
		}
		else if(l!=0 && b!=0 && h==0){
			System.out.println("The area of the rectangle is :" +(l*b));
		}
		else if(l!=0 && b!=0 && h!=0){
			System.out.println("The area of the cuboid is : "+(2*(l*b+b*h+h*l)));
		}
		else{
			System.out.println("Fuck yourself");
		}
	}
}


