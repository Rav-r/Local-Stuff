import java.util.*;
import java.lang.*;
public class time {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the time in hour and minutes for trip Rohtak to tiruvanthpuram");

    int h=sc.nextInt();
    int m=sc.nextInt();;
    System.out.println(h+" hours and "+m+" minutes");
    System.out.println("Enter the time in hours and minutes for trip Queens to Oklahoma");
    int h1= sc.nextInt();
    int m1 = sc.nextInt();

    System.out.println(h1+" hours and "+m1+" minutes");

    timing rt = new timing(h,m);
    timing qo = new timing(h1,m1); 
    timing sum = rt.add(qo);
    System.out.println("Total time for both the trips is "+sum.hour+" hours and "+sum.min+" minutes");
  }

}
class timing{
  int hour;
  int min;
  timing(int hour , int min){
    this.hour = hour;
    this.min = min;
  }
  public timing add(timing other){
    this.hour = this.hour + other.hour + (this.min + other.min)/60;
    this.min = (this.min+other.min)%60;
    return new timing(this.hour, this.min);
  }
};


