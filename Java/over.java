import java.util.*;
import java.lang.*;
class a{
  public void msg1(){
    System.out.println("public");
  }
  protected void msg2(){
    System.out.println("protected");
  }
  private void msg3(){
    System.out.println("private");
  }
}
public class over extends a{
  public void msg1(){
    System.out.println("overridden public");
  }
  public void msg2(){
    System.out.println("overridden protected");
  }
  public void msg3(){
    System.out.println("overridden private");
  }
  public static void main(String args[]){
    over obj= new over();
    obj.msg1();
    obj.msg2();
    obj.msg3();
  }
}
