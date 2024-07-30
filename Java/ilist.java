import java.lang.*;
import java.util.*;
public class ilist {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    item obj = new item();
    obj.Showgrocery();
    int ch;
    do{
      System.out.println("1. Add Item to Shopping list");
      System.out.println("2. Remove Item from Shopping list");
      System.out.println("3. Show your Shopping list");
      System.out.println("4. Calculate total price of Shopping list");
      System.out.println("5. Exit");
      System.out.print("Enter your choice: ");
      ch = sc.nextInt();
      switch(ch){
        case 1:
          System.out.println("Enter the item to add: ");
          shop s = shop.valueOf(sc.next());
          System.out.println("Enter the quantity: ");
          int q = sc.nextInt();
          obj.additem(s, q);
          break;
        case 2:
          System.out.println("Enter the item to remove: ");
          s = shop.valueOf(sc.next());
          obj.removeitem(s);
          break;
        case 3:
          obj.showshoppinglist();
          break;
        case 4:
          obj.totalprice();
          break;
        case 5:
          System.exit(0);
          break;
        default:
          System.out.println("Invalid choice");
      }
    }while(ch!=5);
  }
}
class item {
  HashMap<shop, Integer> groceries = new HashMap<>();
  HashMap<shop, Integer> cart = new HashMap<>();
  item(){
    groceries.put(shop.Pen, 20);
    groceries.put(shop.Pencil, 10);
    groceries.put(shop.Heavydutypen, 70);
    groceries.put(shop.Headphones, 4000);
    groceries.put(shop.Mobile_Phone, 15000);
    groceries.put(shop.Laptop, 56000);
    groceries.put(shop.Pulse_Notebook, 150);
    groceries.put(shop.Bag, 670);
    groceries.put(shop.Glasses, 1111);
  }
  void Showgrocery(){
    groceries.forEach((a, b) -> System.out.println("Item : "+a + " Price: " + b));
  }
  void additem(shop s, int q){
    if(groceries.containsKey(s)){
      cart.put(s, q);
      System.out.println("Item added "+s+ " Quantity: "+q);
    }
    else{
      System.out.println("Item not available");
    }
  }
  void removeitem(shop s){
    if(cart.containsKey(s)){
      cart.remove(s);
      System.out.println("Item removed "+s);
    }
    else{
        System.out.println("Item is not yet in your cart");
    }
  }
  void showshoppinglist(){
    cart.forEach((a,b) -> System.out.println("Item: "+a + " Quantity: "+b));
  }
  void totalprice(){
    int total = cart.entrySet().stream().mapToInt(entry -> groceries.get(entry.getKey()) * entry.getValue()).sum();
    System.out.println("Total price: "+total);
  }
}


enum shop {
  Pen, Pencil, Heavydutypen, Headphones, Mobile_Phone, Laptop, Pulse_Notebook, Bag, Glasses
}
