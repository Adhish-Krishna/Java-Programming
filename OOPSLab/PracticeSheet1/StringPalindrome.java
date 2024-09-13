package OOPSLab.PracticeSheet1;
import java.util.Scanner;
public class StringPalindrome {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    try{
      System.out.println("Enter a String:");
      String str = scan.nextLine();
      if(isPlindrome(str)){
        System.out.println("The string is a palindrome");
      }
      else{
        System.out.println("The string is not a palindrome");
      }
    }
    finally{
      if(scan!=null){
        scan.close();
      }
    }
  }
  public static boolean isPlindrome(String str){
    int i=0;
    int j = str.length()-1;
    while(i<=j){
      if(str.charAt(i)!=str.charAt(j)){
        return false;
      }
      i++;
      j--;
    }
    return true;
  }
}
