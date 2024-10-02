package OOPSLab.PracticeSheet2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Bill{
  String name;
  String phone_no;
  String id;
  float units;
  float amount;
}

public class ElectricityBill {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    try{
      List<Bill> bill_db = new ArrayList<>();
      System.out.println("Electricity Bill Calculator:");
      int choice;
      do{
        System.out.println("1)Create Customer\n2)Enter Units Consumed\n3)Calculate Bill\n4)Show Info\n5)Exit");
        System.out.println("Enter a choice:");
        choice = scan.nextInt();
        scan.nextLine();
        switch(choice){
          case 1:
            bill_db = EnterDetails(bill_db, scan);
            break;
          case 2:
            bill_db = EnterUnitsConsumed(bill_db, scan);
            break;
          case 3:
            bill_db = calculateBillforSingleCustomer(bill_db, scan);
            break;
          case 4:
            ShowInfo(bill_db, scan);
            break;
          default:
            System.out.println("Invalid Choice!!");
            break;
        }
      }while(choice!=5);

    }finally{
      if(scan != null){
        scan.close();
      }
    }
  }

  public static List<Bill> EnterDetails(List<Bill> bill_db, Scanner scan){
    Bill bill = new Bill();
    System.out.println("Enter Name:");
    String name = scan.nextLine();
    System.out.println("Enter Phone Number:");
    String phno = scan.nextLine();
    System.out.println("Enter ID:");
    String id = scan.nextLine();
    bill.name = name;
    bill.phone_no = phno;
    bill.id = id;
    bill_db.add(bill);
    System.out.println("Customer Successfully Created");
    return bill_db;
  }

  public static List<Bill> EnterUnitsConsumed(List<Bill> bill_db , Scanner scan){
      System.out.println("Enter ID:");
      String id = scan.nextLine();
      int i=0;
      boolean isfound = false;
      for(i=0;i<bill_db.size();i++){
        if(bill_db.get(i).id.equals(id)){
          isfound = true;
          break;
        }
      }
      if(isfound){
        System.out.println("Enter the units consumed:");
        float units = scan.nextFloat();
        bill_db.get(i).units = units;
      }
      else{
        System.out.println("Enter Correct ID!!");
      }
      return bill_db;
  }

  public static List<Bill> calculateBillforSingleCustomer(List<Bill> bill_db , Scanner scan){
      System.out.println("Enter ID:");
      String id = scan.nextLine();
      int i=0;
      boolean isfound = false;
      for(i=0;i<bill_db.size();i++){
        if(bill_db.get(i).id.equals(id)){
          isfound = true;
          break;
        }
      }
      if(isfound){
        float units = bill_db.get(i).units;
        float amount = Calculate(units);
        bill_db.get(i).amount = amount;
        System.out.println("Bill Calculated!!");
      }
      else{
        System.out.println("Enter Correct ID!!");
      }
      return bill_db;
  }

  public static void ShowInfo(List<Bill> bill_db , Scanner scan){
      System.out.println("Enter the ID:");
      String id = scan.nextLine();
      int i=0;
      boolean isfound = false;
      for(i=0;i<bill_db.size();i++){
        if(bill_db.get(i).id.equals(id)){
          isfound = true;
          break;
        }
      }
      if(isfound){
        System.out.println("Bill Details:");
        System.out.println("Customer Name:"+bill_db.get(i).name);
        System.out.println("Customer Phone Number:"+bill_db.get(i).phone_no);
        System.out.println("Customer ID:"+bill_db.get(i).id);
        System.out.println("Units Consumed:"+bill_db.get(i).units);
        System.out.println("Bill Amount"+bill_db.get(i).amount);
      }else{
        System.out.println("Enter the ID correctly");
      }
  }

  public static float Calculate(float units){
    float amount = units*5;
    return amount;
  }
}
