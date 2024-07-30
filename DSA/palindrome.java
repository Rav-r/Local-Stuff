import java.util.*;
public class palindrome{
  public static boolean palindrome(String w){
    char[] c = w.toCharArray();
    int start = 0;
    int end =  w.length()-1;
    for(;start<end;){
      if(c[start]!=c[end]){
        return false;
      }
      start++;
      end--;
    }
    return true;
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the word");
    String word = sc.nextLine();
    if(palindrome(word)){
      System.out.println("The word "+word+" is a palindrome");
    }
    else{
      System.out.println("The word "+word+" is not a palindrome");
    }
  }
}


