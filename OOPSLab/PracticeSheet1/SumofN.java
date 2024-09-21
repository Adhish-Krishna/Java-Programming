package OOPSLab.PracticeSheet1;

import java.util.Scanner;

public class SumofN {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    try{
      System.out.println("Enter a number n:");
      int n = scan.nextInt();
      int sum = SumofNNumbers(n);
      System.out.println("The Sum is: "+sum);
    }
    finally{
      if(scan!=null){
        scan.close();
      }
    }
  }
  public static int SumofNNumbers(int N){
    return N*(N+1)/2;
  }
}
