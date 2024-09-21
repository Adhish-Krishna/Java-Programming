package OOPSLab.PracticeSheet1;

import java.util.Scanner;

public class SmallestLargest {
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
      System.out.println("The Maximum Value in the Array is: "+Largest(arr));
      System.out.println("The Minimum Value in the Array is: "+Smallest(arr));
    }
    finally{
      if(scan!=null){
        scan.close();
      }
    }
  }

  public static int Smallest(int[] arr){
    int min = Integer.MAX_VALUE;
    for(int i=0;i<arr.length;i++){
      if(arr[i]<min){
        min = arr[i];
      }
    }
    return min;
  }

  public static int Largest(int[] arr){
    int max = Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
      if(arr[i]>max){
        max = arr[i];
      }
    }
    return max;
  }
}
