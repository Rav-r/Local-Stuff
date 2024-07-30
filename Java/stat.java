import java.util.*;
import java.lang.*;
public class stat {
  public static void main (String args[]){
    usage obj = new usage();
    obj.input();
    obj.printer();
  }
}
class usage{

  //Declaration
  int x[] = new int[10];
  static int z;
  Scanner sc = new Scanner(System.in);


  //Constructor
  usage(){
  }

  //Inputs
  void input(){
    System.out.println("Enter the number you want me to print table of :");
    z= sc.nextInt();
  };

  //static method
  static int[] table(int z){
    for(int i = 1;i<=10;i++){
      x[i] = z*i;
    }
    return x[10];
  }

  void printer(){
    int y[] = new int[10];
    y = table();
    System.out.println("Table of your desired number is here :");
    System.out.println(y);
  }
}
    
   
