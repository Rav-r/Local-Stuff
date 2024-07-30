import java.util.*;
import java.lang.*;
class sta {
  public static void main(String args[]){
    Status obj = new Status(int a,int b);
    obj.printer();
  }


}

class Status {
  int x;
  static int y;

  Status(int x, int y){
    this.x = x;
    this.y = y;
  }
  static void assign(int x,int y){
    x = 10;
    y = 20;
  }
  void printer() {
    System.out.print(x);
    System.out.print(y);
  }
}
