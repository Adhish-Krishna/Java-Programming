interface Area {
  double CalculateArea();
}

class Circle implements Area{
  private final double radius;
  public Circle(double radius){
    this.radius = radius;
  }
  @Override
  public double CalculateArea(){
    return Math.PI*(this.radius)*(this.radius);
  }
}

class Square implements Area{
  private final double side;
  public Square(double side){
    this.side = side;
  }
  @Override
  public double CalculateArea(){
    return this.side*this.side;
  }
}

class Triangle implements Area{
  private final double base , height;
  public Triangle(double base , double height){
    this.base = base;
    this.height = height;
  }
  @Override
  public double CalculateArea(){
    return (0.5)*this.base*this.height;
  }
}

public class Main {
  public static void main(String[] args) {
    Circle circle = new Circle(5.0);
    System.out.println("Area of the circle: " + circle.CalculateArea());

    Square sq = new Square(8.99);
    double area = sq.CalculateArea();
    System.out.println("Area of Square: "+area);

    Triangle tr = new Triangle(4.56 , 8.97);
    double tr_area = tr.CalculateArea();
    System.out.println("Area of Triangle: "+tr_area);
  }
}
