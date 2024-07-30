import java.util.*;
import classes.*;
public class resize {
  public static int[] size(int[] a, int n){
    int temp[] = new int[n];
    for(int i=0;i<a.length;i++){
      temp[i]=a[i];
    }
    return temp;
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the amount of elements you want in your array");
    int s = sc.nextInt();
    int a[] = new int[s];
    for(int i=0;i<s;i++){
      System.out.println("Enter for element "+i+" :");
      a[i]=sc.nextInt();
    }
    parray p = new parray();
    System.out.println("Your array is");
    p.print(a);
    System.out.println("Enter the size you want to update in your array");
    int b = sc.nextInt();
    a=size(a,b);
    System.out.println("Array succesfully updated ...");
  }
}

