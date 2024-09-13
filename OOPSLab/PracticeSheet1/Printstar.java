package OOPSLab.PracticeSheet1;
import java.util.Scanner;
public class Printstar {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    try{
      int n;
      System.out.println("Enter a number n:");
      n = scan.nextInt();
      PrintStarPattern(n);

    }
    finally{
      if(scan!=null){
        scan.close();
      }
    }
  }

  public static void PrintStarPattern(int n){
    for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){
        System.out.print("*");
      }
      System.out.print("\n");
    }
  }
}
