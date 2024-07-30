import java.util.*;
import java.time.*;
import java.lang.*;
public class services {
  public static void main(String[] args) {
    people jon = new people(
        "Jon Snow",
        "jonsnowfudeddany@gmail.com",
        "+919678782200",
        LocalDate.of(2003,3,21)
        );
    valid v = new valid();
    System.out.println(v.isvalid(jon));

  }
}

class people {
  private String name;
  private String email;
  private String number;
  private LocalDate dob;
  public people(String name, String email, String number, LocalDate dob){
    this.name = name;
    this.email = email;
    this.number = number;
    this.dob = dob;
  }
  public String getname() {
    return name;
  }
  public String getemail(){
    return email;
  }
  public String getnumber(){
    return number;
  }
  public LocalDate getdob(){
    return dob;
  }
}
class valid {
  private boolean isEmailValid(String email){
    return email.contains("@");
  }
  private boolean isNumberValid(String number){
    return number.startsWith("+91");
  }
  private boolean isAdult(LocalDate dob){
    return Period.between(dob,LocalDate.now()).getYears()>18;
  }
  public boolean isvalid(people p){
    return isEmailValid(p.getemail()) &&
      isNumberValid(p.getnumber()) &&
      isAdult(p.getdob());
  }
}
