import java.util.*;
public class rei{
  public static void parray(int[] a){
    int n = a.length;
    for(int i=0;i<n;i++){
      if(i == 0){
        System.out.print("{ "+a[i]+" ");
      }
      else if(i==(n-1)){
        System.out.print(a[i]+" }");
      }
      else{
        System.out.print(a[i]+" ");
      }
    }
    System.out.println(" ");
  }
  public static int[] removeeven(int[] a){
    int odd=0;
    for(int i = 0; i<a.length;i++){
      if(a[i]%2!=0){
        odd++;
      }
    }
    int result[] = new int[odd];
    int r=0;
    for(int i = 0;i<a.length;i++){
      if(a[i]%2!=0){
        result[r]=a[i];
        r++;
      }
    }
    return result;
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no of elements you want in your array");
    int b =  sc.nextInt();
    int a[] = new int[b];
    for(int i = 0;i<b;i++){
      System.out.println("Enter element "+i);
      a[i]= sc.nextInt();
    }
    System.out.println("Your array is");
    parray(a);
    System.out.println("Now even elements will be removed");
    int c[] = removeeven(a);
    parray(c);
  }
}

