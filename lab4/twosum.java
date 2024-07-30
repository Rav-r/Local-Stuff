import java.util.*;
import Classes.*;
public class twosum{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out
            .println("Enter the Size for you array");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Now enter the elements in your array");
        for(int i = 0;i<n;i++){
            System.out.println("Enter the "+(i+1)+"th element: ");
            a[i] = sc.nextInt();

        }

        parray p = new parray();
        p.print(a);
        System.out.println("Now enter the target element ");
        int target = sc.nextInt();
        int b[] = sum(a,target);
        p.print(b);
        System.out.println("Sum of elements at these two indices provide our target");

    }
    public static int[] sum(int[] a, int target){
        int x = 0,y = 0;
        int[] arr = new int[2];
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<a.length;j++){
                if(target == a[i] + a[j]){
                    x = j;
                    y = i;
                }
            }
        }
        arr[0] = x;
        arr[1] = y;
        return arr;
    }
}
