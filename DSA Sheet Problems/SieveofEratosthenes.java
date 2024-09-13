public class SieveofEratosthenes {
  public static void main(String[] args) {
    int num = 20;
    SOE(num);
  }

  public static void SOE(int num){
    boolean[] array = new boolean[num];
    for(int i=0;i<num;i++){
      array[i] = true;
    }
    int n = 2;
    while(n*n <=num){
      for(int i=2; n*i<num; i++){
        array[n*i] = false;
      }
      n++;
    }
    for(int i=2;i<num;i++){
      if(array[i]){
        System.out.println(i);
      }
    }
  }
}
