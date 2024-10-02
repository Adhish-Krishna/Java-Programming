package OOPSLab.PracticeSheet2;
import java.util.Scanner;

public class Robot {
  String name;
  int batterLevel = 0;
  boolean isPowerOn = false;
  int xPosition = 0;
  int yPosition = 0;
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    try{
      Robot obj = new Robot();
      int choice;
      do{
        System.out.println("Robot:\n1)Power On\n2)Power Off\n3)Recharge\n4)Move\n5)Get Battery level\n6)Get Position\n7)Exit");
        System.out.println("Enter a choice:");
        choice = scan.nextInt();
        if(obj.batterLevel>=1 || choice == 3){
        switch(choice){
          case 1:
            powerOn(obj);
            obj.batterLevel -= 1;
            break;
          case 2:
            powerOff(obj);
            obj.batterLevel -= 1;
            break;
          case 3:
            reCharge(obj);
            obj.batterLevel -= 1;
            break;
          case 4:
            if(obj.isPowerOn){
            System.out.println("Choose a direction to move:\n1)Top\n2)Bottom\n3)Left\n4)Right");
            int direction_ch = scan.nextInt();
            String direction = null;
            switch(direction_ch){
              case 1:
                direction = "top";
                break;
              case 2:
                direction = "bottom";
                break;
              case 3:
                direction = "left";
                break;
              case 4:
                direction = "right";
                break;
              default:
                break;
            }
            move(obj, direction);
            obj.batterLevel -= 1;
            }else{
              System.out.println("Please turn on the robot");
            }
            break;
          case 5:
            getBatteryLevel(obj);
            obj.batterLevel -= 1;
            break;
          case 6:
            getPosition(obj);
            obj.batterLevel -= 1;
            break;
          default:
            break;
        }
        }else{
          System.out.println("Battery Drained!! Recharge to continue");
        }
      }while(choice!=7);

    }finally{
      if(scan!=null){
        scan.close();
      }
    }
  }

  public static void powerOn(Robot obj){
    if(obj.isPowerOn){
      System.out.println("Already thr power is on!!");
    }else{
      obj.isPowerOn = true;
      System.out.println("Robot turned on!!");
    }
  }

  public static void powerOff(Robot obj){
    if(obj.isPowerOn){
      obj.isPowerOn = false;
      System.out.println("Robot turned off!!");
    }else{
      System.out.println("Already power is off!!");
    }
  }

  public static void reCharge(Robot obj){
    System.out.println("Current Battery Level:"+obj.batterLevel);
    System.out.println("Charging .....");
    System.out.println("Charged!!");
    obj.batterLevel = 100;
    System.out.println("Current Battery Life:"+obj.batterLevel);
  }

  public static void move(Robot obj , String direction){
    switch (direction) {
      case "top":
        if(obj.yPosition>=1){
          obj.yPosition -= 1;
        }else{
          System.out.println("Cannot move further!!");
        }
        break;
      case "bottom":
        if(obj.yPosition<=8){
          obj.yPosition += 1;
        }else{
          System.out.println("Cannot move further!!");
        }
        break;
      case "left":
        if(obj.yPosition>=1){
          obj.xPosition -= 1;
        }else{
          System.out.println("Cannot move further!!");
        }
        break;
      case "right":
        if(obj.yPosition<=8){
          obj.xPosition += 1;
        }else{
          System.out.println("Cannot move further!!");
        }
        break;
      default:
        break;
    }
  }

  public static void getBatteryLevel(Robot obj){
    System.out.println("Current Battery Level: "+obj.batterLevel);
  }

  public static void getPosition(Robot obj){
    System.out.println("The robot is at "+obj.yPosition+" th row and "+obj.xPosition+" th column");
  }
}
