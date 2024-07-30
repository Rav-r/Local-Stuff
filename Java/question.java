import java.util.*;
import java.lang.*;
import myinter.con;
 class question implements con{
  Random r = new Random();
  int ask(){
    int prob = (int)(r.nextDouble()*100);
    if(prob<30){
      return No;
    }
    else if(prob<60){
      return Yes;
    }
    else if(prob<75){
      return Maybe;
    }
    else if(prob<98){
      return soon;
    }
    else{
      return never;
    }
  }
}
