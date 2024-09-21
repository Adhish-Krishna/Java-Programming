package OOPSLab.PracticeSheet1;

import java.util.Scanner;

public class Sorting {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    try{
      System.out.println("Enter the size of the array:");
      int arrSize = scan.nextInt();
      int arr[] = new int[arrSize];
      System.out.println("Enter the elements for the array:");
      for(int i=0;i<arrSize;i++){
        arr[i] = scan.nextInt();
      }
      System.out.println("Choose an option to sort:\n 1)Ascending\n 2)Descending");
      int choice = scan.nextInt();
      boolean reverse;
      if(choice==1){
        reverse = false;
      }else{
        reverse = true;
      }
      arr = Sort(arr,reverse);
      System.out.println("Sorted Array:");
      for(int i:arr){
        System.out.print(i+" ");
      }
    }
    finally{
      if(scan!=null){
        scan.close();
      }
    }
  }

  public static int[] Sort(int[] arr , boolean reverse){
    for(int i=1;i<arr.length;i++){
      int key = arr[i];
      int j=i-1;
      if(reverse){
        while(j>=0 && arr[j]<key){
          arr[j+1] = arr[j];
          j--;
        }
        arr[j+1] = key;
      }else{
        while(j>=0 && arr[j]>key){
          arr[j+1] = arr[j];
          j--;
        }
        arr[j+1] = key;
      }
    }
    return arr;
  }
}
