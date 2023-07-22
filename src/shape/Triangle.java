package shape;

public class Triangle extends Shape{

    @Override
    public void calculateArea() {
        double a=7.5;
        double b=4.4;
        double c =9.6;
        double p=(a+b+c)/2;
        double s =p*(p-a)*(p-b)*(p-c);
        System.out.println(Math.sqrt(s));


    }

    @Override
    public void calculatePerimeter() {


    }
}
