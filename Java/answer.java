import java.lang.*;
import java.util.*;
import myinter.*;
class answer implements con{
  static void solution(int result){
    switch(result){
      case No:
        System.out.println("No");
        break;
      case Yes:
        System.out.println("Yes");
        break;
      case Maybe:
        System.out.println("Maybe");
        break;
      case soon:
        System.out.println("Soon");
        break;
      case never:
        System.out.println("Never");
        break;
    }
  }
  public static void main(String args[]){
    question q = new question();
    solution(q.ask());
    solution(q.ask());
    solution(q.ask());
    solution(q.ask());
    solution(q.ask());
  }
}




