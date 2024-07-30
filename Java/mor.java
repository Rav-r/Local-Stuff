import java.util.function.*;
import java.util.*;
import java.lang.System;
public class mor{
  public static void main(String args[]){
    int a;
    Scanner sc = new Scanner(System.in);
    out.print("Provide value for a");
    a= sc.nextInt();
    out.print("provide value for b");
    int b = sc.nextInt();
    Function<Integer,Integer> j = (aa,ab)-> a+b;
    out.print(j);
  }
}
  

