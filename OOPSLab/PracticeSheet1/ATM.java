package OOPSLab.PracticeSheet1;
import java.util.Scanner;
public class ATM{
  float balance;
  String name;
  int age;
  int accno;
  int password;

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    try{
      int choice;
      ATM obj = null;
      do {
        System.out.println("ATM:\n 1)Create Account\n 2)Withdraw\n 3)Deposit\n 4)Show Info\n 5)Exit");
        System.out.print("Enter your choice:");
        choice = scan.nextInt();
        scan.nextLine();
        switch (choice) {
          case 1:
            System.out.println("Enter name:");
            String name = scan.nextLine();
            System.out.println("Enter age:");
            int age = scan.nextInt();
            System.out.println("Enter Acc No:");
            int accno = scan.nextInt();
            System.out.println("Enter Password:");
            int password = scan.nextInt();
            obj = CreateAccount(name , age, accno, password);
            System.out.println("Account Successfully Created!!");
            System.out.println("Account Details:");
            ShowInfo(accno, password, obj);
            break;
          case 2:
            if(obj!=null){
              System.out.println("Enter Acc No:");
              accno = scan.nextInt();
              System.out.println("Enter Password:");
              password = scan.nextInt();
              System.out.println("Enter Ammount:");
              float amt = scan.nextFloat();
              Withdraw(accno, password, amt , obj);
              System.out.println("Balance: "+obj.balance);
            }else{
              System.out.println("Create an account first!!");
            }
            break;
          case 3:
            if(obj!=null){
              System.out.println("Enter Acc No:");
              accno = scan.nextInt();
              System.out.println("Enter Password:");
              password = scan.nextInt();
              System.out.println("Enter Ammount:");
              float amt = scan.nextFloat();
              Deposit(accno, password, amt , obj);
              System.out.println("Balance: "+obj.balance);
            }else{
              System.out.println("Create an account first!!");
            }
            break;
          case 4:
            System.out.println("Enter Acc No:");
            accno = scan.nextInt();
            System.out.println("Enter Password:");
            password = scan.nextInt();
            ShowInfo(accno, password, obj);
            break;
          default:
            break;
        }
      } while(choice!=5);

    }
    finally{
      if(scan!=null){
        scan.close();
      }
    }
  }

  private static ATM CreateAccount(String name , int age , int accno , int password){
    ATM obj = new ATM();
    obj.name = name;
    obj.age = age;
    obj.accno = accno;
    obj.password = password;
    return obj;
  }

  private static void Withdraw(int accno , int password , float amt , ATM obj){
    if(obj.password == password){
      obj.balance = obj.balance - amt;
    }else{
      return;
    }
  }

  private static void Deposit(int accno , int password , float amt , ATM obj){
    if(obj.password == password){
      obj.balance = obj.balance + amt;
    }else{
      return;
    }
  }

  private static void ShowInfo(int accno , int password , ATM obj){
    if(obj.password == password){
      System.out.println("Name: "+obj.name);
      System.out.println("Age: "+obj.age);
      System.out.println("Account No: "+obj.accno);
      System.out.println("Balance: "+obj.balance);
    }else{
      return;
    }
  }
}
