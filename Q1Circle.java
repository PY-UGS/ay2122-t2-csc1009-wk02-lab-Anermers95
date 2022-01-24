package lab02;

public class Q1Circle {

    double radius;
    double area;
    private static final double PI = 3.14159;

    Q1Circle()
    {
        radius = 0;
        area = 0;
    }

    Q1Circle (double radius)
    {
       this.radius = radius;
    }

    double getArea()
    {
        area = radius*radius*PI; 
        return area;
    }

    void printArea()
    {
        System.out.printf("The area of circle is: %.7f",getArea());
    }
}
