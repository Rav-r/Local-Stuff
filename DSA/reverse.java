import java.util.*;
public class reverse {
  public static void parray(int[] a) {
    for (int i = 0; i < a.length; i++) {
      if(i == 0){
        System.out.print("{ "+a[i]+" ");
      }
      else if(i == (a.length-1)){
        System.out.print(a[i]+" }");
      }
      else { 
      System.out.print(a[i] + " ");
      }
    }
    System.out.println();
  }
  public static int[] rarray(int[] a){
    int start =0;
    int end = a.length-1;
    int result[] = new int[a.length];
    for(int i=0;i<a.length;i++){
      result[start]=a[end];
      start++;
      end--;
    }
    return result;
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no of elements you want in your array");
    int b = sc.nextInt();
    int a[]=new int[b];
    for(int i=0;i<b;i++){
      System.out.println("Enter the element "+i);
      a[i] = sc.nextInt();
    }
    System.out.println("Your Array is");
    parray(a);
    System.out.println("After Reversing the following array");
    int c[] = rarray(a);
    parray(c);
  }
}



