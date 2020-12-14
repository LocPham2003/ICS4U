import java.util.*;

class Circle{
    double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return Math.pow(this.radius, 2) * Math.PI;
    }

    public double getRadius() {
        return radius;
    }
}

class Disk extends Circle{
    double thickness;

    public Disk(double radius, double thickness) {
        super(radius);
        this.thickness = thickness;
    }

    public double getVolume(){
       return super.getRadius() * this.thickness;
    }
}

public class SomeTest {
    public static void main (String [] args) {
      Circle circle = new Circle(10);

      System.out.println(circle.getRadius());

      Circle circle1 = new Disk(10,12);

    }
}