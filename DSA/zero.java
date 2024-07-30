import java.util.*;
public class zero {
  public static void parray(int[] a){
    for(int i =0; i<a.length; i++){
      if(i==0){
        System.out.print("{ "+a[i]+", ");
      }
      else if(i==(a.length-1)){
        System.out.print(a[i]+" }");
      }
      else{
        System.out.print(a[i]+", ");
      }
    }
    System.out.println(" ");
  }
  public static int[] move(int[] a, int b){
    int j = 0;
    for(int i =0;i<a.length;i++){
      if(a[i] != b && a[j] == b){
        int temp = a[i];
        a[i]=a[j];
        a[j]=temp;
      }
      if(a[j]!=b){
        j++;
      }
    }
    return a;
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array: ");
    int n = sc.nextInt();
    int[] a = new int[n];
    for(int i=0;i<n;i++){
      System.out.println("Enter the "+i+" element: ");
      a[i] = sc.nextInt();
    }
    System.out.println("The array is: ");
    parray(a);
    System.out.println("Enter the element you want to move to the end: ");
    int b = sc.nextInt();
    a = move(a,b);
    System.out.println("The array after moving zeros to the end is: ");
    parray(a);
  }
}
