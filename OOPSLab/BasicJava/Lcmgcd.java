package OOPSLab.BasicJava;
import java.util.Scanner;
public class Lcmgcd {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    try{
    int num1;
    int num2;
    System.out.println("Enter num1:");
    num1 = scan.nextInt();
    System.out.println("Enter numb2:");
    num2 = scan.nextInt();
    int lcm = LCM(num1, num2);
    int gcd = GCD(num1, num2);
    System.out.println("LCM: "+lcm+" GCD: "+gcd);
    }finally{
      if(scan!=null){
        scan.close();
      }
    }
  }

  public static int LCM(int num1 , int num2){
    int lesser;
    int greater;
    if(num1<num2){
      lesser = num1;
      greater = num2;
    }else{
      lesser = num2;
      greater = num1;
    }
    for(int i=lesser;i<=greater;i++){
      if(num1%i == 0 && num2%i==0 ){
        return i;
      }
    }
    return num1*num2;
  }

  public static int GCD(int num1 , int num2){
    if(num2==0){
      return num1;
    }
    else{
      return GCD(num2,num1%num2);
    }
  }
}
