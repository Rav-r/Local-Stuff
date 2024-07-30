import java.util.*;
import java.lang.*;
public class ret{
  public static void main(String[]  args){
    student s = student.getstudent("Adam", 20, 'a');
    System.out.println(s.getname()+" got "+s.getgrade());
  }
}
class student{
  private String name;
  private int age;
  private char grade;
  public student(String name, int age, char grade){
    this.name = name;
    this.age = age;
    this.grade = grade;
  }
  public String getname(){
    return name;
  }
  public char getgrade(){
    return grade;
  }
  public int getage(){
    return age;
  }
  public static student getstudent(String name, int age, char grade){
    return new student(name, age, grade);
  }
}
