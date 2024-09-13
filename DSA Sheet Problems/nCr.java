public class nCr {
  public static void main(String[] args) {
    int n = 10;
    int r = 9;
    int NCR = (int)(factorial(n)/(factorial(r)*factorial(n-r)))%1000000007;
    System.out.println(NCR);

  }

  public static Long factorial(int num){
    if(num == 0){
      return 1L;
    }
    Long fact=1L;
    for(int i=num; i>0;i--){
      fact = fact*i;
    }
    System.out.println("Factorial of "+num+" is "+fact);
    return fact;
  }

}
