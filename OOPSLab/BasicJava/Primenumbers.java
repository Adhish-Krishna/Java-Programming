package OOPSLab.BasicJava;
import java.util.Scanner;
public class Primenumbers {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    try{
    int n;
    System.out.println("Enter a number n:");
    n = scan.nextInt();
    for(int i=1;i<=n;i++){
      if(isPrime(i)){
        System.out.println(i);
      }
    }
    }finally{
      if(scan!=null){
        scan.close();
      }
    }
  }
  public static boolean isPrime(int num){
    for(int i=2;i<num;i++){
      if(num%i==0){
        return false;
      }
    }
    return true;
  }
}
