package OOPSLab.PracticeSheet2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student{
  int rollno;
  String name;
  int age;
  String _class_;
}

public class StudentDatabase {
    public static Student Get_Student_Info(){
      Scanner scan = new Scanner(System.in);
      Student stud = new Student();
      System.out.println("Enter Student Details:");
      System.out.println("Enter Name: ");
      stud.name = scan.nextLine();
      System.out.println("Enter Roll No: ");
      stud.rollno = scan.nextInt();
      System.out.println("Enter Age: ");
      stud.age = scan.nextInt();
      scan.nextLine();
      System.out.println("Enter Class: ");
      stud._class_ = scan.nextLine();
      return stud;
    }

    public static void Print_Student_Info(Student stud){
      System.out.println("Student Details:");
      System.out.println("Name: "+stud.name);
      System.out.println("Roll no: "+stud.rollno);
      System.out.println("Age: "+stud.age);
      System.out.println("Class: "+stud._class_);
    }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    List<Student> db = new ArrayList<>();
    try{
      int choice;
      do{
        System.out.println("Student Database Menu:\n 1)Create Student\n 2)Update Student\n 3)Delete Student\n 4)Show Student\n 5)Exit");
        System.out.println("Enter a choice");
        choice = scan.nextInt();
        switch(choice){
          case 1:
            Student stud = new Student();
            stud = Get_Student_Info();
            db.add(stud);
            System.out.println("Student Successfully Added");
            break;
          case 2:
            int ch;
            String updt_sname = null;
            int updt_age = 0;
            int updt_rollno =0;
            String updt_class = null;
            System.out.println("Enter Student Roll No:");
            int rollno = scan.nextInt();
            int i=0;
            for(i=0;i<db.size();i++){
              if(db.get(i).rollno == rollno){
                break;
              }
            }
            do{
              System.out.println("Choose the fields you want to update:\n 1)Name\n 2)Roll No\n 3)Age\n 4)Class\n 5)Exit");
              System.out.print("Enter the choice: ");
              ch = scan.nextInt();
              switch(ch){
                case 1:
                  System.out.println("Enter Name:");
                  scan.nextLine();
                  updt_sname = scan.nextLine();
                  break;
                case 2:
                  System.out.println("Enter Roll No:");
                  updt_rollno = scan.nextInt();
                  break;
                case 3:
                  System.out.println("Enter Age:");
                  updt_age = scan.nextInt();
                  break;
                case 4:
                  System.out.println("Enter Class:");
                  scan.nextLine();
                  updt_class = scan.nextLine();
                  break;
                default:
                  break;
              }
            }while(ch!=5);
            if(updt_sname!=null){
              db.get(i).name = updt_sname;
            }
            if(updt_class!=null){
              db.get(i)._class_ = updt_class;
            }
            if(updt_age !=0){
              db.get(i).age = updt_age;
            }
            if(updt_rollno !=0){
              db.get(i).rollno = updt_rollno;
            }
            System.out.println("Student Record Updated");
            break;
          case 3:
            System.out.print("Enter the Student Roll No:");
            rollno = scan.nextInt();
            for(i=0;i<db.size();i++){
              if(db.get(i).rollno == rollno){
                break;
              }
            }
            db.remove(i);
            System.out.println("Student Sucessfully Deleted");
            break;
          case 4:
            for(i=0;i<db.size();i++){
              Print_Student_Info(db.get(i));
            }
            break;
          default:
            break;
        }
      }while(choice!=5);
    }finally{
      if(scan!=null){
        scan.close();
      }
    }
  }
}
