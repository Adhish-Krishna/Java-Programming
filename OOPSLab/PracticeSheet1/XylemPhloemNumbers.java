package OOPSLab.PracticeSheet1;

import java.util.Scanner;

public class XylemPhloemNumbers {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    try{
      System.out.println("Enter a number n:");
      int n = scan.nextInt();
      if(isXylemNumber(n)){
        System.out.println("The number is a Xylem Number");
      }else{
        System.out.println("The number is a Phloem Number");
      }
    }
    finally{
      if(scan!=null){
        scan.close();
      }
    }
  }

  public static boolean isXylemNumber(int n){
    int last_digit = n%10;
    int first_digit=0;
    int mid_sum=0;
    int digit = 0;
    n = n/10;
    while(n>0){
      digit = n%10;
      if(n<10){
        first_digit = n;
      }else{
        mid_sum += digit;
      }
      n = n/10;
    }
    System.out.println("The first digit is: "+first_digit);
    System.out.println("The last digit is: "+last_digit);
    System.out.println("The mean sum is: "+mid_sum);
    if((first_digit+last_digit) == mid_sum){
      return true;
    }
    return false;
  }
}
