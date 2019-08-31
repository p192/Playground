import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Student s=new Student();
    System.out.println("Registration");
    System.out.println("Enter your name");
    System.out.println("Enter your address");
    System.out.println("Contact Number");
    System.out.println("E-Mail ID");
    System.out.println("Enter proof type");
    System.out.println("Enter proof id");
    System.out.println("Customer Details");
    System.out.println(s.name);
    System.out.println(s.address);
    System.out.println(s.number);
    System.out.println(s.email_id);
    System.out.println(s.proof_type);
    System.out.println(s.proof_id);
   System.out.println("Thank you for registering. Your id is 1...");
  }
}

class Student
{
  Scanner sc=new Scanner(System.in);
  String name=sc.nextLine();
  String address=sc.nextLine();
  String number=sc.nextLine();
  String email_id=sc.nextLine();
  String proof_type=sc.nextLine();
  String proof_id=sc.nextLine();
  void read()
  {
    //System.out.println("Registration");
  }
  void write()
  {
   // System.out.println("Thank you for registering. Your id is 1...");
  }
}
