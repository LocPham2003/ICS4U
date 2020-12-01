class Circle{
    private double radius;

    Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}

public class Tests {
    public static void main(String[] args) {

        //circle is an abstract data type
        Circle circle = new Circle(4);


        System.out.println(circle.getRadius());
    }
}
