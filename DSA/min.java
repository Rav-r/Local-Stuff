import java.util.*;
public class min{
  public static void parray(int[] a){
    for(int i=0;i<a.length;i++){
      if(i==0){
        System.out.print("{ "+a[i]+", ");
      }
      else if(i==a.length-1){
        System.out.print(a[i]+" }");
      }
      else{
        System.out.print(a[i]+", ");
      }
    }
    System.out.println();
  }
  public static int findmin(int[] a){
    int min = a[0];
    /*int sec = a[1];*/
    for(int i=1;i<a.length;i++){
      if(a[i]<min){
        min = a[i];
        /*sec = min;*/
      }
      /*else if(a[i]<sec && a[i]!=min){
        sec = a[i];
      }*/
    }
    /* 2nd method but first one is more robust
      int sec = a[0];
      for(int i=0;i<a.length;i++){
      if(a[i]==min){
        continue;
      }
      else if(a[i]<sec){
        sec = a[i];
      }
    }
    
    return sec;*/
    return min;
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements in the array: ");
    int n = sc.nextInt();
    int[] a = new int[n];
    for(int i=0;i<n;i++){
      System.out.println("Enter the element: ");
      a[i] = sc.nextInt();
    }
    System.out.println("The array is: ");
    parray(a);
    System.out.println("The minimum element in the array is: "+findmin(a));
  }
}

