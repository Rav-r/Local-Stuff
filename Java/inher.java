import java.util.*;
import java.lang.*;
class inher {
  public static void main(String args[]){
    student s = new student("Brian", 20, 53, 001, 95);
    s.display();

  

  }
}
class person {
  String name;
  int age;
  int weight;
  person(String name, int age, int weight){
    this.name = name;
    this.age = age;
    this.weight = weight;
  }
  void display(){
    System.out.println("Name: "+name+" Age: "+age+" Weight: "+weight);
  }
}
class student extends person {
  int rollno;
  int marks;
  student(String name, int age, int weight, int rollno, int marks){
    super(name, age, weight);
    this.rollno = rollno;
    this.marks = marks;
  }
  void display(){
    super.display();
    System.out.println("Roll No: "+rollno+" Marks: "+marks);
  }
}
