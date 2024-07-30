import java.util.*;
import classes.*;
import classes.ll.node;

public class sinll{
  public static void main(String args[]){
    ll n = new ll();
    n.head = new node(10);
    node a = new node(2);
    node b=new node(4);
    node c = new node(6);
    n.head.next = a;
    a.next = b;
    b.next = c;
  }
}
