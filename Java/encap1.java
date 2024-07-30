import java.util.*;
public class encap1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the height of the box: ");
		double a = sc.nextInt();
		System.out.print("Enter the width of the box: ");
		double b = sc.nextInt();
		System.out.print("Enter the depth of the box: ");
		double c = sc.nextInt();
		box b1 = new box(a,b,c);
		System.out.println("The volume of the box is: " + b1.volume());
		System.out.println("The area of the box is: " + b1.area());


	}

}


class box {
	private double height;
	private double width;
	private double depth;
	public box(double a, double b, double c) {
		height = a;
		width = b;
		depth = c;
	}
	public double volume() {
		return height*width*depth;
	}
	public double area() {
		return 2*(height*width + width*depth + depth*height);
	}
}

