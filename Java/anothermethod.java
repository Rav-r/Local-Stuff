import java.lang.*;
import java.util.*;
public class anothermethod{
  public void m(){
    System.out.println("hello m");
  }
  public void n(){
    System.out.println("hello n");
    this.m();
  }
  public static void main(String args[]){
    anothermethod obj = new anothermethod();
    obj.n();
  }
}
