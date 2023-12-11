package src;

public class circle implements getInfo{
    double radius;
    public circle(double radius)
    {
        this.radius = radius;
    }
    public double perimeter()
    {
        return 2*3.141592*radius;
    }
    public double area()
    {
        return 3.141592*radius*radius;
    }
}
