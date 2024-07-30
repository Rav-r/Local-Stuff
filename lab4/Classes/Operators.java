import java.util.*;
import static java.lang.System.*;
public class Operators{
    public static void main(String args[]){
        int a;
        int t;
        float b;
        float c;
        Scanner sc = new Scanner(System.in); 
        out.println("Enter an Integer a : ");
        a = sc.nextInt();
        out.println("Enter another integer t : ");
        t = sc.nextInt();
        out.println("Result for a+t : "+(a+t));
        out.println("Result for a-t : "+ (a-t));
        out.println("Result for a/t : "+ (a/t));
        out.println("Result for a*t : "+ (a*t));

        out.println("Enter a Float b : ");
        b = sc.nextFloat();
        out.println("Enter another Float c : ");
        c = sc.nextFloat();

        out.println("Result for b+c : "+(b+c));
        out.println("Result for b-c : "+ (b-c));
        out.println("Result for b/c : "+ (b/c));
        out.println("Result for b*c : "+ (b*c));

        
    }
}
