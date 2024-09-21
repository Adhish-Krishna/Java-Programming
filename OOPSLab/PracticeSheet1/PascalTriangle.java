package OOPSLab.PracticeSheet1;

import java.util.Scanner;

public class PascalTriangle {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    try{
      int n;
      System.out.println("Enter the number n:");
      n = scan.nextInt();
      System.out.println("Left Pascal Triangle:");
      LeftTriangle(n);
      System.out.println("Right Pascal Triangle:");
      RightTriangle(n);
    }
    finally{
      if(scan!=null){
        scan.close();
      }
    }
  }

  public static void LeftTriangle(int n){
    for(int i=n;i>=0;i--){
      for(int j = i-1;j>=0;j--){
        System.out.print(" ");
      }
      for(int j = i; j<=n;j++){
        System.out.print("*");
      }
      System.out.print("\n");
    }
    for(int i=0;i<n;i++){
      for(int j=0;j<=i;j++){
        System.out.print(" ");
      }
      for(int j = n; j>i;j--){
        System.out.print("*");
      }
      System.out.print("\n");
    }
  }

  public static void RightTriangle(int n){
    for(int i=0;i<=n;i++){
      for(int j=0;j<=i;j++){
        System.out.print("*");
      }
      System.out.print("\n");
    }
    for(int i=n;i>=0;i--){
      for(int j=0;j<i;j++){
        System.out.print("*");
      }
    System.out.print("\n");
  }
}
}
