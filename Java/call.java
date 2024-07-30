import java.lang.*;
public class call {
	private String name;
	private int age;

	public call (String name , int age){
		this.name = name;
		this.age = age;
	}
	public void info() {
		System.out.println(this.name + " is " + this.age + " years old");
	}
	public void check() {
		if(this.age >= 18){
			System.out.println(this.name + " is eligible for a russian");
		}
		else {
			System.out.println(" Ja munna ja dudh pike soja");
		}
	}
}
