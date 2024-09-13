package OOPSLab.PracticeSheet1;
import java.util.Scanner;
public class Reversenumber {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    try{
      int num;
      System.out.println("Enter a number:");
      num = scan.nextInt();
      int revnum = ReverseNum(num);
      System.out.println("Reversed Number: "+revnum);
    }
    finally{
    if(scan!=null){
        scan.close();
    }
    }
  }
  public static int ReverseNum(int num){
    int rev_num = 0;
    int digit = 0;
    while(num>0){
      digit = num%10;
      rev_num = rev_num*10 + digit;
      num = num/10;
    }
    return rev_num;
  }
}
