import java.util.function.*;
import java.util.*;
public class cust{
  public static void main(String args[]){
    Customer b = new Customer("Dominic","9899997144");
    a.accept(b);
    c.accept(b, false);
  }
  static class Customer{
    private final String name;
    private final String number;
    Customer(String name, String number){
      this.name = name;
      this.number = number;
    }
  }
  static Consumer<Customer> a = customer -> System.out.println("Hello "+customer.name+" your phone number "+customer.number+" is registered");
   
  static BiConsumer<Customer, Boolean> c = (customer,shownum) -> System.out.println("Hello "+customer.name+" your phone number "+(shownum ? customer.number: "**********")+" is registered");

}

