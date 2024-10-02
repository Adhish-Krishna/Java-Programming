package OOPSLab.PracticeSheet2;

import java.util.Scanner;

public class VehicleParking {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    try{
      System.out.println("Parking System");
      int choice;
      ParkingLot lot = new ParkingLot();
      for(int i=0;i<lot.lot.length;i++){
        for(int j=0;j<lot.lot.length;j++){
          lot.lot[i][j] = false;
        }
      }
      do {
        System.out.println("1)Search for free space\n2)Exit");
        choice  = scan.nextInt();
        switch(choice){
          case 1:
            int[] lotspace = SearchFreespace(lot);
            if(lotspace[0]!=-1){
              System.out.println("A free space is found at "+lotspace[0]+"th row "+lotspace[1]+"th column");
            }else{
              System.out.println("No free slots are found!!");
            }
            break;
          default:
            break;
        }
      } while (choice!=2);

    }finally{
      if(scan != null){
        scan.close();
      }
    }

  }
  public static int[] SearchFreespace(ParkingLot obj){
    int[] freespace = new int[2];
    int i=0;
    boolean isfree = false;
    for(i=0;i<obj.lot.length;i++){
      int j=0;
      for(j=0;j<obj.lot.length;j++){
        if(obj.lot[i][j] == false){
          freespace[0] = i;
          freespace[1] = j;
          obj.lot[i][j] = true;
          isfree = true;
          break;
        }
      }
      if(isfree){
        break;
      }
    }
    if(isfree){
      return freespace;
    }
    freespace[0] = -1;
    freespace[1] = 1;
    return freespace;
  }
}

class ParkingLot{
  boolean[][] lot = new boolean[10][10];
}
