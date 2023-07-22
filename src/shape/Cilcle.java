package shape;

public class Cilcle extends Shape{

    @Override
    public void calculateArea() {

    }

    @Override
    public void calculatePerimeter() {
        double pi = Math.PI;
        double radius = 4.5;
        double v = pi * (radius * radius);
        System.out.println(v);
    }
}
