package src;
public class Circle {
    private int radius;
    public Circle()
    {
        this.radius = 0;
    }
    public Circle(int r)
    {
        this.radius = r;
    }
    public String toString()
    {
        return "Circle[radius="+radius;
    }
    public void set_radius(double a)
    {
        this.radius = (int)a;
    }
}
