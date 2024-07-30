import java.util.*;
import classes.*;
public class missingrange{
  public static int miss(int[] a){
    int n =  a.length+1;
    int sum = (n*(n+1))/2;
    for(int i=0;i<a.length;i++){
      sum = sum - a[i];
    }
    return sum;
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no upto which you want to find missing number from series");
    int b = sc.nextInt();
    int a[] = new int[(b-1)];
    System.out.println("Now Enter elements from 0 to "+b+" and it will find missing number from series");
    for(int i = 0;i<a.length;i++){
      System.out.println("Enter element for "+i+" :");
      a[i]=sc.nextInt();
    }
    parray p = new parray();
    p.print(a);
    int c = miss(a);
    System.out.println("Missing number from the series is :"+c);
  }
}

