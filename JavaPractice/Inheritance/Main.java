//Problem: Create a base class Vehicle with attributes like make, model, and year, and methods like startEngine and stopEngine. Then, create derived classes Car, Truck, and Motorcycle that add specific attributes and methods. For example, Car might have a method openTrunk, Truck might have a method loadCargo, and Motorcycle might have a method popWheelie. Ensure that each subclass correctly overrides the base class methods where appropriate.

class Vehicle{
  public String make;
  public String model;
  public String year;

  public Vehicle(String make , String model , String year){
    this.make = make;
    this.model = model;
    this.year = year;
  }

  public void startEngine(){
    System.out.println("Engine Started");
  }

  public void stopEngine(){
    System.out.println("Engine Stopped");
  }
}

class Car extends Vehicle{
  public int price;
  public Car(String make , String model , String year , int price){
    super(make,model,year);
    this.price = price;
  }

  @Override
  public void startEngine(){
    System.out.println("Car Engine Started");
  }

  @Override
  public void stopEngine(){
    System.out.println("Car Engine Stopped");
  }
}

class Truck extends Vehicle{
  public int price;
  public Truck(String make , String model , String year , int price){
    super(make,model,year);
    this.price = price;
  }

  @Override
  public void startEngine(){
    System.out.println("Truck Engine Started");
  }

  @Override
  public void stopEngine(){
    System.out.println("Truck Engine Stopped");
  }
}

public class Main{
  public static void main(String[] args) {
      Car car = new Car("Audi" , "Q6" , "2024" , 2000000000);
      Truck truck = new Truck("Ashok Leyland" , "T7" , "2021" , 2345612);
      System.out.println(car.make+"\n"+car.model);
      System.out.println(truck.make+"\n"+truck.model);
  }
}
