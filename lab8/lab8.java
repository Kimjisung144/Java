interface Movable
{
    public void move(int x,int y);
}
interface Area
{
    public void getArea();
}
class Shape implements Movable
{
    private int x,y;
    public void move(int x, int y)
    {
        this.x += x;
        this.y += y;
    }
    public void getArea()
    {
        
    }
}
class Rectangle extends Shape
{

}

class Triangle extends Shape
{

}
class Circle extends Shape
{
    private int radius;
    void getArea()
    {

    }

}

public class lab8 {
    public static void main(String[] args)
    {

    }
}
